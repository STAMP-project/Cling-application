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
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = node34.srcref(node38);
        boolean boolean40 = node34.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node8.getChildBefore(node34);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = node15.srcref(node19);
        boolean boolean21 = node19.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node3.getChildBefore(node19);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = node28.srcref(node32);
        java.lang.String str34 = node28.toString();
        node28.removeProp((int) (short) 0);
        boolean boolean37 = node28.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean42 = node41.isGetterDef();
        com.google.javascript.rhino.Node node43 = node28.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.Node node44 = node24.copyInformationFromForTree(node28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node44.getChildAtIndex(54);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = node22.srcref(node26);
        boolean boolean28 = node27.isDo();
        java.util.Set<java.lang.String> strSet29 = node27.getDirectives();
        com.google.javascript.rhino.Node node30 = node16.clonePropsFrom(node27);
        boolean boolean31 = node27.isDebugger();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = node36.srcref(node40);
        java.lang.String str42 = node36.toString();
        node36.removeProp((int) (short) 0);
        boolean boolean45 = node36.isObjectLit();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean50 = node49.isGetterDef();
        com.google.javascript.rhino.Node node51 = node36.useSourceInfoFromForTree(node49);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) 1, node51);
        com.google.javascript.rhino.Node node53 = node51.getLastChild();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node67 = node62.srcref(node66);
        java.lang.String str68 = node62.toString();
        node62.removeProp((int) (short) 0);
        boolean boolean71 = node62.isObjectLit();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean76 = node75.isGetterDef();
        com.google.javascript.rhino.Node node77 = node62.useSourceInfoFromForTree(node75);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (byte) 1, node77);
        com.google.javascript.rhino.Node node79 = node57.useSourceInfoFromForTree(node78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.replaceChild(node51, node79);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = node35.srcref(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = node44.srcref(node48);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean54 = node53.isBreak();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(4095, node35, node48, node53);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = node59.srcref(node63);
        java.lang.String str65 = node59.toString();
        node59.removeProp((int) (short) 0);
        boolean boolean68 = node59.isObjectLit();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean73 = node72.isGetterDef();
        com.google.javascript.rhino.Node node74 = node59.useSourceInfoFromForTree(node72);
        com.google.javascript.rhino.Node node75 = node55.copyInformationFromForTree(node59);
        com.google.javascript.rhino.Node node76 = node27.srcrefTree(node55);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean81 = node80.isFalse();
        java.lang.String str82 = node80.getSourceFileName();
        boolean boolean83 = node80.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node84 = node76.getChildBefore(node80);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.isDebugger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node18.removeChild(node23);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        boolean boolean19 = node16.isGetElem();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = node24.srcref(node28);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = node33.srcref(node37);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean43 = node42.isBreak();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(4095, node24, node37, node42);
        boolean boolean45 = node37.isFunction();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean50 = node49.isAnd();
        node49.setSourceFileForTesting("[PROTECTED]");
        node49.putIntProp(1, 4095);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node60 = node49.useSourceInfoFromForTree(node59);
        com.google.javascript.rhino.Node node61 = node37.copyInformationFrom(node49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.removeChild(node37);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        boolean boolean25 = node17.isFunction();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean30 = node29.isAnd();
        node29.setSourceFileForTesting("[PROTECTED]");
        node29.putIntProp(1, 4095);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node40 = node29.useSourceInfoFromForTree(node39);
        com.google.javascript.rhino.Node node41 = node17.copyInformationFrom(node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex(45);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean4 = node3.isFalse();
        com.google.javascript.rhino.Node node5 = node3.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = node14.srcref(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = node23.srcref(node27);
        boolean boolean29 = node23.isBreak();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 1, node10, node14, node23, node33, 1, (-1));
        java.lang.String str37 = node33.getQualifiedName();
        boolean boolean38 = node33.isDec();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = node42.srcref(node46);
        int int48 = node33.getIndexOfChild(node47);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean54 = node53.isDo();
        boolean boolean55 = node53.isFalse();
        com.google.javascript.rhino.Node node56 = node33.useSourceInfoFrom(node53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node5.getChildBefore(node53);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node8.isInstanceOf();
        boolean boolean32 = node8.isCase();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = jSDocInfo33.getParameterType("hi!");
        jSDocInfo33.addSuppression("hi!");
        java.lang.String str38 = jSDocInfo33.toString();
        node8.setJSDocInfo(jSDocInfo33);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = node45.srcref(node49);
        java.lang.String str51 = node45.toString();
        int int52 = node41.getIndexOfChild(node45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = node41.getJSDocInfo();
        int int54 = node41.getType();
        java.lang.String str55 = node8.checkTreeEquals(node41);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = node59.srcref(node63);
        java.lang.String str65 = node59.toString();
        node59.removeProp((int) (short) 0);
        boolean boolean68 = node59.isObjectLit();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean73 = node72.isGetterDef();
        com.google.javascript.rhino.Node node74 = node59.useSourceInfoFromForTree(node72);
        boolean boolean75 = node72.isAdd();
        boolean boolean76 = node72.isOr();
        boolean boolean77 = node72.isTry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node78 = node8.getChildBefore(node72);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setWasEmptyNode(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node27.getChildAtIndex(53);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node8.isDo();
        java.util.Set<java.lang.String> strSet10 = node8.getDirectives();
        boolean boolean11 = node8.isString();
        node8.setWasEmptyNode(false);
        boolean boolean14 = node8.isObjectLit();
        boolean boolean15 = node8.isDebugger();
        node8.removeProp((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node8.getChildAtIndex(47);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node16.useSourceInfoFrom(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node33.isFalse();
        com.google.javascript.rhino.Node node36 = node23.useSourceInfoIfMissingFrom(node33);
        boolean boolean37 = node36.isTrue();
        node36.addSuppression("NUMBER 1.0 [directives: [, hi!]]");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = node43.srcref(node47);
        boolean boolean49 = node48.isDo();
        java.util.Set<java.lang.String> strSet50 = node48.getDirectives();
        boolean boolean51 = node48.isString();
        node48.setWasEmptyNode(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable54 = node48.getAncestors();
        boolean boolean55 = node48.isNE();
        boolean boolean56 = node48.isOptionalArg();
        node48.setDouble((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node36.removeChild(node48);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 1, 38, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean27 = node26.isBreak();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(4095, node8, node21, node26);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node21.getStaticSourceFile();
        boolean boolean30 = node21.isTry();
        node21.setType(3);
        com.google.javascript.rhino.Node node33 = node3.copyInformationFrom(node21);
        node3.detachChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node3.getChildAtIndex(100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean4 = node3.isThis();
        boolean boolean5 = node3.isVoid();
        boolean boolean6 = node3.isDebugger();
        int int7 = node3.getLineno();
        boolean boolean8 = node3.isAssign();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean13 = node12.isThis();
        boolean boolean14 = node12.isVoid();
        node12.setLength(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node3.getChildBefore(node12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node8.isDo();
        java.util.Set<java.lang.String> strSet10 = node8.getDirectives();
        boolean boolean11 = node8.isString();
        node8.setWasEmptyNode(false);
        boolean boolean14 = node8.isObjectLit();
        boolean boolean15 = node8.isCall();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = node21.srcref(node25);
        java.lang.String str27 = node21.toString();
        int int28 = node17.getIndexOfChild(node21);
        boolean boolean29 = node17.wasEmptyNode();
        int int30 = node17.getCharno();
        com.google.javascript.rhino.Node node31 = node8.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("NUMBER 1.0 [directives: [, hi!]]", 51, (int) (short) 100);
        boolean boolean36 = node35.hasOneChild();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean41 = node40.isAnd();
        node40.setSourceFileForTesting("[PROTECTED]");
        node40.putIntProp(1, 4095);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node51 = node40.useSourceInfoFromForTree(node50);
        com.google.javascript.rhino.Node node52 = node35.srcrefTree(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node8.getChildBefore(node35);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean5 = node4.isVar();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean11 = node10.isDo();
        boolean boolean12 = node10.isBlock();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean17 = node16.isBreak();
        node16.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node20 = node16.cloneTree();
        com.google.javascript.rhino.Node node21 = node10.useSourceInfoIfMissingFromForTree(node16);
        boolean boolean23 = node10.getBooleanProp((int) (byte) 10);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags25 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) 1);
        sideEffectFlags25.setAllFlags();
        node10.setSideEffectFlags(sideEffectFlags25);
        int int28 = node10.getLineno();
        node10.removeProp(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean5 = node4.isBreak();
        node4.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = node11.srcref(node15);
        java.lang.String str17 = node11.toString();
        node11.removeProp((int) (short) 0);
        boolean boolean20 = node11.isGetProp();
        boolean boolean21 = node11.isDebugger();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) '4', node4, node11);
        boolean boolean23 = node11.isBlock();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", (int) (byte) 0, 48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node27);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        int int10 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = node19.srcref(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = node28.srcref(node32);
        boolean boolean34 = node28.isBreak();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) 1, node15, node19, node28, node38, 1, (-1));
        boolean boolean42 = node15.isCall();
        boolean boolean43 = node15.isAnd();
        boolean boolean44 = node15.isObjectLit();
        boolean boolean45 = node15.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node3.getChildBefore(node15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        boolean boolean19 = node16.isAdd();
        boolean boolean20 = node16.isOr();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = node25.srcref(node29);
        java.lang.String str31 = node25.toString();
        node25.removeProp((int) (short) 0);
        boolean boolean34 = node25.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean39 = node38.isGetterDef();
        com.google.javascript.rhino.Node node40 = node25.useSourceInfoFromForTree(node38);
        boolean boolean41 = node38.isAdd();
        boolean boolean42 = node38.isOr();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node52 = node47.srcref(node51);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node61 = node56.srcref(node60);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean66 = node65.isBreak();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(4095, node47, node60, node65);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        node47.setDirectives((java.util.Set<java.lang.String>) strSet71);
        com.google.javascript.rhino.Node node74 = node47.detachFromParent();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node83 = node78.srcref(node82);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(42, node38, node47, node83, 15, (int) 'a');
        boolean boolean87 = node16.isEquivalentTo(node47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node89 = node16.getChildAtIndex(46);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        boolean boolean3 = node2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node2.getChildAtIndex(53);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node31 = node30.cloneNode();
        boolean boolean32 = node30.isArrayLit();
        boolean boolean33 = node30.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node35 = node30.getChildAtIndex(8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        java.lang.String str31 = node27.getQualifiedName();
        com.google.javascript.rhino.Node node32 = node27.detachFromParent();
        boolean boolean33 = node32.isRegExp();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = node42.srcref(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        boolean boolean57 = node51.isBreak();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 1, node38, node42, node51, node61, 1, (-1));
        java.lang.String str65 = node61.getQualifiedName();
        com.google.javascript.rhino.InputId inputId66 = node61.getInputId();
        boolean boolean67 = node61.isTry();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean72 = node71.isBreak();
        node71.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node75 = node71.cloneTree();
        boolean boolean76 = node71.isOptionalArg();
        node71.setDouble((double) 0);
        node71.setDouble((double) 43);
        node61.addChildrenToBack(node71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node32.removeChild(node61);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        boolean boolean5 = node4.isDefaultCase();
        java.util.Set<java.lang.String> strSet6 = node4.getDirectives();
        int int7 = node4.getChildCount();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = node12.srcref(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = node21.srcref(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean31 = node30.isBreak();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(4095, node12, node25, node30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet36);
        int int39 = node12.getCharno();
        boolean boolean40 = node12.isParamList();
        boolean boolean41 = node12.isName();
        boolean boolean42 = node12.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean36 = node35.isFalse();
        java.lang.String str37 = node35.getSourceFileName();
        boolean boolean38 = node35.isLabel();
        node4.putProp(1, (java.lang.Object) node35);
        boolean boolean40 = node35.isNew();
        boolean boolean41 = node35.isParamList();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        java.util.Set<java.lang.String> strSet48 = node46.getDirectives();
        boolean boolean49 = node46.hasChildren();
        com.google.javascript.rhino.Node node50 = node46.cloneTree();
        node50.setOptionalArg(false);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(52, node50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node35.getChildBefore(node53);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        node3.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        java.lang.String str15 = node9.toString();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        node9.addChildToBack(node19);
        com.google.javascript.rhino.Node node21 = node19.removeChildren();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        java.util.Set<java.lang.String> strSet27 = node25.getDirectives();
        node19.addChildrenToBack(node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node25);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NUMBER 1.0 97", 30, (int) (byte) -1);
        boolean boolean4 = node3.isNull();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean28 = node27.isBreak();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(4095, node9, node22, node27);
        boolean boolean30 = node29.isContinue();
        boolean boolean31 = node29.isDec();
        boolean boolean32 = node29.isGetElem();
        com.google.javascript.rhino.Node node33 = node29.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node33, node37);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.Object obj10 = node3.getProp(10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean16 = node15.isDo();
        boolean boolean17 = node15.isBlock();
        boolean boolean18 = node15.isStringKey();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node32 = node27.srcref(node31);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = node36.srcref(node40);
        boolean boolean42 = node36.isBreak();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 1, node23, node27, node36, node46, 1, (-1));
        node27.removeProp(0);
        com.google.javascript.rhino.Node node52 = node15.copyInformationFromForTree(node27);
        int int54 = node27.getIntProp(53);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean60 = node59.isDo();
        node59.putIntProp(38, 31);
        com.google.javascript.rhino.InputId inputId64 = node59.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node27, node59);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.Object obj10 = node3.getProp(10);
        boolean boolean11 = node3.isQuotedString();
        int int12 = node3.getChildCount();
        boolean boolean13 = node3.isAnd();
        boolean boolean14 = node3.isCall();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        int int19 = node18.getSideEffectFlags();
        node18.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node3.getChildBefore(node18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        boolean boolean2 = node1.isParamList();
        boolean boolean3 = node1.isDo();
        java.lang.Object obj5 = node1.getProp(39);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node9.setWasEmptyNode(false);
        boolean boolean13 = node9.isDec();
        java.lang.String str14 = node9.getSourceFileName();
        node9.detachChildren();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean20 = node19.isAnd();
        boolean boolean21 = node19.isDebugger();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        com.google.javascript.rhino.Node node25 = node19.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean26 = node25.isDebugger();
        node9.addChildToFront(node25);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = node36.srcref(node40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = node45.srcref(node49);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean55 = node54.isBreak();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(4095, node36, node49, node54);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        node36.setDirectives((java.util.Set<java.lang.String>) strSet60);
        java.lang.Object[] objArray63 = strSet60.toArray();
        node31.setDirectives((java.util.Set<java.lang.String>) strSet60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node25, node31);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        java.lang.String str32 = node28.getQualifiedName();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean37 = node36.isAnd();
        node36.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str40 = node28.checkTreeEquals(node36);
        jSDocInfo0.setAssociatedNode(node28);
        boolean boolean42 = jSDocInfo0.hasFileOverview();
        boolean boolean43 = jSDocInfo0.isNoSideEffects();
        boolean boolean44 = jSDocInfo0.isExterns();
        boolean boolean45 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean46 = jSDocInfo0.isConstructor();
        com.google.javascript.rhino.Node node47 = jSDocInfo0.getAssociatedNode();
        node47.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node58 = node53.srcref(node57);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node68 = node63.srcref(node67);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node77 = node72.srcref(node76);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean82 = node81.isBreak();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(4095, node63, node76, node81);
        java.lang.String[] strArray86 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet87 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet87, strArray86);
        node63.setDirectives((java.util.Set<java.lang.String>) strSet87);
        strSet87.clear();
        node53.setDirectives((java.util.Set<java.lang.String>) strSet87);
        boolean boolean92 = node53.isCase();
        boolean boolean93 = node53.isAssign();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node47.removeChild(node53);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node8.isInstanceOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        boolean boolean56 = node50.isBreak();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 1, node37, node41, node50, node60, 1, (-1));
        java.lang.String str64 = node60.getQualifiedName();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean69 = node68.isAnd();
        node68.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str72 = node60.checkTreeEquals(node68);
        jSDocInfo32.setAssociatedNode(node60);
        com.google.javascript.rhino.Node node74 = node8.useSourceInfoIfMissingFrom(node60);
        int int75 = node60.getCharno();
        boolean boolean76 = node60.isOptionalArg();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER 1.0 54\n\n\nTree2:\nOR 100\n    OR 100\n\n\nSubtree1: NUMBER 1.0 54\n\n\nSubtree2: OR 100\n    OR 100\n", (int) (short) -1, 0);
        com.google.javascript.rhino.Node node81 = node60.srcrefTree(node80);
        boolean boolean82 = node60.isAnd();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean87 = node86.isGetterDef();
        int int89 = node86.getIntProp(42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node60.removeChild(node86);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        node7.putIntProp((int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = node20.srcref(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node29.isBreak();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node16, node20, node29, node39, 1, (-1));
        boolean boolean43 = node42.isWith();
        boolean boolean44 = node42.isNot();
        boolean boolean45 = node42.isLabelName();
        com.google.javascript.rhino.Node node46 = node7.copyInformationFrom(node42);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        node50.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node66 = node61.srcref(node65);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node75 = node70.srcref(node74);
        boolean boolean76 = node70.isBreak();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) 1, node57, node61, node70, node80, 1, (-1));
        boolean boolean84 = node61.isInstanceOf();
        boolean boolean85 = node61.isCase();
        int int86 = node61.getLineno();
        int int87 = node61.getType();
        com.google.javascript.rhino.Node node92 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        node61.putProp((int) (byte) -1, (java.lang.Object) "hi!");
        com.google.javascript.rhino.Node node94 = node50.useSourceInfoFrom(node61);
        boolean boolean95 = node94.isHook();
        node94.putIntProp(43, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node99 = node7.getChildBefore(node94);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(10, 45, (int) (short) 10);
        com.google.javascript.rhino.Node node4 = node3.cloneNode();
        boolean boolean5 = node4.isLocalResultCall();
        boolean boolean6 = node4.isFunction();
        java.lang.String str7 = node4.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node4.getChildAtIndex(49);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        boolean boolean6 = node3.getBooleanProp(4);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        node3.putBooleanProp((int) (short) 100, false);
        boolean boolean11 = node3.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean18 = node17.isDo();
        boolean boolean19 = node17.isBlock();
        boolean boolean20 = node17.isStringKey();
        node3.putProp((int) (byte) 10, (java.lang.Object) node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node17.getChildAtIndex(52);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        java.lang.String str31 = node27.getQualifiedName();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder32 = node27.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 1, 38, (int) '4');
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean60 = node59.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(4095, node41, node54, node59);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = node54.getStaticSourceFile();
        boolean boolean63 = node54.isTry();
        node54.setType(3);
        com.google.javascript.rhino.Node node66 = node36.copyInformationFrom(node54);
        com.google.javascript.rhino.Node node67 = node27.useSourceInfoFrom(node66);
        com.google.javascript.rhino.Node node68 = node27.cloneNode();
        boolean boolean69 = node27.isContinue();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (short) -1, 4095);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile74 = node73.getStaticSourceFile();
        boolean boolean75 = node73.isNot();
        boolean boolean76 = node73.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node77 = node27.getChildBefore(node73);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.common.collect.ImmutableList.Builder<java.io.Serializable> serializableBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.io.Serializable>();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = node5.srcref(node9);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = node14.srcref(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean24 = node23.isBreak();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(4095, node5, node18, node23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        node5.setDirectives((java.util.Set<java.lang.String>) strSet29);
        java.lang.Object[] objArray32 = strSet29.toArray();
        com.google.common.collect.ImmutableList.Builder<java.io.Serializable> serializableBuilder33 = serializableBuilder0.add((java.io.Serializable) strSet29);
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.jstype.BooleanLiteralSet>> booleanLiteralSetEnumList34 = com.google.common.collect.ImmutableList.of();
        com.google.common.collect.ImmutableList.Builder<java.io.Serializable> serializableBuilder35 = serializableBuilder33.add((java.io.Serializable) booleanLiteralSetEnumList34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo36.getParameterType("hi!");
        jSDocInfo36.addSuppression("hi!");
        java.lang.String str41 = jSDocInfo36.toString();
        boolean boolean42 = jSDocInfo36.isNoAlias();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection43 = jSDocInfo36.getMarkers();
        java.util.Set<java.lang.String> strSet44 = jSDocInfo36.getModifies();
        boolean boolean45 = strSet44.isEmpty();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue47.and(ternaryValue48);
        java.lang.String str50 = ternaryValue47.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue52.and(ternaryValue53);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue47.or(ternaryValue53);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue57.and(ternaryValue58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = ternaryValue61.and(ternaryValue62);
        java.lang.String str64 = ternaryValue61.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = ternaryValue66.and(ternaryValue67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = ternaryValue61.or(ternaryValue67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = ternaryValue67.xor(ternaryValue70);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = ternaryValue59.xor(ternaryValue67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = ternaryValue72.not();
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray74 = new com.google.javascript.rhino.jstype.TernaryValue[] { ternaryValue55, ternaryValue72 };
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray75 = strSet44.toArray(ternaryValueArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList.Builder<java.io.Serializable> serializableBuilder76 = serializableBuilder33.add((java.io.Serializable[]) ternaryValueArray75);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean5 = node4.isDo();
        boolean boolean6 = node4.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node4.getChildAtIndex(51);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "true");
        boolean boolean3 = node2.isReturn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node2.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDescription();
        boolean boolean2 = jSDocInfo0.isInterface();
        jSDocInfo0.setDeprecated(true);
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str7 = jSDocInfo0.toString();
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(35, "Not declared as a constructor");
        java.lang.String str16 = node12.toString(false, false, true);
        node12.setType(40);
        node12.putIntProp(2, 15);
        jSDocInfo0.setAssociatedNode(node12);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node24);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = node17.getStaticSourceFile();
        boolean boolean26 = node17.isContinue();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = node30.srcref(node34);
        boolean boolean36 = node35.isDo();
        java.util.Set<java.lang.String> strSet37 = node35.getDirectives();
        boolean boolean38 = node35.isString();
        boolean boolean39 = node35.isAssignAdd();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = node43.srcref(node47);
        java.lang.Object obj50 = node43.getProp(10);
        boolean boolean51 = node43.isArrayLit();
        boolean boolean52 = node43.isAdd();
        int int53 = node43.getSideEffectFlags();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node43.children();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("NUMBER 1.0 [directives: [, hi!]]", 51, (int) (short) 100);
        com.google.javascript.rhino.Node node59 = node43.srcref(node58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node17.replaceChild(node35, node58);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(35, "Not declared as a constructor");
        java.lang.String str6 = node2.toString(false, false, true);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node2.children();
        boolean boolean8 = node2.hasOneChild();
        boolean boolean9 = node2.isOr();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        node13.detachChildren();
        int int15 = node13.getChildCount();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = node19.srcref(node23);
        java.lang.String str25 = node19.toString();
        node19.removeProp((int) (short) 0);
        boolean boolean28 = node19.isGetProp();
        boolean boolean29 = node13.isEquivalentTo(node19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node2.getChildBefore(node19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = node5.srcref(node9);
        java.lang.String str11 = node5.toString();
        int int12 = node1.getIndexOfChild(node5);
        boolean boolean13 = node1.wasEmptyNode();
        int int14 = node1.getCharno();
        com.google.javascript.rhino.Node node15 = node1.cloneTree();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(32, (-1), 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node15.removeChild(node19);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean4 = node3.isThis();
        boolean boolean5 = node3.isVoid();
        node3.setLength(51);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = node11.srcref(node15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = node16.getJSDocInfo();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(3, "Not declared as a constructor");
        com.google.javascript.rhino.Node node21 = node16.srcref(node20);
        node16.setSourceEncodedPosition(42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node3.getChildBefore(node16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node11 = node6.srcref(node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = node15.srcref(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean25 = node24.isBreak();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(4095, node6, node19, node24);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = node30.srcref(node34);
        java.lang.String str36 = node30.toString();
        node30.removeProp((int) (short) 0);
        boolean boolean39 = node30.isObjectLit();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean44 = node43.isGetterDef();
        com.google.javascript.rhino.Node node45 = node30.useSourceInfoFromForTree(node43);
        com.google.javascript.rhino.Node node46 = node26.copyInformationFromForTree(node30);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean52 = node51.isVar();
        boolean boolean53 = node51.isString();
        int int54 = node51.getLength();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        node59.setOptionalArg(true);
        node59.setType(53);
        boolean boolean64 = node51.hasChild(node59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node46, node51);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        java.lang.String str10 = node4.toString();
        node4.removeProp((int) (short) 0);
        boolean boolean13 = node4.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean18 = node17.isGetterDef();
        com.google.javascript.rhino.Node node19 = node4.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node19);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        boolean boolean23 = node22.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = node22.getStaticSourceFile();
        boolean boolean25 = node22.isWhile();
        int int26 = node19.getIndexOfChild(node22);
        boolean boolean27 = node22.isParamList();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node22.getAncestors();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = node32.srcref(node36);
        boolean boolean38 = node37.isDo();
        java.util.Set<java.lang.String> strSet39 = node37.getDirectives();
        boolean boolean40 = node37.isString();
        node37.setWasEmptyNode(false);
        boolean boolean43 = node37.isObjectLit();
        boolean boolean44 = node37.isCall();
        boolean boolean45 = node37.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node22.getChildBefore(node37);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node31 = node30.cloneNode();
        boolean boolean32 = node30.isArrayLit();
        boolean boolean33 = node30.isFunction();
        boolean boolean34 = node30.isCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str36 = jSDocInfo35.getDescription();
        boolean boolean37 = jSDocInfo35.isInterface();
        jSDocInfo35.setDeprecated(true);
        boolean boolean40 = jSDocInfo35.isNoSideEffects();
        int int41 = jSDocInfo35.getParameterCount();
        java.util.Set<java.lang.String> strSet42 = jSDocInfo35.getModifies();
        java.util.Spliterator<java.lang.String> strSpliterator43 = strSet42.spliterator();
        node30.setDirectives(strSet42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node30.getChildAtIndex(4095);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node31 = node4.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) 10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean5 = node4.isDo();
        boolean boolean6 = node4.isBlock();
        boolean boolean7 = node4.isStringKey();
        com.google.javascript.rhino.Node node8 = node4.getFirstChild();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = node22.srcref(node26);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean32 = node31.isBreak();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(4095, node13, node26, node31);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = node37.srcref(node41);
        boolean boolean43 = node26.isEquivalentTo(node37);
        boolean boolean44 = node26.isTypeOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node26);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        java.lang.String str31 = node27.getQualifiedName();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder32 = node27.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 1, 38, (int) '4');
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean60 = node59.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(4095, node41, node54, node59);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = node54.getStaticSourceFile();
        boolean boolean63 = node54.isTry();
        node54.setType(3);
        com.google.javascript.rhino.Node node66 = node36.copyInformationFrom(node54);
        com.google.javascript.rhino.Node node67 = node27.useSourceInfoFrom(node66);
        com.google.javascript.rhino.Node node68 = node27.cloneNode();
        boolean boolean69 = node27.isContinue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node27.getChildAtIndex(97);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        java.util.Set<java.lang.String> strSet5 = node3.getDirectives();
        int int6 = node3.getLength();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = node11.srcref(node15);
        boolean boolean17 = node15.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = node15.getJSDocInfo();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, node15);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.Node node21 = node3.useSourceInfoIfMissingFromForTree(node19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex(35);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility0 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray1 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility0 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList2 = com.google.common.collect.ImmutableList.of(visibilityArray1);
        java.lang.String str3 = visibilityList2.toString();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList4 = visibilityList2.reverse();
        java.lang.String str5 = visibilityList4.toString();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        boolean boolean15 = node13.isVar();
        double double16 = node13.getDouble();
        boolean boolean17 = node13.isNull();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.isDebugger();
        boolean boolean24 = node21.isGetterDef();
        com.google.javascript.rhino.Node node25 = node13.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean26 = visibilityList4.equals((java.lang.Object) node21);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        boolean boolean30 = node29.isDec();
        node29.setOptionalArg(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node21.getChildBefore(node29);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getParameterType("Not declared as a constructor");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getParameterNames();
        java.lang.Object[] objArray7 = strSet6.toArray();
        com.google.javascript.rhino.JSDocInfo.Marker marker8 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition9 = marker8.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition10 = marker8.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker11 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition12 = marker11.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition13 = marker11.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition14 = marker11.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = marker11.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition16 = marker11.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition17 = marker11.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition18 = marker11.getNameNode();
        com.google.javascript.rhino.JSDocInfo.Marker marker19 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition20 = marker19.getNameNode();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition21 = marker19.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition22 = marker19.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition23 = marker19.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition24 = marker19.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition25 = marker19.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition26 = marker19.getDescription();
        com.google.javascript.rhino.JSDocInfo.Marker[] markerArray27 = new com.google.javascript.rhino.JSDocInfo.Marker[] { marker8, marker11, marker19 };
        com.google.javascript.rhino.JSDocInfo.Marker[] markerArray28 = strSet6.toArray(markerArray27);
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList30 = jSDocInfo29.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo29.getParameterType("Not declared as a constructor");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection33 = jSDocInfo29.getTypeNodes();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList34 = jSDocInfo29.getImplementedInterfaces();
        java.util.Set<java.lang.String> strSet35 = jSDocInfo29.getParameterNames();
        java.lang.Object[] objArray36 = strSet35.toArray();
        com.google.javascript.rhino.JSDocInfo.Marker marker37 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition38 = marker37.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition39 = marker37.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker40 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition41 = marker40.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition42 = marker40.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition43 = marker40.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition44 = marker40.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition45 = marker40.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition46 = marker40.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition47 = marker40.getNameNode();
        com.google.javascript.rhino.JSDocInfo.Marker marker48 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition49 = marker48.getNameNode();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition50 = marker48.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition51 = marker48.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition52 = marker48.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition53 = marker48.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition54 = marker48.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition55 = marker48.getDescription();
        com.google.javascript.rhino.JSDocInfo.Marker[] markerArray56 = new com.google.javascript.rhino.JSDocInfo.Marker[] { marker37, marker40, marker48 };
        com.google.javascript.rhino.JSDocInfo.Marker[] markerArray57 = strSet35.toArray(markerArray56);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList59 = jSDocInfo58.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = jSDocInfo58.getParameterType("Not declared as a constructor");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection62 = jSDocInfo58.getTypeNodes();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo58.getImplementedInterfaces();
        java.util.Set<java.lang.String> strSet64 = jSDocInfo58.getParameterNames();
        java.lang.Object[] objArray65 = strSet64.toArray();
        com.google.javascript.rhino.JSDocInfo.Marker marker66 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition67 = marker66.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition68 = marker66.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker69 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition70 = marker69.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition71 = marker69.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition72 = marker69.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition73 = marker69.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition74 = marker69.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition75 = marker69.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition76 = marker69.getNameNode();
        com.google.javascript.rhino.JSDocInfo.Marker marker77 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition78 = marker77.getNameNode();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition79 = marker77.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition80 = marker77.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition81 = marker77.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition82 = marker77.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition83 = marker77.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition84 = marker77.getDescription();
        com.google.javascript.rhino.JSDocInfo.Marker[] markerArray85 = new com.google.javascript.rhino.JSDocInfo.Marker[] { marker66, marker69, marker77 };
        com.google.javascript.rhino.JSDocInfo.Marker[] markerArray86 = strSet64.toArray(markerArray85);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker[]> markerArrayList87 = com.google.common.collect.ImmutableList.of(markerArray27, markerArray56, markerArray86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker> markerList88 = com.google.common.collect.ImmutableList.of(markerArray27);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node7.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = node7.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node7.getStaticSourceFile();
        java.lang.String str12 = node7.getSourceFileName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = node7.getJSDocInfo();
        java.lang.String str14 = node7.getQualifiedName();
        boolean boolean15 = node7.isSetterDef();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = node19.srcref(node23);
        boolean boolean25 = node24.isDo();
        java.util.Set<java.lang.String> strSet26 = node24.getDirectives();
        boolean boolean27 = node24.isString();
        node24.setWasEmptyNode(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node24.getAncestors();
        com.google.javascript.rhino.Node node31 = node7.useSourceInfoIfMissingFrom(node24);
        boolean boolean32 = node7.isTry();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean37 = node36.isBreak();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        node36.addChildToBack(node41);
        boolean boolean44 = node41.getBooleanProp((int) (byte) -1);
        java.lang.String str45 = node41.toStringTree();
        com.google.javascript.rhino.Node node46 = node41.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node7.getChildBefore(node46);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(53, "OR 100");
        node2.setQuotedString();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean9 = node8.isDo();
        boolean boolean10 = node8.isFalse();
        node2.addChildrenToFront(node8);
        boolean boolean12 = node8.isDec();
        node8.setLineno(11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        boolean boolean17 = node16.isParamList();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = node22.srcref(node26);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = node31.srcref(node35);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean41 = node40.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(4095, node22, node35, node40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        node22.setDirectives((java.util.Set<java.lang.String>) strSet46);
        int int49 = node22.getCharno();
        boolean boolean50 = node22.isParamList();
        boolean boolean51 = node22.isName();
        boolean boolean52 = node22.isGetProp();
        boolean boolean53 = node22.isLabel();
        boolean boolean54 = node16.isEquivalentTo(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node8.getChildBefore(node22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean5 = node4.isVar();
        boolean boolean6 = node4.isString();
        boolean boolean7 = node4.isFromExterns();
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        com.google.javascript.rhino.Node node9 = node4.removeFirstChild();
        boolean boolean10 = node4.isSetterDef();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = node15.srcref(node19);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = node28.srcref(node32);
        java.lang.String str34 = node28.toString();
        node28.removeProp((int) (short) 0);
        boolean boolean37 = node28.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean42 = node41.isGetterDef();
        com.google.javascript.rhino.Node node43 = node28.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder44 = node41.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean49 = node48.isGetterDef();
        com.google.javascript.rhino.Node node50 = node41.useSourceInfoFrom(node48);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node59 = node54.srcref(node58);
        java.lang.String str60 = node54.toString();
        node54.removeProp((int) (short) 0);
        boolean boolean63 = node54.isObjectLit();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean68 = node67.isGetterDef();
        com.google.javascript.rhino.Node node69 = node54.useSourceInfoFromForTree(node67);
        boolean boolean70 = node69.isObjectLit();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(54, node20, node24, node48, node69);
        int int72 = node24.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node73 = node4.getChildBefore(node24);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean5 = node4.isAnd();
        node4.setSourceFileForTesting("[PROTECTED]");
        node4.putIntProp(1, 4095);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node15 = node4.useSourceInfoFromForTree(node14);
        java.lang.Object obj17 = node4.getProp((int) (byte) 100);
        node4.setIsSyntheticBlock(false);
        boolean boolean20 = node4.isFor();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = node26.srcref(node30);
        java.lang.String str32 = node26.toString();
        int int33 = node22.getIndexOfChild(node26);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = node22.getJSDocInfo();
        int int35 = node22.getType();
        node22.putBooleanProp((int) (byte) -1, false);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = node42.srcref(node46);
        java.lang.String str51 = node47.toString(false, false, true);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(44, node4, node22, node47);
        int int53 = node22.getSideEffectFlags();
        boolean boolean54 = node22.isComma();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean59 = node58.isThis();
        boolean boolean60 = node58.isVoid();
        boolean boolean61 = node58.isDebugger();
        com.google.javascript.rhino.Node node62 = node22.copyInformationFrom(node58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node64 = node62.getChildAtIndex(45);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 51, 36);
        java.lang.String str4 = node3.getSourceFileName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        boolean boolean15 = node13.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = node13.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node13.getStaticSourceFile();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0, node13, (int) (short) 0, (int) (short) 100);
        com.google.javascript.rhino.Node node21 = node13.cloneTree();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean27 = node26.isAnd();
        boolean boolean28 = node26.isDebugger();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        com.google.javascript.rhino.Node node32 = node26.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean33 = node32.isDebugger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node21, node32);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        node4.setOptionalArg(true);
        boolean boolean7 = node4.isIf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node4.siblings();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = node12.srcref(node16);
        boolean boolean18 = node16.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = node16.getJSDocInfo();
        boolean boolean20 = node16.isLocalResultCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node4.getChildBefore(node16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 3, 16, 44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(43);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility0 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray1 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility0 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList2 = com.google.common.collect.ImmutableList.of(visibilityArray1);
        java.util.ListIterator<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityItor3 = visibilityList2.listIterator();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean8 = node7.isFalse();
        com.google.javascript.rhino.Node node9 = node7.cloneTree();
        int int10 = visibilityList2.lastIndexOf((java.lang.Object) node9);
        boolean boolean11 = node9.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node9.getChildAtIndex(1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) ' ', 29, (int) (short) 1);
        node3.addSuppression("hi!");
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = node14.srcref(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = node23.srcref(node27);
        boolean boolean29 = node23.isBreak();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 1, node10, node14, node23, node33, 1, (-1));
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = node40.srcref(node44);
        java.lang.String str46 = node40.toString();
        node40.removeProp((int) (short) 0);
        boolean boolean49 = node40.isGetProp();
        boolean boolean50 = node40.isReturn();
        com.google.javascript.rhino.Node node51 = node10.srcref(node40);
        boolean boolean52 = node40.isAnd();
        boolean boolean53 = node40.isNull();
        node3.addChildrenToFront(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node56 = node3.getChildAtIndex(12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber(0.0d);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node3 = node1.removeFirstChild();
        java.lang.Object obj5 = node1.getProp(29);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node8 = node1.clonePropsFrom(node7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node7.getChildAtIndex(221184);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node16.useSourceInfoFrom(node23);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = node34.srcref(node38);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = node43.srcref(node47);
        boolean boolean49 = node43.isBreak();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 1, node30, node34, node43, node53, 1, (-1));
        boolean boolean57 = node34.isInstanceOf();
        boolean boolean58 = node34.isFor();
        boolean boolean59 = node34.isRegExp();
        node34.setSourceEncodedPositionForTree(51);
        node34.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean69 = node68.isVar();
        boolean boolean70 = node68.isString();
        int int71 = node68.getLength();
        com.google.javascript.rhino.InputId inputId72 = node68.getInputId();
        boolean boolean73 = node68.isObjectLit();
        java.lang.String str74 = node68.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node25.replaceChild(node34, node68);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node4.isIf();
        java.lang.Object obj33 = node4.getProp(43);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node4.getStaticSourceFile();
        boolean boolean35 = node4.isNull();
        boolean boolean36 = node4.isDebugger();
        com.google.javascript.rhino.Node node37 = node4.getLastSibling();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean42 = node41.isBreak();
        int int43 = node41.getChildCount();
        boolean boolean44 = node41.isGetElem();
        node41.setVarArgs(true);
        boolean boolean47 = node41.hasMoreThanOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node41);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node7.isVar();
        double double10 = node7.getDouble();
        boolean boolean11 = node7.isParamList();
        int int12 = node7.getSourceOffset();
        node7.setSourceFileForTesting("OR");
        int int15 = node7.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node7.getChildAtIndex(4095);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet28);
        com.google.javascript.rhino.Node node31 = node4.detachFromParent();
        int int32 = node4.getSideEffectFlags();
        boolean boolean33 = node4.isQualifiedName();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(3, "[PROTECTED]", 3, 37);
        node38.setQuotedString();
        com.google.javascript.rhino.Node node40 = node38.getLastSibling();
        node4.addChildrenToBack(node38);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = node45.srcref(node49);
        boolean boolean51 = node49.isVar();
        double double52 = node49.getDouble();
        boolean boolean53 = node49.isNull();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node62 = node57.srcref(node61);
        java.lang.Object obj64 = node57.getProp(10);
        boolean boolean65 = node57.isQuotedString();
        boolean boolean66 = node49.hasChild(node57);
        node49.putBooleanProp(12, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node38.removeChild(node49);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isGetProp();
        com.google.javascript.rhino.Node node13 = node3.getNext();
        int int14 = node3.getSourceOffset();
        boolean boolean15 = node3.isNoSideEffectsCall();
        boolean boolean16 = node3.isSetterDef();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 47, 35, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node20);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = node34.srcref(node38);
        java.lang.String str40 = node34.toString();
        node34.removeProp((int) (short) 0);
        boolean boolean43 = node34.isGetProp();
        boolean boolean44 = node34.isReturn();
        com.google.javascript.rhino.Node node45 = node4.srcref(node34);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, 45, (int) (short) 10);
        boolean boolean50 = node49.isDefaultCase();
        boolean boolean51 = node49.isFor();
        boolean boolean52 = node49.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node45.removeChild(node49);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node16.useSourceInfoFrom(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node33.isFalse();
        com.google.javascript.rhino.Node node36 = node23.useSourceInfoIfMissingFrom(node33);
        boolean boolean37 = node33.isTrue();
        boolean boolean38 = node33.isComma();
        node33.removeProp((int) (short) 10);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = node49.srcref(node53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = node54.getJSDocInfo();
        boolean boolean56 = node54.isQualifiedName();
        com.google.javascript.rhino.Node node57 = node45.useSourceInfoFromForTree(node54);
        com.google.javascript.rhino.Node node58 = node33.srcrefTree(node45);
        com.google.javascript.rhino.jstype.JSType jSType59 = node45.getJSType();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable60 = node45.getAncestors();
        com.google.javascript.rhino.Node[] nodeArray66 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray66, 40, (int) (short) 0);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) 'a', nodeArray66);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(46, nodeArray66);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(42, nodeArray66, 47, 30);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(45, nodeArray66, 44, 1);
        node77.setLineno(397316);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = node45.getChildBefore(node77);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.Object obj10 = node3.getProp(10);
        boolean boolean11 = node3.isInc();
        boolean boolean12 = node3.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node3.getChildAtIndex(41);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getParameterType("hi!");
        jSDocInfo0.addSuppression("hi!");
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection7 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        boolean boolean9 = strSet8.isEmpty();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue11.and(ternaryValue12);
        java.lang.String str14 = ternaryValue11.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue16.and(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue11.or(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue21.and(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue25.and(ternaryValue26);
        java.lang.String str28 = ternaryValue25.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue30.and(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue25.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue31.xor(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue23.xor(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue36.not();
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray38 = new com.google.javascript.rhino.jstype.TernaryValue[] { ternaryValue19, ternaryValue36 };
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray39 = strSet8.toArray(ternaryValueArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList40 = com.google.common.collect.ImmutableList.of((java.io.Serializable[]) ternaryValueArray38);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node16.useSourceInfoFrom(node23);
        node16.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = node31.srcref(node35);
        java.lang.String str37 = node31.toString();
        node31.removeProp((int) (short) 0);
        boolean boolean40 = node16.isEquivalentTo(node31);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean46 = node45.isBreak();
        node45.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node49 = node45.cloneTree();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 52, 42, (int) (byte) 1);
        boolean boolean54 = node49.isEquivalentToTyped(node53);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(42, node49);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node49.children();
        boolean boolean57 = node49.isLocalResultCall();
        com.google.javascript.rhino.Node node58 = node49.getParent();
        boolean boolean59 = node49.isArrayLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.removeChild(node49);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isBreak();
        node3.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node7 = node3.cloneTree();
        boolean boolean8 = node7.isIf();
        node7.setSourceEncodedPositionForTree(54);
        boolean boolean11 = node7.hasChildren();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = node16.srcref(node20);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = node25.srcref(node29);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean35 = node34.isBreak();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(4095, node16, node29, node34);
        boolean boolean37 = node34.isIn();
        boolean boolean38 = node34.hasOneChild();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("NUMBER 1.0 [directives: [, hi!]]");
        java.lang.String str41 = node34.checkTreeEquals(node40);
        boolean boolean42 = node40.isLabel();
        boolean boolean43 = node40.isQuotedString();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(16, "(Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n)", 221184, (int) (byte) 0);
        boolean boolean49 = node48.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChild(node40, node48);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        boolean boolean6 = node3.getBooleanProp(4);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isUnscopedQualifiedName();
        boolean boolean9 = node3.isVarArgs();
        boolean boolean10 = node3.isTypeOf();
        boolean boolean11 = node3.isTry();
        node3.putIntProp(1, 51);
        boolean boolean15 = node3.isAnd();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = node19.srcref(node23);
        java.lang.String str25 = node19.toString();
        node19.removeProp((int) (short) 0);
        boolean boolean28 = node19.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean33 = node32.isGetterDef();
        com.google.javascript.rhino.Node node34 = node19.useSourceInfoFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = node38.srcref(node42);
        boolean boolean44 = node43.isDo();
        java.util.Set<java.lang.String> strSet45 = node43.getDirectives();
        com.google.javascript.rhino.Node node46 = node32.clonePropsFrom(node43);
        boolean boolean47 = node43.isDebugger();
        com.google.javascript.rhino.Node node48 = node43.getFirstChild();
        boolean boolean49 = node43.isSetterDef();
        boolean boolean50 = node43.isLocalResultCall();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("Unknown class name");
        int int53 = node43.getIndexOfChild(node52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node43);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node16.useSourceInfoFrom(node23);
        com.google.javascript.rhino.InputId inputId26 = node16.getInputId();
        com.google.javascript.rhino.Node node27 = node16.getLastSibling();
        boolean boolean28 = node16.isAssignAdd();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        boolean boolean31 = node30.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = node30.getStaticSourceFile();
        node30.setOptionalArg(false);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (short) -1, 4095);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        node42.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node58 = node53.srcref(node57);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node67 = node62.srcref(node66);
        boolean boolean68 = node62.isBreak();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) 1, node49, node53, node62, node72, 1, (-1));
        boolean boolean76 = node53.isInstanceOf();
        boolean boolean77 = node53.isCase();
        int int78 = node53.getLineno();
        int int79 = node53.getType();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        node53.putProp((int) (byte) -1, (java.lang.Object) "hi!");
        com.google.javascript.rhino.Node node86 = node42.useSourceInfoFrom(node53);
        int int87 = node86.getLineno();
        com.google.javascript.rhino.Node node88 = node38.useSourceInfoFromForTree(node86);
        boolean boolean89 = node86.isDebugger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.replaceChild(node30, node86);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isBreak();
        node3.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node7 = node3.cloneTree();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 52, 42, (int) (byte) 1);
        boolean boolean12 = node7.isEquivalentToTyped(node11);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node14.getStaticSourceFile();
        boolean boolean17 = node14.isWhile();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean22 = node21.isAnd();
        boolean boolean23 = node21.isDebugger();
        boolean boolean24 = node21.isWhile();
        node21.setType((int) (byte) 0);
        com.google.javascript.rhino.Node node27 = node14.copyInformationFrom(node21);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node21.getAncestors();
        double double29 = node21.getDouble();
        com.google.javascript.rhino.Node node30 = node11.useSourceInfoIfMissingFromForTree(node21);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = node35.srcref(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = node44.srcref(node48);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean54 = node53.isBreak();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(4095, node35, node48, node53);
        boolean boolean56 = node48.isNumber();
        boolean boolean57 = node48.isLocalResultCall();
        boolean boolean58 = node48.isFalse();
        int int59 = node48.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node48);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        java.lang.String str23 = node17.toString();
        node17.removeProp((int) (short) 0);
        boolean boolean26 = node17.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean31 = node30.isGetterDef();
        com.google.javascript.rhino.Node node32 = node17.useSourceInfoFromForTree(node30);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder33 = node30.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean38 = node37.isGetterDef();
        com.google.javascript.rhino.Node node39 = node30.useSourceInfoFrom(node37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = node43.srcref(node47);
        java.lang.String str49 = node43.toString();
        node43.removeProp((int) (short) 0);
        boolean boolean52 = node43.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean57 = node56.isGetterDef();
        com.google.javascript.rhino.Node node58 = node43.useSourceInfoFromForTree(node56);
        boolean boolean59 = node58.isObjectLit();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(54, node9, node13, node37, node58);
        boolean boolean61 = node9.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node9.getChildAtIndex(38);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node8.isDo();
        java.util.Set<java.lang.String> strSet10 = node8.getDirectives();
        boolean boolean11 = node8.isString();
        node8.setWasEmptyNode(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable14 = node8.getAncestors();
        boolean boolean15 = node8.isNE();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = node20.srcref(node24);
        java.lang.String str26 = node20.toString();
        node20.removeProp((int) (short) 0);
        boolean boolean29 = node20.isObjectLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean34 = node33.isGetterDef();
        com.google.javascript.rhino.Node node35 = node20.useSourceInfoFromForTree(node33);
        boolean boolean36 = node33.isAdd();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder37 = node33.getJsDocBuilderForNode();
        fileLevelJsDocBuilder37.append("Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n");
        node8.putProp(35, (java.lang.Object) "Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n");
        node8.setIsSyntheticBlock(false);
        boolean boolean43 = node8.wasEmptyNode();
        com.google.javascript.rhino.Node node44 = node8.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node44.getChildAtIndex((int) '4');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(31, 0, 39);
        node3.setIsSyntheticBlock(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex((int) ' ');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean5 = node4.isDo();
        boolean boolean6 = node4.isBlock();
        boolean boolean7 = node4.isStringKey();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = node16.srcref(node20);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = node25.srcref(node29);
        boolean boolean31 = node25.isBreak();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) 1, node12, node16, node25, node35, 1, (-1));
        node16.removeProp(0);
        com.google.javascript.rhino.Node node41 = node4.copyInformationFromForTree(node16);
        int int43 = node16.getIntProp(53);
        com.google.javascript.rhino.Node node44 = node16.getLastChild();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node53 = node48.srcref(node52);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = node53.getJSDocInfo();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(3, "Not declared as a constructor");
        com.google.javascript.rhino.Node node58 = node53.srcref(node57);
        node53.setSourceEncodedPosition(42);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node71 = node66.srcref(node70);
        java.lang.String str72 = node66.toString();
        int int73 = node62.getIndexOfChild(node66);
        boolean boolean74 = node62.wasEmptyNode();
        int int75 = node62.getCharno();
        com.google.javascript.rhino.Node node76 = node62.cloneTree();
        boolean boolean77 = node76.isQuotedString();
        int int78 = node76.getLength();
        boolean boolean79 = node76.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node80 = node53.copyInformationFromForTree(node76);
        boolean boolean81 = node80.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = node16.getChildBefore(node80);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0, 4, 51);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean27 = node26.isBreak();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(4095, node8, node21, node26);
        boolean boolean29 = node28.isContinue();
        boolean boolean30 = node28.isDec();
        boolean boolean31 = node28.isGetElem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node3.getChildBefore(node28);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(48, 100, 8);
        node3.setType(50);
        boolean boolean6 = node3.isGetterDef();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = node10.srcref(node14);
        java.lang.String str16 = node10.toString();
        node10.removeProp((int) (short) 0);
        boolean boolean19 = node10.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node10.useSourceInfoFromForTree(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node34.isDo();
        java.util.Set<java.lang.String> strSet36 = node34.getDirectives();
        com.google.javascript.rhino.Node node37 = node23.clonePropsFrom(node34);
        node34.addSuppression("Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n");
        boolean boolean40 = node34.isLocalResultCall();
        boolean boolean41 = node34.isContinue();
        boolean boolean42 = node34.isNoSideEffectsCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node34);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 35);
        int int2 = node1.getChildCount();
        boolean boolean3 = node1.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(30);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("JSDocInfo");
        boolean boolean2 = node1.isIf();
        boolean boolean3 = node1.isRegExp();
        boolean boolean4 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean11 = node10.isGetterDef();
        boolean boolean12 = node10.isThis();
        java.lang.String str13 = node10.getQualifiedName();
        boolean boolean15 = node10.getBooleanProp(52);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(48, node10);
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] { node16 };
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(5, nodeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node1.getChildBefore(node18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDescription();
        boolean boolean2 = jSDocInfo0.isInterface();
        jSDocInfo0.setDeprecated(true);
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str7 = jSDocInfo0.toString();
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(35, "Not declared as a constructor");
        java.lang.String str16 = node12.toString(false, false, true);
        node12.setType(40);
        node12.putIntProp(2, 15);
        jSDocInfo0.setAssociatedNode(node12);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node32 = node27.srcref(node31);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = node36.srcref(node40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean46 = node45.isBreak();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(4095, node27, node40, node45);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        node27.setDirectives((java.util.Set<java.lang.String>) strSet51);
        boolean boolean55 = strSet51.add("true");
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("[PROTECTED]", 8, 44);
        boolean boolean60 = strSet51.contains((java.lang.Object) node59);
        strSet51.clear();
        boolean boolean63 = strSet51.add("(Not declared as a constructor)");
        node12.setDirectives((java.util.Set<java.lang.String>) strSet51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = node12.getChildAtIndex(49);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        node3.setSourceFileForTesting("[PROTECTED]");
        boolean boolean7 = node3.hasChildren();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = node12.srcref(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = node21.srcref(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean31 = node30.isBreak();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(4095, node12, node25, node30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet36);
        int int39 = node12.getCharno();
        java.lang.String str40 = node12.getQualifiedName();
        boolean boolean41 = node12.isFromExterns();
        boolean boolean42 = node12.isIf();
        boolean boolean43 = node12.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        com.google.javascript.rhino.Node node25 = node24.removeChildren();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = node30.srcref(node34);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = node43.srcref(node47);
        java.lang.String str49 = node43.toString();
        node43.removeProp((int) (short) 0);
        boolean boolean52 = node43.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean57 = node56.isGetterDef();
        com.google.javascript.rhino.Node node58 = node43.useSourceInfoFromForTree(node56);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder59 = node56.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean64 = node63.isGetterDef();
        com.google.javascript.rhino.Node node65 = node56.useSourceInfoFrom(node63);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node74 = node69.srcref(node73);
        java.lang.String str75 = node69.toString();
        node69.removeProp((int) (short) 0);
        boolean boolean78 = node69.isObjectLit();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean83 = node82.isGetterDef();
        com.google.javascript.rhino.Node node84 = node69.useSourceInfoFromForTree(node82);
        boolean boolean85 = node84.isObjectLit();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(54, node35, node39, node63, node84);
        int int87 = node39.getType();
        boolean boolean88 = node39.isThrow();
        boolean boolean89 = node39.isAssign();
        node39.putIntProp(15, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node93 = node24.getChildBefore(node39);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node16.useSourceInfoFrom(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node33.isFalse();
        com.google.javascript.rhino.Node node36 = node23.useSourceInfoIfMissingFrom(node33);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = node40.srcref(node44);
        java.lang.String str46 = node40.toString();
        node40.removeProp((int) (short) 0);
        boolean boolean49 = node40.isGetProp();
        boolean boolean50 = node40.isDebugger();
        com.google.javascript.rhino.Node node51 = node36.useSourceInfoIfMissingFromForTree(node40);
        boolean boolean52 = node40.isAdd();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean58 = node57.isVar();
        boolean boolean59 = node57.isString();
        boolean boolean60 = node57.isFromExterns();
        com.google.javascript.rhino.InputId inputId61 = node57.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node62 = node40.getChildBefore(node57);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(36);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node4.isIf();
        boolean boolean32 = node4.isCatch();
        java.lang.String str36 = node4.toString(true, true, false);
        java.lang.String str40 = node4.toString(false, true, true);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0L);
        java.lang.String str43 = node42.getQualifiedName();
        boolean boolean44 = node42.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node42);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(37, (int) (byte) 100, 30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(397316);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str13 = node12.toString();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 10);
        boolean boolean17 = node14.isEquivalentToTyped(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean22 = node21.isFalse();
        java.lang.String str23 = node21.getSourceFileName();
        boolean boolean24 = node21.isLabel();
        boolean boolean25 = node21.isSetterDef();
        boolean boolean26 = node21.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = node35.srcref(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = node44.srcref(node48);
        boolean boolean50 = node44.isBreak();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) 1, node31, node35, node44, node54, 1, (-1));
        boolean boolean58 = node57.isWith();
        boolean boolean59 = node57.isNot();
        boolean boolean60 = node21.isEquivalentToTyped(node57);
        boolean boolean61 = node57.isSyntheticBlock();
        boolean boolean62 = node16.isEquivalentTo(node57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node3.getChildBefore(node16);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        node17.setSourceEncodedPosition(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node17.getChildAtIndex(32);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        boolean boolean32 = node9.isInstanceOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = node42.srcref(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        boolean boolean57 = node51.isBreak();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 1, node38, node42, node51, node61, 1, (-1));
        java.lang.String str65 = node61.getQualifiedName();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean70 = node69.isAnd();
        node69.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str73 = node61.checkTreeEquals(node69);
        jSDocInfo33.setAssociatedNode(node61);
        com.google.javascript.rhino.Node node75 = node9.useSourceInfoIfMissingFrom(node61);
        typePosition0.setItem(node75);
        int int77 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node78 = typePosition0.getItem();
        com.google.javascript.rhino.InputId inputId79 = node78.getInputId();
        boolean boolean80 = node78.isFromExterns();
        node78.setLength(38);
        node78.removeProp((int) (byte) 0);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node87 = node78.getChildBefore(node86);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean5 = node4.isVar();
        boolean boolean6 = node4.isIf();
        node4.putIntProp(42, 45);
        boolean boolean10 = node4.hasOneChild();
        com.google.javascript.rhino.Node node11 = node4.cloneTree();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("JSDocInfo");
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.new FileLevelJsDocBuilder();
        node13.putBooleanProp((int) 'a', true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = node22.srcref(node26);
        boolean boolean28 = node27.isDo();
        java.util.Set<java.lang.String> strSet29 = node27.getDirectives();
        com.google.javascript.rhino.Node node30 = node16.clonePropsFrom(node27);
        boolean boolean31 = node27.isDebugger();
        com.google.javascript.rhino.Node node32 = node27.getFirstChild();
        boolean boolean33 = node27.isSetterDef();
        boolean boolean34 = node27.isLocalResultCall();
        boolean boolean35 = node27.isQualifiedName();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(0, "true");
        boolean boolean40 = node39.isReturn();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder41 = node39.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(40, node39, (int) (byte) 1, 48);
        com.google.javascript.rhino.Node node45 = node39.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.removeChild(node45);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        boolean boolean6 = node3.getBooleanProp(4);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        node3.putBooleanProp((int) (short) 100, false);
        boolean boolean11 = node3.isCase();
        boolean boolean12 = node3.isNumber();
        int int13 = node3.getLineno();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node22.isFalse();
        java.lang.Object obj26 = node22.getProp((int) (byte) -1);
        boolean boolean27 = node22.isFunction();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(49, node22, 51, 36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node3.getChildBefore(node22);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        boolean boolean2 = node1.isParamList();
        boolean boolean3 = node1.isDo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node1.children();
        boolean boolean5 = node1.isFromExterns();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        java.util.Set<java.lang.String> strSet11 = node9.getDirectives();
        int int12 = node9.getLength();
        boolean boolean13 = node9.isCatch();
        com.google.javascript.rhino.InputId inputId14 = node9.getInputId();
        com.google.javascript.rhino.Node node15 = node1.useSourceInfoFrom(node9);
        boolean boolean16 = node15.isQualifiedName();
        boolean boolean17 = node15.isAssign();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node15.getChildAtIndex(3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean4 = node3.isThis();
        boolean boolean5 = node3.isVoid();
        boolean boolean6 = node3.isDebugger();
        int int7 = node3.getLineno();
        boolean boolean8 = node3.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex((int) 'a');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        boolean boolean19 = node16.isAdd();
        boolean boolean20 = node16.isOr();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = node16.getStaticSourceFile();
        boolean boolean22 = node16.isFromExterns();
        boolean boolean23 = node16.isInc();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean28 = node27.isAnd();
        boolean boolean30 = node27.getBooleanProp(4);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node27.siblings();
        boolean boolean32 = node27.isUnscopedQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.removeChild(node27);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        boolean boolean5 = node3.isDebugger();
        boolean boolean6 = node3.isWhile();
        node3.setType((int) (byte) 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node3.children();
        boolean boolean10 = node3.isGetElem();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = node15.srcref(node19);
        java.lang.String str21 = node15.toString();
        node15.removeProp((int) (short) 0);
        boolean boolean24 = node15.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean29 = node28.isGetterDef();
        com.google.javascript.rhino.Node node30 = node15.useSourceInfoFromForTree(node28);
        boolean boolean31 = node28.isAdd();
        boolean boolean32 = node28.isOr();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = node37.srcref(node41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = node46.srcref(node50);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean56 = node55.isBreak();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(4095, node37, node50, node55);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        node37.setDirectives((java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.rhino.Node node64 = node37.detachFromParent();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node73 = node68.srcref(node72);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(42, node28, node37, node73, 15, (int) 'a');
        boolean boolean77 = node76.isNumber();
        boolean boolean78 = node76.isNew();
        com.google.javascript.rhino.Node node79 = node76.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node79);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        java.lang.String str23 = node17.toString();
        node17.removeProp((int) (short) 0);
        boolean boolean26 = node17.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean31 = node30.isGetterDef();
        com.google.javascript.rhino.Node node32 = node17.useSourceInfoFromForTree(node30);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder33 = node30.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean38 = node37.isGetterDef();
        com.google.javascript.rhino.Node node39 = node30.useSourceInfoFrom(node37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = node43.srcref(node47);
        java.lang.String str49 = node43.toString();
        node43.removeProp((int) (short) 0);
        boolean boolean52 = node43.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean57 = node56.isGetterDef();
        com.google.javascript.rhino.Node node58 = node43.useSourceInfoFromForTree(node56);
        boolean boolean59 = node58.isObjectLit();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(54, node9, node13, node37, node58);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder61 = node58.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node62 = node58.getParent();
        node58.putIntProp((int) (short) 1, 409652);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node67 = node58.getChildAtIndex(61440);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        java.lang.String str14 = node8.toString();
        node8.removeProp((int) (short) 0);
        boolean boolean17 = node8.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node23 = node8.useSourceInfoFromForTree(node21);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node23);
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node34.isDo();
        java.util.Set<java.lang.String> strSet36 = node34.getDirectives();
        boolean boolean37 = node34.isString();
        node34.setWasEmptyNode(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable40 = node34.getAncestors();
        com.google.javascript.rhino.Node node41 = node24.srcrefTree(node34);
        java.lang.String str42 = node34.getSourceFileName();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("Named type with empty name component", 38, 46);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 35);
        int int50 = node49.getChildCount();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(42, node47, node49);
        boolean boolean52 = node51.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node34.removeChild(node51);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        node4.setOptionalArg(true);
        boolean boolean7 = node4.isOr();
        node4.setSourceEncodedPosition((int) (byte) 0);
        java.util.Set<java.lang.String> strSet10 = node4.getDirectives();
        boolean boolean11 = node4.isNumber();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(0, "STRING true 1", 16, (int) (short) 100);
        boolean boolean17 = node16.isInc();
        boolean boolean18 = node4.isEquivalentTo(node16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = node23.srcref(node27);
        boolean boolean29 = node28.isDo();
        java.util.Set<java.lang.String> strSet30 = node28.getDirectives();
        boolean boolean31 = node28.isString();
        node28.setWasEmptyNode(false);
        boolean boolean34 = node28.isObjectLit();
        boolean boolean35 = node28.isParamList();
        boolean boolean36 = node28.hasOneChild();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(38, node28, (int) (byte) -1, 0);
        boolean boolean40 = node28.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node4.getChildBefore(node28);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 12, 52, 50);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = node3.getStaticSourceFile();
        node3.removeProp((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node7.isFalse();
        int int10 = node7.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node7.getChildAtIndex(61537);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        java.lang.String str31 = node27.getQualifiedName();
        com.google.javascript.rhino.Node node32 = node27.detachFromParent();
        boolean boolean33 = node27.isCall();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = node38.srcref(node42);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node52 = node47.srcref(node51);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean57 = node56.isBreak();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(4095, node38, node51, node56);
        java.util.Set<java.lang.String> strSet59 = node58.getDirectives();
        boolean boolean60 = node58.isObjectLit();
        com.google.javascript.rhino.Node node61 = node58.getFirstChild();
        com.google.javascript.rhino.Node node62 = node27.clonePropsFrom(node61);
        boolean boolean63 = node61.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node65 = node61.getChildAtIndex(16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        boolean boolean10 = node8.isFalse();
        int int11 = node8.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node15.setWasEmptyNode(false);
        boolean boolean19 = node15.isDec();
        java.lang.String str20 = node15.getSourceFileName();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100, node8, node15);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) '#', "[PROTECTED]", 8, 97);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean32 = node31.isDo();
        boolean boolean33 = node31.isBlock();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean38 = node37.isBreak();
        node37.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node41 = node37.cloneTree();
        com.google.javascript.rhino.Node node42 = node31.useSourceInfoIfMissingFromForTree(node37);
        node26.addChildToFront(node37);
        boolean boolean44 = node26.hasMoreThanOneChild();
        boolean boolean45 = node26.isDebugger();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean50 = node49.isThis();
        boolean boolean51 = node49.isVoid();
        boolean boolean52 = node49.isDebugger();
        int int53 = node49.getLineno();
        boolean boolean54 = node49.isStringKey();
        boolean boolean55 = node49.isAdd();
        boolean boolean56 = node49.isCatch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node15.replaceChild(node26, node49);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 42, (int) (short) 0, (int) (byte) 1);
        boolean boolean4 = node3.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(40);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        boolean boolean2 = node1.isParamList();
        boolean boolean3 = node1.isAssignAdd();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = node1.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node1.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("GETELEM [PROTECTED] 8 [jsdoc_info: JSDocInfo]\n");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        int int6 = node5.getSideEffectFlags();
        node5.setOptionalArg(true);
        node5.putIntProp(12, (int) '#');
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING  15\n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING  15\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node5, node13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean4 = node3.isFalse();
        boolean boolean5 = node3.isVoid();
        boolean boolean6 = node3.isParamList();
        int int7 = node3.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node3.getChildAtIndex(42);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        java.lang.String str14 = node8.toString();
        node8.removeProp((int) (short) 0);
        boolean boolean17 = node8.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node23 = node8.useSourceInfoFromForTree(node21);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node23);
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node24);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node25.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        int int31 = node30.getSideEffectFlags();
        boolean boolean32 = node30.hasMoreThanOneChild();
        node30.setCharno(100);
        node25.addChildToBack(node30);
        node25.setType((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node25.getChildAtIndex(16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("OR 100\n");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean6 = node5.isFalse();
        java.lang.String str7 = node5.getSourceFileName();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = node12.srcref(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = node25.srcref(node29);
        java.lang.String str31 = node25.toString();
        node25.removeProp((int) (short) 0);
        boolean boolean34 = node25.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean39 = node38.isGetterDef();
        com.google.javascript.rhino.Node node40 = node25.useSourceInfoFromForTree(node38);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder41 = node38.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean46 = node45.isGetterDef();
        com.google.javascript.rhino.Node node47 = node38.useSourceInfoFrom(node45);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        java.lang.String str57 = node51.toString();
        node51.removeProp((int) (short) 0);
        boolean boolean60 = node51.isObjectLit();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean65 = node64.isGetterDef();
        com.google.javascript.rhino.Node node66 = node51.useSourceInfoFromForTree(node64);
        boolean boolean67 = node66.isObjectLit();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(54, node17, node21, node45, node66);
        boolean boolean69 = node68.isFromExterns();
        com.google.javascript.rhino.Node node70 = node5.srcrefTree(node68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node1.getChildBefore(node68);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node16.useSourceInfoFrom(node23);
        com.google.javascript.rhino.InputId inputId26 = node23.getInputId();
        boolean boolean27 = node23.isThis();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node23.getAncestors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node23.getChildAtIndex(10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 12, (-1), 43);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = node21.srcref(node25);
        java.lang.String str27 = node21.toString();
        node21.removeProp((int) (short) 0);
        boolean boolean30 = node21.isObjectLit();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean35 = node34.isGetterDef();
        com.google.javascript.rhino.Node node36 = node21.useSourceInfoFromForTree(node34);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder37 = node34.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean42 = node41.isGetterDef();
        com.google.javascript.rhino.Node node43 = node34.useSourceInfoFrom(node41);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node52 = node47.srcref(node51);
        java.lang.String str53 = node47.toString();
        node47.removeProp((int) (short) 0);
        boolean boolean56 = node47.isObjectLit();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean61 = node60.isGetterDef();
        com.google.javascript.rhino.Node node62 = node47.useSourceInfoFromForTree(node60);
        boolean boolean63 = node62.isObjectLit();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(54, node13, node17, node41, node62);
        int int66 = node17.getIntProp((int) (byte) 10);
        boolean boolean67 = node17.isTrue();
        node17.setSourceFileForTesting("Node tree inequality:\nTree1:\nNUMBER 1.0 54\n\n\nTree2:\nOR 100\n    OR 100\n\n\nSubtree1: NUMBER 1.0 54\n\n\nSubtree2: OR 100\n    OR 100\n");
        boolean boolean70 = node17.isExprResult();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        node75.setOptionalArg(true);
        boolean boolean78 = node75.isOr();
        node75.setSourceEncodedPosition((int) (byte) 0);
        java.util.Set<java.lang.String> strSet81 = node75.getDirectives();
        node75.detachChildren();
        boolean boolean83 = node75.isAssign();
        node17.addChildToBack(node75);
        boolean boolean85 = node17.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(61440, (int) 'a', 37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(4095);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        java.lang.String str31 = node27.getQualifiedName();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder32 = node27.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 1, 38, (int) '4');
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean60 = node59.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(4095, node41, node54, node59);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = node54.getStaticSourceFile();
        boolean boolean63 = node54.isTry();
        node54.setType(3);
        com.google.javascript.rhino.Node node66 = node36.copyInformationFrom(node54);
        com.google.javascript.rhino.Node node67 = node27.useSourceInfoFrom(node66);
        com.google.javascript.rhino.jstype.JSType jSType68 = node66.getJSType();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        boolean boolean72 = node71.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile73 = node71.getStaticSourceFile();
        boolean boolean74 = node71.isWhile();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean79 = node78.isAnd();
        boolean boolean80 = node78.isDebugger();
        boolean boolean81 = node78.isWhile();
        node78.setType((int) (byte) 0);
        com.google.javascript.rhino.Node node84 = node71.copyInformationFrom(node78);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable85 = node78.getAncestors();
        double double86 = node78.getDouble();
        boolean boolean87 = node78.isAnd();
        node66.putProp(46, (java.lang.Object) boolean87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node90 = node66.getChildAtIndex(61440);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) '#');
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = node5.srcref(node9);
        boolean boolean11 = node10.isDo();
        java.util.Set<java.lang.String> strSet12 = node10.getDirectives();
        boolean boolean13 = node10.isDebugger();
        boolean boolean14 = node10.isHook();
        boolean boolean15 = node10.isNew();
        boolean boolean16 = node10.isGetterDef();
        node10.setDouble((double) 'a');
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = node22.srcref(node26);
        java.lang.String str28 = node22.toString();
        node22.removeProp((int) (short) 0);
        boolean boolean31 = node22.isObjectLit();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean36 = node35.isGetterDef();
        com.google.javascript.rhino.Node node37 = node22.useSourceInfoFromForTree(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        boolean boolean47 = node46.isDo();
        java.util.Set<java.lang.String> strSet48 = node46.getDirectives();
        com.google.javascript.rhino.Node node49 = node35.clonePropsFrom(node46);
        java.lang.String str50 = node49.getSourceFileName();
        int int52 = node49.getIntProp(43);
        int int53 = node49.getSourcePosition();
        java.util.Set<java.lang.String> strSet54 = node49.getDirectives();
        com.google.javascript.rhino.Node node55 = node10.copyInformationFrom(node49);
        boolean boolean56 = node49.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node49);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 49, 2, 46);
        boolean boolean4 = node3.isIn();
        boolean boolean5 = node3.isReturn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(47);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        boolean boolean10 = node8.isFalse();
        int int11 = node8.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node15.setWasEmptyNode(false);
        boolean boolean19 = node15.isDec();
        java.lang.String str20 = node15.getSourceFileName();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100, node8, node15);
        boolean boolean22 = node8.isNot();
        node8.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean29 = node28.isFalse();
        java.lang.String str30 = node28.getSourceFileName();
        boolean boolean31 = node28.isLabel();
        boolean boolean32 = node28.isSetterDef();
        boolean boolean33 = node28.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = node42.srcref(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        boolean boolean57 = node51.isBreak();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 1, node38, node42, node51, node61, 1, (-1));
        boolean boolean65 = node64.isWith();
        boolean boolean66 = node64.isNot();
        boolean boolean67 = node28.isEquivalentToTyped(node64);
        boolean boolean68 = node64.isSyntheticBlock();
        com.google.javascript.rhino.Node node69 = node64.cloneTree();
        node64.setVarArgs(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node72 = node8.getChildBefore(node64);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("OR", (int) (short) -1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        java.lang.String str15 = node9.toString();
        node9.removeProp((int) (short) 0);
        boolean boolean18 = node9.isObjectLit();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean23 = node22.isGetterDef();
        com.google.javascript.rhino.Node node24 = node9.useSourceInfoFromForTree(node22);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 1, node24);
        com.google.javascript.rhino.Node node26 = node4.useSourceInfoFromForTree(node25);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.siblings();
        boolean boolean28 = node26.isCase();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = node26.getJSDocInfo();
        boolean boolean30 = node26.isIn();
        boolean boolean31 = node26.isNew();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(48, node26);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n");
        node34.putBooleanProp(42, true);
        boolean boolean38 = node34.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node26.removeChild(node34);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "true");
        boolean boolean3 = node2.isReturn();
        boolean boolean4 = node2.isName();
        com.google.javascript.rhino.Node node5 = node2.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node2.getChildAtIndex(19);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean5 = node4.isDo();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str10 = node9.toString();
        com.google.javascript.rhino.Node node11 = node9.cloneTree();
        boolean boolean12 = node11.isAssignAdd();
        boolean boolean13 = node11.isFromExterns();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node22.isDo();
        java.util.Set<java.lang.String> strSet24 = node22.getDirectives();
        boolean boolean25 = node22.isString();
        int int26 = node22.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node11.srcrefTree(node22);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = node31.srcref(node35);
        java.lang.Object obj38 = node31.getProp(10);
        boolean boolean39 = node31.isInc();
        boolean boolean40 = node31.isNull();
        boolean boolean41 = node31.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node22, node31);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node4.isCall();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = node35.srcref(node39);
        java.lang.String str41 = node35.toString();
        node35.removeProp((int) (short) 0);
        boolean boolean44 = node35.isObjectLit();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean49 = node48.isGetterDef();
        com.google.javascript.rhino.Node node50 = node35.useSourceInfoFromForTree(node48);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder51 = node48.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean56 = node55.isGetterDef();
        com.google.javascript.rhino.Node node57 = node48.useSourceInfoFrom(node55);
        com.google.javascript.rhino.InputId inputId58 = node48.getInputId();
        boolean boolean59 = node4.isEquivalentToTyped(node48);
        boolean boolean60 = node4.isCatch();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node74 = node69.srcref(node73);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node83 = node78.srcref(node82);
        boolean boolean84 = node78.isBreak();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node((int) (byte) 1, node65, node69, node78, node88, 1, (-1));
        java.lang.String str92 = node88.getQualifiedName();
        boolean boolean93 = node88.isDec();
        boolean boolean94 = node88.isSyntheticBlock();
        com.google.javascript.rhino.Node node95 = node4.srcrefTree(node88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node97 = node88.getChildAtIndex(43);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = node28.srcref(node32);
        java.lang.String str34 = node28.toString();
        node28.removeProp((int) (short) 0);
        boolean boolean37 = node28.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean42 = node41.isGetterDef();
        com.google.javascript.rhino.Node node43 = node28.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.Node node44 = node24.copyInformationFromForTree(node28);
        boolean boolean45 = node44.isQualifiedName();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        boolean boolean56 = node54.isFalse();
        int int57 = node54.getSideEffectFlags();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        node61.setWasEmptyNode(false);
        boolean boolean65 = node61.isDec();
        java.lang.String str66 = node61.getSourceFileName();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(100, node54, node61);
        int int68 = node54.getLineno();
        boolean boolean69 = node54.isSetterDef();
        com.google.javascript.rhino.Node node70 = node44.srcref(node54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node72 = node54.getChildAtIndex(10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node8.isInstanceOf();
        boolean boolean32 = node8.isNot();
        boolean boolean33 = node8.isDebugger();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean38 = node37.isAnd();
        boolean boolean40 = node37.getBooleanProp(4);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node37.siblings();
        node37.putBooleanProp((int) (short) 100, false);
        boolean boolean45 = node37.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean52 = node51.isDo();
        boolean boolean53 = node51.isBlock();
        boolean boolean54 = node51.isStringKey();
        node37.putProp((int) (byte) 10, (java.lang.Object) node51);
        boolean boolean56 = node37.isNE();
        boolean boolean57 = node37.isOptionalArg();
        boolean boolean58 = node37.isIf();
        double double59 = node37.getDouble();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node37);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = node5.srcref(node9);
        java.lang.String str11 = node5.toString();
        int int12 = node1.getIndexOfChild(node5);
        boolean boolean13 = node1.wasEmptyNode();
        int int14 = node1.getCharno();
        com.google.javascript.rhino.Node node15 = node1.cloneTree();
        boolean boolean16 = node15.isQuotedString();
        boolean boolean17 = node15.isWith();
        boolean boolean18 = node15.isAssignAdd();
        boolean boolean19 = node15.isReturn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node15.getChildAtIndex((int) ' ');
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("(hi!)", 0, 0);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder4 = node3.new FileLevelJsDocBuilder();
        boolean boolean5 = node3.isDo();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = node10.srcref(node14);
        java.lang.String str16 = node10.toString();
        node10.removeProp((int) (short) 0);
        boolean boolean19 = node10.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node10.useSourceInfoFromForTree(node23);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 1, node25);
        boolean boolean27 = node26.isOr();
        boolean boolean28 = node26.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node29 = node3.getChildBefore(node26);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        boolean boolean3 = node2.isBlock();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str8 = node7.toString();
        com.google.javascript.rhino.Node node9 = node7.cloneTree();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 10);
        boolean boolean12 = node9.isEquivalentToTyped(node11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean17 = node16.isFalse();
        java.lang.String str18 = node16.getSourceFileName();
        boolean boolean19 = node16.isLabel();
        boolean boolean20 = node16.isSetterDef();
        boolean boolean21 = node16.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = node30.srcref(node34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = node39.srcref(node43);
        boolean boolean45 = node39.isBreak();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) 1, node26, node30, node39, node49, 1, (-1));
        boolean boolean53 = node52.isWith();
        boolean boolean54 = node52.isNot();
        boolean boolean55 = node16.isEquivalentToTyped(node52);
        boolean boolean56 = node52.isSyntheticBlock();
        boolean boolean57 = node11.isEquivalentTo(node52);
        node11.setDouble((double) 48);
        node11.setVarArgs(false);
        com.google.javascript.rhino.Node node62 = node2.clonePropsFrom(node11);
        boolean boolean63 = node2.isName();
        boolean boolean64 = node2.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = node2.getChildAtIndex(12325);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = node34.srcref(node38);
        java.lang.String str40 = node34.toString();
        node34.removeProp((int) (short) 0);
        boolean boolean43 = node34.isGetProp();
        boolean boolean44 = node34.isReturn();
        com.google.javascript.rhino.Node node45 = node4.srcref(node34);
        boolean boolean46 = node4.isObjectLit();
        boolean boolean47 = node4.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = node4.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.common.collect.ImmutableList.Builder<java.io.Serializable> serializableBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.io.Serializable>();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = node5.srcref(node9);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = node14.srcref(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean24 = node23.isBreak();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(4095, node5, node18, node23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        node5.setDirectives((java.util.Set<java.lang.String>) strSet29);
        java.lang.Object[] objArray32 = strSet29.toArray();
        com.google.common.collect.ImmutableList.Builder<java.io.Serializable> serializableBuilder33 = serializableBuilder0.add((java.io.Serializable) strSet29);
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.jstype.BooleanLiteralSet>> booleanLiteralSetEnumList34 = com.google.common.collect.ImmutableList.of();
        com.google.common.collect.ImmutableList.Builder<java.io.Serializable> serializableBuilder35 = serializableBuilder33.add((java.io.Serializable) booleanLiteralSetEnumList34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = node39.srcref(node43);
        java.lang.String str45 = node39.toString();
        node39.removeProp((int) (short) 0);
        boolean boolean48 = node39.isObjectLit();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean53 = node52.isGetterDef();
        com.google.javascript.rhino.Node node54 = node39.useSourceInfoFromForTree(node52);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = node58.srcref(node62);
        boolean boolean64 = node63.isDo();
        java.util.Set<java.lang.String> strSet65 = node63.getDirectives();
        com.google.javascript.rhino.Node node66 = node52.clonePropsFrom(node63);
        boolean boolean67 = node63.isDebugger();
        com.google.javascript.rhino.Node node68 = node63.getFirstChild();
        boolean boolean69 = node63.isContinue();
        boolean boolean70 = node63.hasOneChild();
        boolean boolean71 = node63.isThis();
        boolean boolean72 = node63.isAdd();
        com.google.common.collect.ImmutableList.Builder<java.io.Serializable> serializableBuilder73 = serializableBuilder33.add((java.io.Serializable) node63);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(35, "Not declared as a constructor");
        java.lang.String str80 = node76.toString(false, false, true);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node76.children();
        com.google.javascript.rhino.Node node82 = node63.useSourceInfoFromForTree(node76);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 45);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (short) 10, 10, (int) (short) -1);
        node84.addChildToBack(node88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node90 = node63.getChildBefore(node84);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        boolean boolean32 = node9.isInstanceOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = node42.srcref(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        boolean boolean57 = node51.isBreak();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 1, node38, node42, node51, node61, 1, (-1));
        java.lang.String str65 = node61.getQualifiedName();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean70 = node69.isAnd();
        node69.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str73 = node61.checkTreeEquals(node69);
        jSDocInfo33.setAssociatedNode(node61);
        com.google.javascript.rhino.Node node75 = node9.useSourceInfoIfMissingFrom(node61);
        typePosition0.setItem(node75);
        int int77 = node75.getSourcePosition();
        boolean boolean78 = node75.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = node75.getChildAtIndex(13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean37 = node36.isFalse();
        java.lang.String str38 = node36.getSourceFileName();
        boolean boolean39 = node36.isLabel();
        node5.putProp(1, (java.lang.Object) node36);
        node5.detachChildren();
        node5.setSourceEncodedPosition((int) (short) 100);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node52 = node47.srcref(node51);
        boolean boolean53 = node52.isDo();
        java.util.Set<java.lang.String> strSet54 = node52.getDirectives();
        boolean boolean55 = node52.isString();
        node52.setWasEmptyNode(false);
        boolean boolean58 = node52.isGetterDef();
        com.google.javascript.rhino.Node node59 = node5.useSourceInfoFrom(node52);
        double double60 = node52.getDouble();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(3, "Not declared as a constructor");
        boolean boolean64 = node63.isAssign();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node74 = node69.srcref(node73);
        boolean boolean75 = node74.isDo();
        java.util.Set<java.lang.String> strSet76 = node74.getDirectives();
        boolean boolean77 = node74.isString();
        node74.setWasEmptyNode(false);
        boolean boolean80 = node74.isObjectLit();
        boolean boolean81 = node74.isParamList();
        boolean boolean82 = node74.hasOneChild();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(38, node74, (int) (byte) -1, 0);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(32, node52, node63, node85, 16, 53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node90 = node88.getChildAtIndex(397316);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        java.lang.String str32 = node28.getQualifiedName();
        com.google.javascript.rhino.Node node33 = node28.detachFromParent();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        java.lang.String str47 = node41.toString();
        node41.removeProp((int) (short) 0);
        boolean boolean50 = node41.isObjectLit();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean55 = node54.isGetterDef();
        com.google.javascript.rhino.Node node56 = node41.useSourceInfoFromForTree(node54);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder57 = node54.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean62 = node61.isGetterDef();
        com.google.javascript.rhino.Node node63 = node54.useSourceInfoFrom(node61);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node72 = node67.srcref(node71);
        boolean boolean73 = node71.isFalse();
        com.google.javascript.rhino.Node node74 = node61.useSourceInfoIfMissingFrom(node71);
        boolean boolean75 = node74.isTrue();
        node74.addSuppression("NUMBER 1.0 [directives: [, hi!]]");
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString("true", (int) (short) 1, 38);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, node37, node74, node81);
        boolean boolean83 = node33.hasChildren();
        java.lang.String str87 = node33.toString(true, true, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node89 = node33.getChildAtIndex(397316);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str4 = node3.toString();
        com.google.javascript.rhino.Node node5 = node3.cloneTree();
        boolean boolean6 = node5.isAssignAdd();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = node15.srcref(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = node24.srcref(node28);
        boolean boolean30 = node24.isBreak();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 1, node11, node15, node24, node34, 1, (-1));
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean43 = node42.isFalse();
        java.lang.String str44 = node42.getSourceFileName();
        boolean boolean45 = node42.isLabel();
        node11.putProp(1, (java.lang.Object) node42);
        com.google.javascript.rhino.Node node47 = node5.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        boolean boolean57 = node56.isDo();
        java.util.Set<java.lang.String> strSet58 = node56.getDirectives();
        boolean boolean59 = node56.isString();
        node56.setWasEmptyNode(false);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = node56.getJSDocInfo();
        boolean boolean63 = node56.isNE();
        java.lang.String str64 = node56.getSourceFileName();
        boolean boolean65 = node56.isReturn();
        com.google.javascript.rhino.Node node66 = node11.copyInformationFrom(node56);
        int int67 = node56.getType();
        boolean boolean68 = node56.isTry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node70 = node56.getChildAtIndex(31);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(0, "true");
        boolean boolean4 = node3.isReturn();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node3.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(40, node3, (int) (byte) 1, 48);
        boolean boolean9 = node8.isDec();
        node8.setOptionalArg(true);
        com.google.javascript.rhino.Node node12 = node8.cloneTree();
        boolean boolean13 = node12.isLocalResultCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node12.getChildAtIndex(12325);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(52, "Named type with empty name component");
        boolean boolean3 = node2.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean27 = node26.isBreak();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(4095, node8, node21, node26);
        java.util.Set<java.lang.String> strSet29 = node28.getDirectives();
        boolean boolean30 = node28.isDebugger();
        int int31 = node28.getSourceOffset();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        java.util.Set<java.lang.String> strSet37 = node35.getDirectives();
        boolean boolean38 = node35.hasChildren();
        node35.setSourceEncodedPosition(4);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = node44.srcref(node48);
        java.lang.Object obj51 = node44.getProp(10);
        boolean boolean52 = node44.isArrayLit();
        com.google.javascript.rhino.Node node53 = node35.copyInformationFrom(node44);
        com.google.javascript.rhino.Node node54 = node53.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node28, node53);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet28);
        int int31 = node4.getCharno();
        boolean boolean32 = node4.isParamList();
        boolean boolean33 = node4.isName();
        boolean boolean34 = node4.isOptionalArg();
        boolean boolean35 = node4.isAnd();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = node44.srcref(node48);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node58 = node53.srcref(node57);
        boolean boolean59 = node53.isBreak();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) 1, node40, node44, node53, node63, 1, (-1));
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean72 = node71.isFalse();
        java.lang.String str73 = node71.getSourceFileName();
        boolean boolean74 = node71.isLabel();
        node40.putProp(1, (java.lang.Object) node71);
        node40.detachChildren();
        node40.setSourceEncodedPosition((int) (short) 100);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node87 = node82.srcref(node86);
        boolean boolean88 = node87.isDo();
        java.util.Set<java.lang.String> strSet89 = node87.getDirectives();
        boolean boolean90 = node87.isString();
        node87.setWasEmptyNode(false);
        boolean boolean93 = node87.isGetterDef();
        com.google.javascript.rhino.Node node94 = node40.useSourceInfoFrom(node87);
        boolean boolean95 = node87.isStringKey();
        boolean boolean96 = node87.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node87);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(3, "[PROTECTED]", 3, 37);
        boolean boolean5 = node4.isSetterDef();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable6 = node4.getAncestors();
        com.google.javascript.rhino.Node node7 = node4.removeFirstChild();
        com.google.javascript.rhino.Node node8 = node4.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node4.getChildAtIndex(40);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray4, 40, (int) (short) 0);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) 'a', nodeArray4);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray4);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, nodeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) '4');
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean5 = node4.isAnd();
        boolean boolean6 = node4.isDebugger();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(40, node4, (int) (short) 100, 29);
        boolean boolean10 = node4.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node4.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 12, 52, 50);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(32, (-1), 4);
        boolean boolean8 = node7.isGetProp();
        boolean boolean9 = node3.hasChild(node7);
        com.google.javascript.rhino.Node node10 = node7.getNext();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = node14.srcref(node18);
        java.lang.String str20 = node14.toString();
        node14.removeProp((int) (short) 0);
        boolean boolean23 = node14.isObjectLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean28 = node27.isGetterDef();
        com.google.javascript.rhino.Node node29 = node14.useSourceInfoFromForTree(node27);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = node33.srcref(node37);
        boolean boolean39 = node38.isDo();
        java.util.Set<java.lang.String> strSet40 = node38.getDirectives();
        com.google.javascript.rhino.Node node41 = node27.clonePropsFrom(node38);
        boolean boolean42 = node38.isDebugger();
        com.google.javascript.rhino.Node node43 = node38.getFirstChild();
        com.google.javascript.rhino.InputId inputId44 = node38.getInputId();
        boolean boolean45 = node38.isAdd();
        boolean boolean46 = node38.isParamList();
        boolean boolean47 = node38.isThis();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        boolean boolean57 = node56.isDo();
        java.util.Set<java.lang.String> strSet58 = node56.getDirectives();
        boolean boolean59 = node56.isDebugger();
        boolean boolean60 = node56.isHook();
        node56.addSuppression("Node tree inequality:\nTree1:\nNUMBER 1.0 54\n\n\nTree2:\nOR 100\n    OR 100\n\n\nSubtree1: NUMBER 1.0 54\n\n\nSubtree2: OR 100\n    OR 100\n");
        boolean boolean63 = node56.isEmpty();
        node56.setType(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChild(node38, node56);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        boolean boolean6 = node3.getBooleanProp(4);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isUnscopedQualifiedName();
        boolean boolean9 = node3.isVarArgs();
        boolean boolean10 = node3.isTypeOf();
        boolean boolean11 = node3.isTry();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node15.setWasEmptyNode(false);
        boolean boolean19 = node15.isDec();
        java.lang.String str20 = node15.getSourceFileName();
        node15.detachChildren();
        int int22 = node15.getLineno();
        boolean boolean23 = node3.hasChild(node15);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder24 = node15.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = node33.srcref(node37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = node38.getJSDocInfo();
        boolean boolean40 = node38.isQualifiedName();
        com.google.javascript.rhino.Node node41 = node29.useSourceInfoFromForTree(node38);
        boolean boolean42 = node29.isVarArgs();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node52 = node47.srcref(node51);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node61 = node56.srcref(node60);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean66 = node65.isBreak();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(4095, node47, node60, node65);
        boolean boolean68 = node60.isFunction();
        boolean boolean69 = node60.isInstanceOf();
        boolean boolean70 = node60.isHook();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node81 = node76.srcref(node80);
        java.lang.String str82 = node76.toString();
        int int83 = node72.getIndexOfChild(node76);
        boolean boolean84 = node72.wasEmptyNode();
        node60.addChildrenToFront(node72);
        com.google.javascript.rhino.Node node86 = node29.useSourceInfoIfMissingFromForTree(node72);
        com.google.javascript.rhino.Node node87 = node15.useSourceInfoFromForTree(node86);
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = node15.getJSDocInfo();
        boolean boolean89 = node15.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node15.getChildAtIndex(37);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = node35.srcref(node39);
        boolean boolean41 = node39.isVar();
        double double42 = node39.getDouble();
        boolean boolean43 = node39.isParamList();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        boolean boolean47 = node46.isDec();
        node46.setOptionalArg(false);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(53, node31, node39, node46, 0, (int) (short) -1);
        com.google.javascript.rhino.Node node53 = node46.getLastSibling();
        com.google.javascript.rhino.Node[] nodeArray58 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray58, 40, (int) (short) 0);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) 'a', nodeArray58);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(50, nodeArray58, 53, 1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) 100, nodeArray58, 409652, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node69 = node53.getChildBefore(node68);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        boolean boolean25 = node17.isFunction();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean30 = node29.isAnd();
        node29.setSourceFileForTesting("[PROTECTED]");
        node29.putIntProp(1, 4095);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node40 = node29.useSourceInfoFromForTree(node39);
        com.google.javascript.rhino.Node node41 = node17.copyInformationFrom(node29);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = node45.srcref(node49);
        boolean boolean51 = node49.isVar();
        double double52 = node49.getDouble();
        boolean boolean53 = node49.isNull();
        node41.addChildrenToFront(node49);
        int int55 = node41.getSourcePosition();
        boolean boolean56 = node41.isInc();
        boolean boolean57 = node41.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node41.getChildAtIndex(61537);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        boolean boolean25 = node4.isSyntheticBlock();
        boolean boolean26 = node4.isScript();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = node36.srcref(node40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = node45.srcref(node49);
        boolean boolean51 = node45.isBreak();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) 1, node32, node36, node45, node55, 1, (-1));
        java.lang.String str59 = node55.getQualifiedName();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean64 = node63.isAnd();
        node63.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str67 = node55.checkTreeEquals(node63);
        jSDocInfo27.setAssociatedNode(node55);
        java.util.Collection<java.lang.String> strCollection69 = jSDocInfo27.getAuthors();
        boolean boolean71 = jSDocInfo27.hasParameterType("Not declared as a constructor");
        java.util.Collection<java.lang.String> strCollection72 = jSDocInfo27.getReferences();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression73 = jSDocInfo27.getBaseType();
        com.google.javascript.rhino.Node node74 = jSDocInfo27.getAssociatedNode();
        java.lang.String str75 = node4.checkTreeEquals(node74);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean80 = node79.isAnd();
        node79.setSourceFileForTesting("[PROTECTED]");
        node79.putIntProp(1, 4095);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node90 = node79.useSourceInfoFromForTree(node89);
        java.lang.Object obj92 = node79.getProp((int) (byte) 100);
        com.google.javascript.rhino.Node node93 = node4.srcrefTree(node79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node95 = node93.getChildAtIndex(9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str4 = node3.toString();
        com.google.javascript.rhino.Node node5 = node3.cloneTree();
        boolean boolean6 = node3.isCase();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = node11.srcref(node15);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = node20.srcref(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean30 = node29.isBreak();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(4095, node11, node24, node29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        node11.setDirectives((java.util.Set<java.lang.String>) strSet35);
        boolean boolean39 = strSet35.add("true");
        java.lang.String[] strArray41 = new java.lang.String[] { "[PROTECTED]" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.Iterator<java.lang.String> strItor44 = strSet42.iterator();
        java.lang.Object[] objArray45 = strSet42.toArray();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = node59.srcref(node63);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean69 = node68.isBreak();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(4095, node50, node63, node68);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        node50.setDirectives((java.util.Set<java.lang.String>) strSet74);
        boolean boolean78 = strSet74.add("true");
        com.google.common.collect.ImmutableList<java.util.HashSet<java.lang.String>> strSetList79 = com.google.common.collect.ImmutableList.of((java.util.HashSet<java.lang.String>) strSet35, (java.util.HashSet<java.lang.String>) strSet42, (java.util.HashSet<java.lang.String>) strSet74);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        boolean boolean84 = node83.isEmpty();
        boolean boolean85 = strSet74.remove((java.lang.Object) node83);
        node83.setLineno(8);
        int int88 = node83.getChildCount();
        boolean boolean89 = node83.isFunction();
        node83.setSourceFileForTesting("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node92 = node3.getChildBefore(node83);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(61440, "");
        node2.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = node10.srcref(node14);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = node19.srcref(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean29 = node28.isBreak();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(4095, node10, node23, node28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        node10.setDirectives((java.util.Set<java.lang.String>) strSet34);
        com.google.javascript.rhino.Node node37 = node10.detachFromParent();
        int int38 = node10.getSideEffectFlags();
        boolean boolean39 = node10.isWhile();
        boolean boolean41 = node10.getBooleanProp(15);
        node2.addChildToFront(node10);
        java.lang.String str43 = node10.getQualifiedName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 12, 52, 50);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean53 = node52.isThis();
        boolean boolean54 = node52.isVoid();
        node52.setLength(51);
        boolean boolean57 = node52.isCatch();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node48, node52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node48);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        boolean boolean19 = node3.isThis();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node25 = node23.cloneTree();
        node25.setOptionalArg(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node25.getAncestors();
        boolean boolean29 = node25.isGetElem();
        boolean boolean30 = node3.isEquivalentTo(node25);
        boolean boolean31 = node25.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node25.getChildAtIndex(39);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        boolean boolean4 = node1.isWhile();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(48, 100, 8);
        node1.addChildToBack(node8);
        java.lang.String str10 = node1.getSourceFileName();
        java.lang.String str11 = node1.getQualifiedName();
        boolean boolean12 = node1.isNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node1.getChildAtIndex(43);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node8.isDo();
        java.util.Set<java.lang.String> strSet10 = node8.getDirectives();
        java.lang.String str14 = node8.toString(false, false, false);
        boolean boolean15 = node8.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node8.getChildAtIndex(7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        java.util.Set<java.lang.String> strSet5 = node3.getDirectives();
        boolean boolean6 = node3.hasChildren();
        boolean boolean7 = node3.isWhile();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(61440, "");
        node10.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node13 = node10.cloneTree();
        node3.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(10, 45, (int) (short) 10);
        com.google.javascript.rhino.Node node19 = node18.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node18);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("STRING NUMBER 1.0 [directives: [, hi!]] 51", 0, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean27 = node26.isBreak();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(4095, node8, node21, node26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        node8.setDirectives((java.util.Set<java.lang.String>) strSet32);
        int int35 = node8.getCharno();
        boolean boolean36 = node8.isParamList();
        boolean boolean37 = node8.isName();
        boolean boolean38 = node8.isGetProp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder39 = node8.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node40 = node3.copyInformationFromForTree(node8);
        node40.detachChildren();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        boolean boolean44 = node43.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node43.getStaticSourceFile();
        boolean boolean46 = node43.isWhile();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(48, 100, 8);
        node43.addChildToBack(node50);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        int int54 = node53.getSourcePosition();
        boolean boolean55 = node50.hasChild(node53);
        boolean boolean56 = node53.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node40.getChildBefore(node53);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        boolean boolean25 = node17.isNumber();
        boolean boolean26 = node17.isLocalResultCall();
        boolean boolean27 = node17.isFalse();
        int int28 = node17.getSourceOffset();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = node33.srcref(node37);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = node42.srcref(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean52 = node51.isBreak();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(4095, node33, node46, node51);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = node46.getStaticSourceFile();
        boolean boolean55 = node46.isTry();
        node46.setType(3);
        boolean boolean58 = node46.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean64 = node63.isDo();
        boolean boolean65 = node63.isBlock();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean70 = node69.isBreak();
        node69.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node73 = node69.cloneTree();
        com.google.javascript.rhino.Node node74 = node63.useSourceInfoIfMissingFromForTree(node69);
        com.google.javascript.rhino.Node node75 = node46.copyInformationFromForTree(node74);
        com.google.javascript.rhino.Node node76 = node17.useSourceInfoFromForTree(node74);
        boolean boolean77 = node74.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = node74.getChildAtIndex(51);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        node4.setOptionalArg(true);
        boolean boolean7 = node4.isOr();
        node4.setSourceEncodedPosition((int) (byte) 0);
        java.util.Set<java.lang.String> strSet10 = node4.getDirectives();
        node4.detachChildren();
        boolean boolean12 = node4.isDo();
        java.lang.String[] strArray25 = new java.lang.String[] { "true", "true", "Not declared as a type name", "(hi!)", "(Not declared as a type name)", "Node tree inequality:\nTree1:\nNUMBER 1.0 54\n\n\nTree2:\nOR 100\n    OR 100\n\n\nSubtree1: NUMBER 1.0 54\n\n\nSubtree2: OR 100\n    OR 100\n", "OR 0 [var_args_name: 1]\n", "()", "NEW [PROTECTED]", "GETELEM Not declared as a constructor", "STRING  [jsdoc_info: JSDocInfo]\n    NUMBER 1.0 [jsdoc_info: JSDocInfo]\n", "STRING NUMBER 1.0 [directives: [, hi!]] 51" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        int int28 = strSet26.size();
        node4.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 49, 42, 43);
        boolean boolean34 = node33.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node33);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean5 = node4.isVar();
        boolean boolean6 = node4.isString();
        boolean boolean7 = node4.isDec();
        boolean boolean8 = node4.isLabel();
        boolean boolean9 = node4.isDelProp();
        boolean boolean10 = node4.isStringKey();
        node4.setCharno(4);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean18 = node17.isFalse();
        com.google.javascript.rhino.Node node19 = node17.cloneTree();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = node28.srcref(node32);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = node37.srcref(node41);
        boolean boolean43 = node37.isBreak();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) 1, node24, node28, node37, node47, 1, (-1));
        java.lang.String str51 = node47.getQualifiedName();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean56 = node55.isAnd();
        node55.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str59 = node47.checkTreeEquals(node55);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', node17, node55);
        node60.setOptionalArg(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node60);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(11, "GETELEM Not declared as a constructor", 38, 0);
        boolean boolean5 = node4.isTypeOf();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = node10.srcref(node14);
        java.lang.String str16 = node10.toString();
        node10.removeProp((int) (short) 0);
        boolean boolean19 = node10.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean24 = node23.isGetterDef();
        com.google.javascript.rhino.Node node25 = node10.useSourceInfoFromForTree(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node34.isDo();
        java.util.Set<java.lang.String> strSet36 = node34.getDirectives();
        com.google.javascript.rhino.Node node37 = node23.clonePropsFrom(node34);
        boolean boolean38 = node34.isDebugger();
        com.google.javascript.rhino.Node node39 = node34.getFirstChild();
        boolean boolean40 = node34.isSetterDef();
        boolean boolean41 = node34.isLocalResultCall();
        boolean boolean42 = node34.isQualifiedName();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = node46.srcref(node50);
        boolean boolean52 = node50.isFalse();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        java.util.Set<java.lang.String> strSet58 = node56.getDirectives();
        boolean boolean59 = node56.hasChildren();
        com.google.javascript.rhino.Node node60 = node56.cloneTree();
        node60.setOptionalArg(false);
        com.google.javascript.rhino.Node node63 = node50.srcref(node60);
        int int64 = node50.getCharno();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) '4', node34, node50, (int) (byte) 0, 61440);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node34);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = node35.srcref(node39);
        boolean boolean41 = node39.isVar();
        double double42 = node39.getDouble();
        boolean boolean43 = node39.isParamList();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        boolean boolean47 = node46.isDec();
        node46.setOptionalArg(false);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(53, node31, node39, node46, 0, (int) (short) -1);
        boolean boolean53 = node39.isEmpty();
        boolean boolean54 = node39.isInstanceOf();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(0.0d);
        boolean boolean57 = node56.isInstanceOf();
        boolean boolean59 = node56.getBooleanProp((int) ' ');
        node39.addChildrenToBack(node56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node62 = node56.getChildAtIndex(29);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = node5.srcref(node9);
        java.lang.String str11 = node5.toString();
        int int12 = node1.getIndexOfChild(node5);
        boolean boolean13 = node1.wasEmptyNode();
        int int14 = node1.getCharno();
        boolean boolean15 = node1.isNE();
        int int16 = node1.getLength();
        boolean boolean17 = node1.isScript();
        int int18 = node1.getLength();
        boolean boolean19 = node1.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node1.getChildAtIndex(7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        boolean boolean10 = node8.isFalse();
        int int11 = node8.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node15.setWasEmptyNode(false);
        boolean boolean19 = node15.isDec();
        java.lang.String str20 = node15.getSourceFileName();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100, node8, node15);
        int int22 = node8.getLineno();
        boolean boolean23 = node8.isSetterDef();
        com.google.javascript.rhino.InputId inputId24 = node8.getInputId();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node34.isDo();
        java.util.Set<java.lang.String> strSet36 = node34.getDirectives();
        boolean boolean37 = node34.isString();
        node34.setWasEmptyNode(false);
        boolean boolean40 = node34.isGetterDef();
        boolean boolean41 = node34.isFunction();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = node45.srcref(node49);
        boolean boolean51 = node49.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = node49.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile53 = node49.getStaticSourceFile();
        java.lang.String str54 = node49.getSourceFileName();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(2, node34, node49, node58, 32, 0);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean66 = node65.isThis();
        node65.setSourceEncodedPositionForTree(0);
        boolean boolean69 = node65.hasOneChild();
        node65.setVarArgs(true);
        java.lang.String str72 = node49.checkTreeEquals(node65);
        boolean boolean73 = node49.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node74 = node8.getChildBefore(node49);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("STRING ", 53, (int) (short) 100);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (short) -1, 4095);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node7.getStaticSourceFile();
        boolean boolean9 = node7.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node3.getChildBefore(node7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        boolean boolean4 = node1.isWhile();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(48, 100, 8);
        node1.addChildToBack(node8);
        java.lang.String str10 = node1.getSourceFileName();
        java.lang.String str11 = node1.getQualifiedName();
        boolean boolean12 = node1.isAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node1.getChildAtIndex(38);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str5 = node4.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(46, node4);
        com.google.javascript.rhino.Node node7 = node4.detachFromParent();
        boolean boolean8 = node4.isContinue();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        node13.setOptionalArg(true);
        boolean boolean16 = node13.isOr();
        node13.setSourceEncodedPosition((int) (byte) 0);
        java.util.Set<java.lang.String> strSet19 = node13.getDirectives();
        boolean boolean20 = node13.isNumber();
        boolean boolean21 = node13.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node4.getChildBefore(node13);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(10, "STRING hi! 97");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(0, "true");
        boolean boolean6 = node5.isReturn();
        boolean boolean7 = node5.isUnscopedQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo8.getParameterType("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo8.getEnumParameterType();
        java.lang.String str12 = jSDocInfo8.getLicense();
        boolean boolean13 = jSDocInfo8.isExterns();
        boolean boolean14 = jSDocInfo8.isConsistentIdGenerator();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection15 = jSDocInfo8.getTypeNodes();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = node24.srcref(node28);
        java.lang.String str30 = node24.toString();
        node24.removeProp((int) (short) 0);
        boolean boolean33 = node24.isObjectLit();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean38 = node37.isGetterDef();
        com.google.javascript.rhino.Node node39 = node24.useSourceInfoFromForTree(node37);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 1, node39);
        com.google.javascript.rhino.Node node41 = node19.useSourceInfoFromForTree(node40);
        jSDocInfo8.setAssociatedNode(node40);
        boolean boolean43 = node5.isEquivalentToTyped(node40);
        com.google.javascript.rhino.Node node44 = node2.useSourceInfoFromForTree(node40);
        node44.removeProp(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node48 = node44.getChildAtIndex(221184);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node8.isInstanceOf();
        boolean boolean32 = node8.isCase();
        int int33 = node8.getLineno();
        int int34 = node8.getType();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        node8.putProp((int) (byte) -1, (java.lang.Object) "hi!");
        boolean boolean41 = node8.isQualifiedName();
        int int42 = node8.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node44 = node8.getChildAtIndex(47);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        boolean boolean32 = node9.isInstanceOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = node42.srcref(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        boolean boolean57 = node51.isBreak();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 1, node38, node42, node51, node61, 1, (-1));
        java.lang.String str65 = node61.getQualifiedName();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean70 = node69.isAnd();
        node69.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str73 = node61.checkTreeEquals(node69);
        jSDocInfo33.setAssociatedNode(node61);
        com.google.javascript.rhino.Node node75 = node9.useSourceInfoIfMissingFrom(node61);
        typePosition0.setItem(node75);
        com.google.javascript.rhino.Node node77 = typePosition0.getItem();
        boolean boolean78 = node77.isNull();
        com.google.javascript.rhino.Node node79 = node77.cloneNode();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("Named type with empty name component", 38, 46);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber((double) 35);
        int int87 = node86.getChildCount();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(42, node84, node86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node77.removeChild(node86);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        boolean boolean25 = node17.isFunction();
        boolean boolean26 = node17.isInstanceOf();
        boolean boolean27 = node17.isTrue();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder28 = node17.getJsDocBuilderForNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node17.getChildAtIndex(12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = node5.srcref(node9);
        java.lang.String str11 = node5.toString();
        int int12 = node1.getIndexOfChild(node5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = node1.getJSDocInfo();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        java.lang.String str23 = node17.toString();
        node17.removeProp((int) (short) 0);
        boolean boolean26 = node17.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean31 = node30.isGetterDef();
        com.google.javascript.rhino.Node node32 = node17.useSourceInfoFromForTree(node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = node36.srcref(node40);
        boolean boolean42 = node41.isDo();
        java.util.Set<java.lang.String> strSet43 = node41.getDirectives();
        com.google.javascript.rhino.Node node44 = node30.clonePropsFrom(node41);
        boolean boolean45 = node41.isNot();
        node41.putBooleanProp(0, false);
        node41.setSourceFileForTesting("(STRING \n)");
        com.google.javascript.rhino.Node node51 = node41.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node51);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node8.isDo();
        java.util.Set<java.lang.String> strSet10 = node8.getDirectives();
        boolean boolean11 = node8.isString();
        node8.setWasEmptyNode(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable14 = node8.getAncestors();
        boolean boolean15 = node8.isScript();
        boolean boolean16 = node8.hasMoreThanOneChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node8.getJsDocBuilderForNode();
        node8.setLength((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node8.getChildAtIndex(5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.lang.String[] strArray26 = new java.lang.String[] { "(hi!)", "()", "Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n", "([PROTECTED])", "Named type with empty name component", "NUMBER 1.0 97", "(NUMBER 1.0)", "", "hi!", "()", "Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING \n", "Unknown class name", "NUMBER 1.0\n", "JSDocInfo", "Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING \n", "INSTANCEOF\n    NUMBER 1.0\n    NUMBER 1.0\n", "([PROTECTED])", "Named type with empty name component", "(JSDocInfo)", "OR 100\n", "Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING \n", "([PROTECTED])", "NUMBER 1.0\n", "NUMBER 1.0", "(NUMBER 1.0)", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = node37.srcref(node41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = node46.srcref(node50);
        boolean boolean52 = node46.isBreak();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) 1, node33, node37, node46, node56, 1, (-1));
        com.google.javascript.rhino.Node node60 = node59.cloneNode();
        int int62 = node59.getIntProp(10);
        boolean boolean63 = strSet27.remove((java.lang.Object) node59);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        node66.setLength(2);
        com.google.javascript.rhino.Node node69 = node59.useSourceInfoIfMissingFromForTree(node66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node69.getChildAtIndex(40);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node8.isDo();
        java.util.Set<java.lang.String> strSet10 = node8.getDirectives();
        boolean boolean11 = node8.isString();
        node8.setWasEmptyNode(false);
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = node8.getJSDocInfo();
        boolean boolean15 = node8.isLabelName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isRegExp();
        boolean boolean19 = node8.hasChild(node17);
        boolean boolean20 = node8.isCase();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean26 = node25.isDo();
        boolean boolean27 = node25.isBlock();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean32 = node31.isBreak();
        node31.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node35 = node31.cloneTree();
        com.google.javascript.rhino.Node node36 = node25.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean38 = node25.getBooleanProp((int) (byte) 10);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags40 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) 1);
        sideEffectFlags40.setAllFlags();
        node25.setSideEffectFlags(sideEffectFlags40);
        int int43 = node25.getLineno();
        node25.removeProp(35);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(3, "Not declared as a constructor");
        boolean boolean49 = node48.isAssign();
        boolean boolean50 = node48.isDo();
        node25.addChildrenToBack(node48);
        com.google.javascript.rhino.Node node52 = node48.cloneNode();
        node48.setCharno(54);
        boolean boolean55 = node48.isVarArgs();
        com.google.javascript.rhino.Node node56 = node8.useSourceInfoFromForTree(node48);
        node56.setDouble((double) (byte) 100);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node68 = node63.srcref(node67);
        java.lang.String str69 = node63.toString();
        node63.removeProp((int) (short) 0);
        boolean boolean72 = node63.isObjectLit();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean77 = node76.isGetterDef();
        com.google.javascript.rhino.Node node78 = node63.useSourceInfoFromForTree(node76);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) 1, node78);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean84 = node83.isGetterDef();
        boolean boolean85 = node83.isThis();
        boolean boolean86 = node79.hasChild(node83);
        boolean boolean87 = node79.isAssign();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node56.getChildBefore(node79);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean17 = node16.isGetterDef();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = node22.srcref(node26);
        boolean boolean28 = node27.isDo();
        java.util.Set<java.lang.String> strSet29 = node27.getDirectives();
        com.google.javascript.rhino.Node node30 = node16.clonePropsFrom(node27);
        boolean boolean31 = node27.isDebugger();
        com.google.javascript.rhino.Node node32 = node27.getFirstChild();
        boolean boolean33 = node27.isContinue();
        boolean boolean34 = node27.isNot();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility35 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray36 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility35 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList37 = com.google.common.collect.ImmutableList.of(visibilityArray36);
        java.lang.String str38 = visibilityList37.toString();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList39 = visibilityList37.reverse();
        java.lang.String str40 = visibilityList39.toString();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node49 = node44.srcref(node48);
        boolean boolean50 = node48.isVar();
        double double51 = node48.getDouble();
        boolean boolean52 = node48.isNull();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.isDebugger();
        boolean boolean59 = node56.isGetterDef();
        com.google.javascript.rhino.Node node60 = node48.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean61 = visibilityList39.equals((java.lang.Object) node56);
        node56.setLineno((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.removeChild(node56);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        java.lang.String str23 = node17.toString();
        node17.removeProp((int) (short) 0);
        boolean boolean26 = node17.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean31 = node30.isGetterDef();
        com.google.javascript.rhino.Node node32 = node17.useSourceInfoFromForTree(node30);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder33 = node30.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean38 = node37.isGetterDef();
        com.google.javascript.rhino.Node node39 = node30.useSourceInfoFrom(node37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node48 = node43.srcref(node47);
        java.lang.String str49 = node43.toString();
        node43.removeProp((int) (short) 0);
        boolean boolean52 = node43.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean57 = node56.isGetterDef();
        com.google.javascript.rhino.Node node58 = node43.useSourceInfoFromForTree(node56);
        boolean boolean59 = node58.isObjectLit();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(54, node9, node13, node37, node58);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder61 = node58.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node62 = node58.getParent();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node73 = node68.srcref(node72);
        java.lang.String str74 = node68.toString();
        int int75 = node64.getIndexOfChild(node68);
        boolean boolean76 = node64.wasEmptyNode();
        int int77 = node64.getCharno();
        com.google.javascript.rhino.Node node78 = node64.cloneTree();
        boolean boolean79 = node64.isInstanceOf();
        boolean boolean80 = node64.isCall();
        boolean boolean81 = node64.isFromExterns();
        node62.addChildrenToBack(node64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node84 = node64.getChildAtIndex(52);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str4 = node3.toString();
        com.google.javascript.rhino.Node node5 = node3.cloneTree();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 10);
        boolean boolean8 = node5.isEquivalentToTyped(node7);
        com.google.javascript.rhino.Node node9 = node5.getParent();
        java.lang.String str10 = node5.getSourceFileName();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean15 = node14.isAnd();
        boolean boolean17 = node14.getBooleanProp(4);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node14.siblings();
        node14.putBooleanProp((int) (short) 100, false);
        boolean boolean22 = node14.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean29 = node28.isDo();
        boolean boolean30 = node28.isBlock();
        boolean boolean31 = node28.isStringKey();
        node14.putProp((int) (byte) 10, (java.lang.Object) node28);
        boolean boolean33 = node14.isNE();
        boolean boolean34 = node14.isOptionalArg();
        boolean boolean35 = node14.isDo();
        node14.setWasEmptyNode(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node5.getChildBefore(node14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean5 = node4.isTypeOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo6.getImplementedInterfaces();
        java.lang.String str8 = jSDocInfo6.getFileOverview();
        boolean boolean9 = jSDocInfo6.isExpose();
        boolean boolean10 = jSDocInfo6.hasThisType();
        boolean boolean11 = jSDocInfo6.isNoShadow();
        boolean boolean12 = jSDocInfo6.isJavaDispatch();
        boolean boolean13 = jSDocInfo6.hasThisType();
        java.lang.String str14 = jSDocInfo6.getDescription();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = node19.srcref(node23);
        java.lang.String str25 = node19.toString();
        node19.removeProp((int) (short) 0);
        boolean boolean28 = node19.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean33 = node32.isGetterDef();
        com.google.javascript.rhino.Node node34 = node19.useSourceInfoFromForTree(node32);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 1, node34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean40 = node39.isGetterDef();
        boolean boolean41 = node39.isThis();
        boolean boolean42 = node35.hasChild(node39);
        com.google.javascript.rhino.InputId inputId43 = node35.getInputId();
        boolean boolean44 = node35.isLabelName();
        jSDocInfo6.setAssociatedNode(node35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node4.getChildBefore(node35);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        java.lang.String str31 = node27.getQualifiedName();
        com.google.javascript.rhino.InputId inputId32 = node27.getInputId();
        boolean boolean33 = node27.isCatch();
        boolean boolean34 = node27.isNumber();
        boolean boolean35 = node27.isSetterDef();
        com.google.javascript.rhino.Node node36 = node27.cloneTree();
        boolean boolean37 = node27.isDec();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = node46.srcref(node50);
        java.lang.String str52 = node46.toString();
        node46.removeProp((int) (short) 0);
        boolean boolean55 = node46.isObjectLit();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean60 = node59.isGetterDef();
        com.google.javascript.rhino.Node node61 = node46.useSourceInfoFromForTree(node59);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) 1, node61);
        com.google.javascript.rhino.Node node63 = node41.useSourceInfoFromForTree(node62);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node72 = node67.srcref(node71);
        boolean boolean73 = node72.isDo();
        java.util.Set<java.lang.String> strSet74 = node72.getDirectives();
        boolean boolean75 = node72.isString();
        node72.setWasEmptyNode(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable78 = node72.getAncestors();
        com.google.javascript.rhino.Node node79 = node62.srcrefTree(node72);
        node72.setWasEmptyNode(false);
        node72.addSuppression("([PROTECTED])");
        node72.setWasEmptyNode(true);
        boolean boolean86 = node72.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node87 = node27.getChildBefore(node72);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(3, "[PROTECTED]", 3, 37);
        node4.setQuotedString();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean12 = node11.isVar();
        boolean boolean13 = node11.isIf();
        node11.putIntProp(42, 45);
        boolean boolean17 = node11.hasOneChild();
        com.google.javascript.rhino.Node node18 = node11.cloneTree();
        com.google.javascript.rhino.Node node19 = node4.useSourceInfoIfMissingFromForTree(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean24 = node23.isAnd();
        boolean boolean25 = node23.isDebugger();
        boolean boolean26 = node23.isWhile();
        node23.setLength(43);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean34 = node33.isBreak();
        node33.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = node40.srcref(node44);
        java.lang.String str46 = node40.toString();
        node40.removeProp((int) (short) 0);
        boolean boolean49 = node40.isGetProp();
        boolean boolean50 = node40.isDebugger();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) '4', node33, node40);
        node40.addSuppression("Not declared as a constructor");
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = node40.getJSDocInfo();
        boolean boolean55 = node23.hasChild(node40);
        node40.setSourceEncodedPosition((int) (byte) 0);
        boolean boolean58 = node40.isLocalResultCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node40);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(11);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean7 = node6.isDo();
        boolean boolean8 = node6.isFalse();
        boolean boolean9 = node6.wasEmptyNode();
        boolean boolean10 = node6.isFalse();
        node6.setString("Not declared as a constructor");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(43, "true");
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = node12.srcref(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = node21.srcref(node25);
        boolean boolean27 = node21.isBreak();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 1, node8, node12, node21, node31, 1, (-1));
        java.lang.String str35 = node31.getQualifiedName();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean40 = node39.isAnd();
        node39.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str43 = node31.checkTreeEquals(node39);
        jSDocInfo3.setAssociatedNode(node31);
        boolean boolean45 = jSDocInfo3.hasFileOverview();
        boolean boolean46 = jSDocInfo3.isNoSideEffects();
        boolean boolean47 = jSDocInfo3.isExterns();
        boolean boolean48 = jSDocInfo3.isConsistentIdGenerator();
        boolean boolean49 = jSDocInfo3.isConstructor();
        com.google.javascript.rhino.Node node50 = jSDocInfo3.getAssociatedNode();
        jSDocInfo3.addSuppression("Not declared as a constructor");
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(3, "[PROTECTED]", 3, 37);
        node57.setQuotedString();
        com.google.javascript.rhino.Node node59 = node57.getLastSibling();
        jSDocInfo3.setAssociatedNode(node59);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node59.children();
        java.lang.Object obj63 = node59.getProp(54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node64 = node2.getChildBefore(node59);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(53, "OR 100");
        node2.setQuotedString();
        boolean boolean4 = node2.isString();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = node22.srcref(node26);
        boolean boolean28 = node22.isBreak();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 1, node9, node13, node22, node32, 1, (-1));
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean41 = node40.isFalse();
        java.lang.String str42 = node40.getSourceFileName();
        boolean boolean43 = node40.isLabel();
        node9.putProp(1, (java.lang.Object) node40);
        node9.detachChildren();
        node9.setSourceEncodedPosition((int) (short) 100);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        boolean boolean57 = node56.isDo();
        java.util.Set<java.lang.String> strSet58 = node56.getDirectives();
        boolean boolean59 = node56.isString();
        node56.setWasEmptyNode(false);
        boolean boolean62 = node56.isGetterDef();
        com.google.javascript.rhino.Node node63 = node9.useSourceInfoFrom(node56);
        double double64 = node56.getDouble();
        com.google.javascript.rhino.Node node65 = node2.copyInformationFromForTree(node56);
        node56.setLineno(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node69 = node56.getChildAtIndex(4095);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        java.lang.String str10 = node4.toString();
        node4.removeProp((int) (short) 0);
        boolean boolean13 = node4.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean18 = node17.isGetterDef();
        com.google.javascript.rhino.Node node19 = node4.useSourceInfoFromForTree(node17);
        boolean boolean20 = node17.isGetElem();
        com.google.javascript.rhino.Node node21 = node17.getNext();
        boolean boolean22 = node17.isRegExp();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) '4', node17, 23, (int) ' ');
        boolean boolean26 = node25.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node25.getChildAtIndex(41);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        java.util.Set<java.lang.String> strSet5 = node3.getDirectives();
        boolean boolean6 = node3.isFunction();
        boolean boolean7 = node3.isSetterDef();
        boolean boolean8 = node3.isNE();
        boolean boolean9 = node3.isTry();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        boolean boolean19 = node18.isDo();
        java.util.Set<java.lang.String> strSet20 = node18.getDirectives();
        boolean boolean21 = node18.isString();
        node18.setWasEmptyNode(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable24 = node18.getAncestors();
        boolean boolean25 = node18.isNE();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = node30.srcref(node34);
        java.lang.String str36 = node30.toString();
        node30.removeProp((int) (short) 0);
        boolean boolean39 = node30.isObjectLit();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean44 = node43.isGetterDef();
        com.google.javascript.rhino.Node node45 = node30.useSourceInfoFromForTree(node43);
        boolean boolean46 = node43.isAdd();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder47 = node43.getJsDocBuilderForNode();
        fileLevelJsDocBuilder47.append("Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n");
        node18.putProp(35, (java.lang.Object) "Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n");
        double double51 = node18.getDouble();
        boolean boolean52 = node18.isUnscopedQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node3.getChildBefore(node18);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        node3.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = node14.srcref(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = node23.srcref(node27);
        boolean boolean29 = node23.isBreak();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 1, node10, node14, node23, node33, 1, (-1));
        boolean boolean37 = node14.isInstanceOf();
        boolean boolean38 = node14.isCase();
        int int39 = node14.getLineno();
        int int40 = node14.getType();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        node14.putProp((int) (byte) -1, (java.lang.Object) "hi!");
        com.google.javascript.rhino.Node node47 = node3.useSourceInfoFrom(node14);
        boolean boolean48 = node47.isVar();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node47.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node47.getChildAtIndex(49);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean4 = node3.isFalse();
        java.lang.String str5 = node3.getSourceFileName();
        boolean boolean6 = node3.isLabel();
        boolean boolean7 = node3.isSetterDef();
        boolean boolean8 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = node26.srcref(node30);
        boolean boolean32 = node26.isBreak();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 1, node13, node17, node26, node36, 1, (-1));
        boolean boolean40 = node39.isWith();
        boolean boolean41 = node39.isNot();
        boolean boolean42 = node3.isEquivalentToTyped(node39);
        java.lang.String[] strArray56 = new java.lang.String[] { "Unknown class name", "hi!", "(NUMBER 1.0)", "Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING \n", "JSDocInfo", "([PROTECTED])", "true", "NUMBER 1.0 [directives: [, hi!]]", "hi!", "hi!", "NUMBER 1.0\n", "(NUMBER 1.0)", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet57);
        boolean boolean60 = node39.isDelProp();
        java.lang.String str61 = node39.getQualifiedName();
        com.google.javascript.rhino.Node node62 = node39.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node64 = node62.getChildAtIndex((int) ' ');
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(42, "JSDocInfo", 16, 54);
        boolean boolean5 = node4.isVar();
        com.google.javascript.rhino.InputId inputId6 = node4.getInputId();
        int int8 = node4.getIntProp((int) (byte) -1);
        boolean boolean9 = node4.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node4.getChildAtIndex(49);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node40 = node35.srcref(node39);
        boolean boolean41 = node39.isVar();
        double double42 = node39.getDouble();
        boolean boolean43 = node39.isParamList();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(54, "JSDocInfo");
        boolean boolean47 = node46.isDec();
        node46.setOptionalArg(false);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(53, node31, node39, node46, 0, (int) (short) -1);
        boolean boolean53 = node39.isEmpty();
        boolean boolean54 = node39.isInstanceOf();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(0.0d);
        boolean boolean57 = node56.isInstanceOf();
        boolean boolean59 = node56.getBooleanProp((int) ' ');
        node39.addChildrenToBack(node56);
        boolean boolean61 = node56.isTypeOf();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node70 = node65.srcref(node69);
        boolean boolean71 = node69.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = node69.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile73 = node69.getStaticSourceFile();
        java.lang.String str74 = node69.getSourceFileName();
        boolean boolean75 = node69.isUnscopedQualifiedName();
        boolean boolean76 = node69.isOr();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = node69.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node56.removeChild(node69);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean5 = node4.isDo();
        boolean boolean6 = node4.isInstanceOf();
        boolean boolean7 = node4.isFor();
        com.google.javascript.rhino.Node node8 = node4.getLastChild();
        boolean boolean9 = node4.isTrue();
        node4.addSuppression("[PROTECTED]");
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node4.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node4.getChildBefore(node15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        node3.setSourceFileForTesting("[PROTECTED]");
        node3.putIntProp(1, 4095);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node14 = node3.useSourceInfoFromForTree(node13);
        boolean boolean15 = node14.isSwitch();
        node14.setWasEmptyNode(false);
        node14.setType(53);
        boolean boolean20 = node14.isTry();
        boolean boolean21 = node14.isQuotedString();
        boolean boolean22 = node14.isEmpty();
        boolean boolean23 = node14.isLabel();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0, 47, 15);
        com.google.javascript.rhino.Node node28 = node27.getNext();
        boolean boolean29 = node27.isFor();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = node33.srcref(node37);
        boolean boolean39 = node37.isVar();
        double double40 = node37.getDouble();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = jSDocInfo41.getParameterType("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = jSDocInfo41.getEnumParameterType();
        java.lang.String str45 = jSDocInfo41.getDescription();
        node37.setJSDocInfo(jSDocInfo41);
        com.google.javascript.rhino.Node node47 = node27.useSourceInfoIfMissingFrom(node37);
        java.lang.String str48 = node27.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.removeChild(node27);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node7.isFalse();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.children();
        java.util.Set<java.lang.String> strSet15 = node13.getDirectives();
        boolean boolean16 = node13.hasChildren();
        com.google.javascript.rhino.Node node17 = node13.cloneTree();
        node17.setOptionalArg(false);
        com.google.javascript.rhino.Node node20 = node7.srcref(node17);
        boolean boolean21 = node17.isFor();
        boolean boolean22 = node17.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node17.getChildAtIndex(23);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 397316, 0, 12);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean27 = node26.isBreak();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(4095, node8, node21, node26);
        java.util.Set<java.lang.String> strSet29 = node28.getDirectives();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        boolean boolean32 = node31.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = node31.getStaticSourceFile();
        boolean boolean34 = node31.isAssignAdd();
        boolean boolean35 = node31.isDo();
        node28.addChildToFront(node31);
        boolean boolean37 = node28.isBlock();
        boolean boolean38 = node28.isComma();
        boolean boolean39 = node28.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node40 = node3.getChildBefore(node28);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        java.lang.String str10 = node4.toString();
        node4.removeProp((int) (short) 0);
        boolean boolean13 = node4.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean18 = node17.isGetterDef();
        com.google.javascript.rhino.Node node19 = node4.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = node23.srcref(node27);
        boolean boolean29 = node28.isDo();
        java.util.Set<java.lang.String> strSet30 = node28.getDirectives();
        com.google.javascript.rhino.Node node31 = node17.clonePropsFrom(node28);
        boolean boolean32 = node28.isDebugger();
        boolean boolean34 = node28.getBooleanProp(100);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(409652, node28, 54, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node28.getChildAtIndex(7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node11 = node6.srcref(node10);
        java.lang.String str12 = node6.toString();
        node6.removeProp((int) (short) 0);
        boolean boolean15 = node6.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean20 = node19.isGetterDef();
        com.google.javascript.rhino.Node node21 = node6.useSourceInfoFromForTree(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = node25.srcref(node29);
        boolean boolean31 = node30.isDo();
        java.util.Set<java.lang.String> strSet32 = node30.getDirectives();
        com.google.javascript.rhino.Node node33 = node19.clonePropsFrom(node30);
        java.lang.String str34 = node33.getSourceFileName();
        node33.putBooleanProp((int) (byte) 0, true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder38 = node33.new FileLevelJsDocBuilder();
        boolean boolean39 = node2.hasChild(node33);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(48, 100, 8);
        node43.setType(50);
        boolean boolean46 = node43.isGetterDef();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(41, node2, node43);
        int int48 = node43.getSourceOffset();
        boolean boolean49 = node43.isIf();
        com.google.javascript.rhino.Node[] nodeArray55 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray55, 40, (int) (short) 0);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) 'a', nodeArray55);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray55);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(24, nodeArray55);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node43.removeChild(node62);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.Object obj10 = node3.getProp(10);
        boolean boolean11 = node3.isQuotedString();
        boolean boolean12 = node3.isAnd();
        com.google.javascript.rhino.Node node13 = node3.cloneNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node22.isDo();
        java.util.Set<java.lang.String> strSet24 = node22.getDirectives();
        boolean boolean25 = node22.isDebugger();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = node30.srcref(node34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = node39.srcref(node43);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean49 = node48.isBreak();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(4095, node30, node43, node48);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node59 = node54.srcref(node58);
        boolean boolean60 = node43.isEquivalentTo(node54);
        boolean boolean61 = node54.isVoid();
        boolean boolean62 = node54.isDec();
        boolean boolean63 = node54.hasOneChild();
        com.google.javascript.rhino.Node node64 = node22.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean65 = node13.isEquivalentTo(node22);
        com.google.javascript.rhino.Node[] nodeArray71 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray71, 40, (int) (short) 0);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) 'a', nodeArray71);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(16, nodeArray71);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(43, nodeArray71);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray71, (int) (short) -1, (int) (short) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = node80.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = node22.getChildBefore(node80);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean4 = node3.isThis();
        boolean boolean5 = node3.isCatch();
        boolean boolean6 = node3.isTypeOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo7.getImplementedInterfaces();
        boolean boolean9 = jSDocInfo7.isDeprecated();
        boolean boolean10 = jSDocInfo7.hasType();
        node3.setJSDocInfo(jSDocInfo7);
        boolean boolean12 = node3.isName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = node21.srcref(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node35 = node30.srcref(node34);
        boolean boolean36 = node30.isBreak();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node21, node30, node40, 1, (-1));
        java.lang.String str44 = node40.getQualifiedName();
        com.google.javascript.rhino.InputId inputId45 = node40.getInputId();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node40.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node40);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node2 = typePosition0.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition3.setPositionInformation(30, 4095, 4095, (int) (byte) 100);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition9 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition9.setPositionInformation(30, 4095, 4095, (int) (byte) 100);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition15 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition15.setPositionInformation(0, (int) (short) -1, (int) (short) 0, 29);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition21 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition22 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition22.setPositionInformation(30, 4095, 4095, (int) (byte) 100);
        typePosition22.setPositionInformation(3, (int) (short) -1, 52, 53);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition33 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int34 = typePosition33.getPositionOnStartLine();
        com.google.javascript.rhino.Node node35 = typePosition33.getItem();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = node39.srcref(node43);
        java.lang.String str45 = node39.toString();
        node39.removeProp((int) (short) 0);
        boolean boolean48 = node39.isObjectLit();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean53 = node52.isGetterDef();
        com.google.javascript.rhino.Node node54 = node39.useSourceInfoFromForTree(node52);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = node58.srcref(node62);
        boolean boolean64 = node63.isDo();
        java.util.Set<java.lang.String> strSet65 = node63.getDirectives();
        com.google.javascript.rhino.Node node66 = node52.clonePropsFrom(node63);
        com.google.javascript.rhino.Node node67 = node66.getNext();
        typePosition33.setItem(node66);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition69 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int70 = typePosition69.getPositionOnStartLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList71 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition3, typePosition9, typePosition15, typePosition21, typePosition22, typePosition33, typePosition69);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean76 = node75.isAnd();
        boolean boolean78 = node75.getBooleanProp(4);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node75.siblings();
        node75.putBooleanProp((int) (short) 100, false);
        boolean boolean83 = node75.isCase();
        typePosition69.setItem(node75);
        boolean boolean85 = node75.isQuotedString();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable86 = node75.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node75.getChildAtIndex((int) ' ');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        com.google.javascript.rhino.InputId inputId9 = node3.getInputId();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        java.lang.String str19 = node13.toString();
        node13.removeProp((int) (short) 0);
        boolean boolean22 = node13.isObjectLit();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean27 = node26.isGetterDef();
        com.google.javascript.rhino.Node node28 = node13.useSourceInfoFromForTree(node26);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder29 = node26.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean34 = node33.isGetterDef();
        com.google.javascript.rhino.Node node35 = node26.useSourceInfoFrom(node33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = node39.srcref(node43);
        boolean boolean45 = node43.isFalse();
        com.google.javascript.rhino.Node node46 = node33.useSourceInfoIfMissingFrom(node43);
        boolean boolean47 = node43.isTrue();
        boolean boolean48 = node43.isComma();
        node43.removeProp((int) (short) 10);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(1, "([PROTECTED])", 4, (int) (byte) 100);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = node59.srcref(node63);
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = node64.getJSDocInfo();
        boolean boolean66 = node64.isQualifiedName();
        com.google.javascript.rhino.Node node67 = node55.useSourceInfoFromForTree(node64);
        com.google.javascript.rhino.Node node68 = node43.srcrefTree(node55);
        boolean boolean69 = node43.isTry();
        boolean boolean70 = node43.isRegExp();
        boolean boolean71 = node43.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node72 = node3.getChildBefore(node43);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        node3.setSourceFileForTesting("[PROTECTED]");
        node3.putIntProp(1, 4095);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) 0, 54, (int) (short) 0);
        com.google.javascript.rhino.Node node14 = node3.useSourceInfoFromForTree(node13);
        java.lang.Object obj16 = node3.getProp((int) (byte) 100);
        node3.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = node23.srcref(node27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = node32.srcref(node36);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean42 = node41.isBreak();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(4095, node23, node36, node41);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        node23.setDirectives((java.util.Set<java.lang.String>) strSet47);
        int int50 = node23.getCharno();
        java.lang.String str51 = node23.getQualifiedName();
        boolean boolean52 = node23.isFromExterns();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node62 = node57.srcref(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node71 = node66.srcref(node70);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean76 = node75.isBreak();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(4095, node57, node70, node75);
        java.util.Set<java.lang.String> strSet78 = node77.getDirectives();
        node23.addChildToFront(node77);
        com.google.javascript.rhino.jstype.JSType jSType80 = node23.getJSType();
        int int81 = node23.getType();
        boolean boolean83 = node23.getBooleanProp(97);
        boolean boolean84 = node3.isEquivalentTo(node23);
        com.google.javascript.rhino.Node node85 = node23.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node87 = node85.getChildAtIndex(23);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.Object obj10 = node3.getProp(10);
        boolean boolean11 = node3.isArrayLit();
        boolean boolean12 = node3.isAdd();
        node3.putBooleanProp(2, true);
        boolean boolean16 = node3.isArrayLit();
        node3.setWasEmptyNode(true);
        boolean boolean19 = node3.isThis();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node29 = node24.srcref(node28);
        java.lang.String str30 = node24.toString();
        node24.removeProp((int) (short) 0);
        boolean boolean33 = node24.isObjectLit();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean38 = node37.isGetterDef();
        com.google.javascript.rhino.Node node39 = node24.useSourceInfoFromForTree(node37);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 1, node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean45 = node44.isGetterDef();
        boolean boolean46 = node44.isThis();
        boolean boolean47 = node40.hasChild(node44);
        boolean boolean48 = node44.isThis();
        boolean boolean49 = node44.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node50 = node3.getChildBefore(node44);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(45);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable3 = node2.getAncestors();
        namePosition0.setItem(node2);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean10 = node9.isFalse();
        com.google.javascript.rhino.Node node11 = node9.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = node20.srcref(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node34 = node29.srcref(node33);
        boolean boolean35 = node29.isBreak();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node16, node20, node29, node39, 1, (-1));
        java.lang.String str43 = node39.getQualifiedName();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean48 = node47.isAnd();
        node47.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str51 = node39.checkTreeEquals(node47);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) ' ', node9, node47);
        boolean boolean53 = node47.isSwitch();
        node47.setSourceEncodedPosition(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node47);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.tree.analysis.Value value2 = simpleVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = null;
        org.mockito.asm.tree.analysis.Value value4 = simpleVerifier0.newValue(type3);
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.tree.analysis.Value value6 = simpleVerifier0.newValue(type5);
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.tree.analysis.Value value8 = simpleVerifier0.newValue(type7);
        org.mockito.asm.Type type9 = null;
        org.mockito.asm.tree.analysis.Value value10 = simpleVerifier0.newValue(type9);
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.tree.analysis.Value value12 = simpleVerifier0.newValue(type11);
        org.mockito.asm.tree.AbstractInsnNode abstractInsnNode13 = null;
        org.mockito.asm.Type type14 = null;
        org.mockito.asm.Type type15 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type14, type15, true);
        org.mockito.asm.Type type18 = null;
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier17.newValue(type18);
        org.mockito.asm.Type type20 = null;
        org.mockito.asm.tree.analysis.Value value21 = simpleVerifier17.newValue(type20);
        org.mockito.asm.Type type22 = null;
        org.mockito.asm.tree.analysis.Value value23 = simpleVerifier17.newValue(type22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.tree.analysis.Value value24 = simpleVerifier0.unaryOperation(abstractInsnNode13, value23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(value2);
        org.junit.Assert.assertNotNull(value4);
        org.junit.Assert.assertNotNull(value6);
        org.junit.Assert.assertNotNull(value8);
        org.junit.Assert.assertNotNull(value10);
        org.junit.Assert.assertNotNull(value12);
        org.junit.Assert.assertNotNull(value19);
        org.junit.Assert.assertNotNull(value21);
        org.junit.Assert.assertNotNull(value23);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type1 = null;
        java.util.List list2 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier4 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, list2, false);
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.tree.analysis.Value value6 = simpleVerifier4.newValue(type5);
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.tree.analysis.Value value8 = simpleVerifier4.newValue(type7);
        org.mockito.asm.Type type9 = null;
        org.mockito.asm.tree.analysis.Value value10 = simpleVerifier4.newValue(type9);
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type type12 = null;
        java.util.List list13 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier15 = new org.mockito.asm.tree.analysis.SimpleVerifier(type11, type12, list13, false);
        org.mockito.asm.Type type16 = null;
        org.mockito.asm.tree.analysis.Value value17 = simpleVerifier15.newValue(type16);
        org.mockito.asm.Type type18 = null;
        org.mockito.asm.Type type19 = null;
        java.util.List list20 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type18, type19, list20, false);
        org.mockito.asm.Type type23 = null;
        org.mockito.asm.Type type24 = null;
        java.util.List list25 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier27 = new org.mockito.asm.tree.analysis.SimpleVerifier(type23, type24, list25, false);
        org.mockito.asm.Type type28 = null;
        org.mockito.asm.tree.analysis.Value value29 = simpleVerifier27.newValue(type28);
        org.mockito.asm.Type type30 = null;
        org.mockito.asm.Type type31 = null;
        java.util.List list32 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier34 = new org.mockito.asm.tree.analysis.SimpleVerifier(type30, type31, list32, false);
        org.mockito.asm.Type type35 = null;
        org.mockito.asm.tree.analysis.Value value36 = simpleVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value37 = simpleVerifier22.merge(value29, value36);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier38 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type39 = null;
        org.mockito.asm.tree.analysis.Value value40 = simpleVerifier38.newValue(type39);
        org.mockito.asm.tree.analysis.Value value41 = simpleVerifier15.merge(value29, value40);
        org.mockito.asm.Type type42 = null;
        org.mockito.asm.Type type43 = null;
        java.util.List list44 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier46 = new org.mockito.asm.tree.analysis.SimpleVerifier(type42, type43, list44, false);
        org.mockito.asm.Type type47 = null;
        org.mockito.asm.tree.analysis.Value value48 = simpleVerifier46.newValue(type47);
        org.mockito.asm.Type type49 = null;
        org.mockito.asm.Type type50 = null;
        java.util.List list51 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier53 = new org.mockito.asm.tree.analysis.SimpleVerifier(type49, type50, list51, false);
        org.mockito.asm.Type type54 = null;
        org.mockito.asm.Type type55 = null;
        java.util.List list56 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier58 = new org.mockito.asm.tree.analysis.SimpleVerifier(type54, type55, list56, false);
        org.mockito.asm.Type type59 = null;
        org.mockito.asm.tree.analysis.Value value60 = simpleVerifier58.newValue(type59);
        org.mockito.asm.Type type61 = null;
        org.mockito.asm.Type type62 = null;
        java.util.List list63 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier65 = new org.mockito.asm.tree.analysis.SimpleVerifier(type61, type62, list63, false);
        org.mockito.asm.Type type66 = null;
        org.mockito.asm.tree.analysis.Value value67 = simpleVerifier65.newValue(type66);
        org.mockito.asm.tree.analysis.Value value68 = simpleVerifier53.merge(value60, value67);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier69 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type70 = null;
        org.mockito.asm.tree.analysis.Value value71 = simpleVerifier69.newValue(type70);
        org.mockito.asm.tree.analysis.Value value72 = simpleVerifier46.merge(value60, value71);
        org.mockito.asm.tree.analysis.Value value73 = simpleVerifier4.merge(value41, value71);
        org.mockito.asm.tree.AbstractInsnNode abstractInsnNode74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.tree.analysis.Value value75 = simpleVerifier4.newOperation(abstractInsnNode74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(value6);
        org.junit.Assert.assertNotNull(value8);
        org.junit.Assert.assertNotNull(value10);
        org.junit.Assert.assertNotNull(value17);
        org.junit.Assert.assertNotNull(value29);
        org.junit.Assert.assertNotNull(value36);
        org.junit.Assert.assertNotNull(value37);
        org.junit.Assert.assertNotNull(value40);
        org.junit.Assert.assertNotNull(value41);
        org.junit.Assert.assertNotNull(value48);
        org.junit.Assert.assertNotNull(value60);
        org.junit.Assert.assertNotNull(value67);
        org.junit.Assert.assertNotNull(value68);
        org.junit.Assert.assertNotNull(value71);
        org.junit.Assert.assertNotNull(value72);
        org.junit.Assert.assertNotNull(value73);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.tree.analysis.Value value2 = simpleVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = null;
        org.mockito.asm.tree.analysis.Value value4 = simpleVerifier0.newValue(type3);
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.tree.analysis.Value value6 = simpleVerifier0.newValue(type5);
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.tree.analysis.Value value8 = simpleVerifier0.newValue(type7);
        org.mockito.asm.Type type9 = null;
        org.mockito.asm.tree.analysis.Value value10 = simpleVerifier0.newValue(type9);
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.tree.analysis.Value value12 = simpleVerifier0.newValue(type11);
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.tree.analysis.Value value14 = simpleVerifier0.newValue(type13);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier15 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type16 = null;
        org.mockito.asm.tree.analysis.Value value17 = simpleVerifier15.newValue(type16);
        org.mockito.asm.Type type18 = null;
        org.mockito.asm.Type type19 = null;
        java.util.List list20 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type18, type19, list20, true);
        org.mockito.asm.Type type23 = null;
        org.mockito.asm.tree.analysis.Value value24 = simpleVerifier22.newValue(type23);
        org.mockito.asm.Type type25 = null;
        org.mockito.asm.tree.analysis.Value value26 = simpleVerifier22.newValue(type25);
        org.mockito.asm.Type type27 = null;
        org.mockito.asm.tree.analysis.Value value28 = simpleVerifier22.newValue(type27);
        org.mockito.asm.Type type29 = null;
        org.mockito.asm.tree.analysis.Value value30 = simpleVerifier22.newValue(type29);
        org.mockito.asm.Type type31 = null;
        org.mockito.asm.tree.analysis.Value value32 = simpleVerifier22.newValue(type31);
        org.mockito.asm.Type type33 = null;
        org.mockito.asm.tree.analysis.Value value34 = simpleVerifier22.newValue(type33);
        org.mockito.asm.Type type35 = null;
        org.mockito.asm.tree.analysis.Value value36 = simpleVerifier22.newValue(type35);
        org.mockito.asm.Type type37 = null;
        org.mockito.asm.tree.analysis.Value value38 = simpleVerifier22.newValue(type37);
        org.mockito.asm.Type type39 = null;
        org.mockito.asm.Type type40 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier42 = new org.mockito.asm.tree.analysis.SimpleVerifier(type39, type40, true);
        org.mockito.asm.Type type43 = null;
        org.mockito.asm.tree.analysis.Value value44 = simpleVerifier42.newValue(type43);
        org.mockito.asm.Type type45 = null;
        org.mockito.asm.tree.analysis.Value value46 = simpleVerifier42.newValue(type45);
        org.mockito.asm.Type type47 = null;
        org.mockito.asm.tree.analysis.Value value48 = simpleVerifier42.newValue(type47);
        org.mockito.asm.Type type49 = null;
        org.mockito.asm.tree.analysis.Value value50 = simpleVerifier42.newValue(type49);
        org.mockito.asm.tree.analysis.Value value51 = simpleVerifier15.merge(value38, value50);
        org.mockito.asm.Type type52 = null;
        org.mockito.asm.tree.analysis.Value value53 = simpleVerifier15.newValue(type52);
        org.mockito.asm.Type type54 = null;
        org.mockito.asm.Type type55 = null;
        java.util.List list56 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier58 = new org.mockito.asm.tree.analysis.SimpleVerifier(type54, type55, list56, false);
        org.mockito.asm.Type type59 = null;
        org.mockito.asm.Type type60 = null;
        java.util.List list61 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier63 = new org.mockito.asm.tree.analysis.SimpleVerifier(type59, type60, list61, false);
        org.mockito.asm.Type type64 = null;
        org.mockito.asm.tree.analysis.Value value65 = simpleVerifier63.newValue(type64);
        org.mockito.asm.Type type66 = null;
        org.mockito.asm.Type type67 = null;
        java.util.List list68 = null;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier70 = new org.mockito.asm.tree.analysis.SimpleVerifier(type66, type67, list68, false);
        org.mockito.asm.Type type71 = null;
        org.mockito.asm.tree.analysis.Value value72 = simpleVerifier70.newValue(type71);
        org.mockito.asm.tree.analysis.Value value73 = simpleVerifier58.merge(value65, value72);
        org.mockito.asm.Type type74 = null;
        org.mockito.asm.tree.analysis.Value value75 = simpleVerifier58.newValue(type74);
        org.mockito.asm.Type type76 = null;
        org.mockito.asm.tree.analysis.Value value77 = simpleVerifier58.newValue(type76);
        org.mockito.asm.Type type78 = null;
        org.mockito.asm.tree.analysis.Value value79 = simpleVerifier58.newValue(type78);
        org.mockito.asm.Type type80 = null;
        org.mockito.asm.tree.analysis.Value value81 = simpleVerifier58.newValue(type80);
        org.mockito.asm.tree.analysis.Value value82 = simpleVerifier0.merge(value53, value81);
        java.lang.Class<?> wildcardClass83 = value81.getClass();
        org.junit.Assert.assertNotNull(value2);
        org.junit.Assert.assertNotNull(value4);
        org.junit.Assert.assertNotNull(value6);
        org.junit.Assert.assertNotNull(value8);
        org.junit.Assert.assertNotNull(value10);
        org.junit.Assert.assertNotNull(value12);
        org.junit.Assert.assertNotNull(value14);
        org.junit.Assert.assertNotNull(value17);
        org.junit.Assert.assertNotNull(value24);
        org.junit.Assert.assertNotNull(value26);
        org.junit.Assert.assertNotNull(value28);
        org.junit.Assert.assertNotNull(value30);
        org.junit.Assert.assertNotNull(value32);
        org.junit.Assert.assertNotNull(value34);
        org.junit.Assert.assertNotNull(value36);
        org.junit.Assert.assertNotNull(value38);
        org.junit.Assert.assertNotNull(value44);
        org.junit.Assert.assertNotNull(value46);
        org.junit.Assert.assertNotNull(value48);
        org.junit.Assert.assertNotNull(value50);
        org.junit.Assert.assertNotNull(value51);
        org.junit.Assert.assertNotNull(value53);
        org.junit.Assert.assertNotNull(value65);
        org.junit.Assert.assertNotNull(value72);
        org.junit.Assert.assertNotNull(value73);
        org.junit.Assert.assertNotNull(value75);
        org.junit.Assert.assertNotNull(value77);
        org.junit.Assert.assertNotNull(value79);
        org.junit.Assert.assertNotNull(value81);
        org.junit.Assert.assertNotNull(value82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }
}


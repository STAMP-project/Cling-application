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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder1.getUpToClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        java.lang.String str5 = reflectionToStringBuilder1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.lang.String[] strArray2 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        strList3.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray8 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle6, (java.util.Collection<java.lang.String>) strList9);
        java.util.stream.Stream<java.lang.String> strStream12 = strList9.parallelStream();
        boolean boolean13 = strList3.addAll((java.util.Collection<java.lang.String>) strList9);
        strList9.clear();
        boolean boolean15 = strList9.isEmpty();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle16);
        boolean boolean18 = reflectionToStringBuilder17.isAppendTransients();
        boolean boolean19 = strList9.contains((java.lang.Object) reflectionToStringBuilder17);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = reflectionToStringBuilder17.append((double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray22 = reflectionToStringBuilder17.getExcludeFieldNames();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder1.getStringBuffer();
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        boolean boolean2 = reflectionToStringBuilder1.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("Character[hi!=100.0]]={100.0,100.0,-1.0}]Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]<null>=<size=3>]]=false]]", (long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray2 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle0, (java.util.Collection<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        strList9.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray14 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle12, (java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList15.parallelStream();
        boolean boolean19 = strList9.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean20 = strList3.addAll((java.util.Collection<java.lang.String>) strList9);
        java.lang.String[] strArray23 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        strList24.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray29 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle27, (java.util.Collection<java.lang.String>) strList30);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray35 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle33, (java.util.Collection<java.lang.String>) strList36);
        int int39 = strList36.size();
        boolean boolean40 = strList30.retainAll((java.util.Collection<java.lang.String>) strList36);
        boolean boolean41 = strList24.containsAll((java.util.Collection<java.lang.String>) strList30);
        boolean boolean42 = strList9.addAll((java.util.Collection<java.lang.String>) strList24);
        java.util.Iterator<java.lang.String> strItor43 = strList24.iterator();
        java.lang.String[] strArray46 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        strList47.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle50 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray52 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.lang.String str55 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle50, (java.util.Collection<java.lang.String>) strList53);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle56 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray58 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.lang.String str61 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle56, (java.util.Collection<java.lang.String>) strList59);
        int int62 = strList59.size();
        boolean boolean63 = strList53.retainAll((java.util.Collection<java.lang.String>) strList59);
        boolean boolean64 = strList47.containsAll((java.util.Collection<java.lang.String>) strList53);
        boolean boolean65 = strList24.addAll((java.util.Collection<java.lang.String>) strList53);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle66 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray68 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.lang.String str71 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle66, (java.util.Collection<java.lang.String>) strList69);
        java.util.stream.Stream<java.lang.String> strStream72 = strList69.parallelStream();
        int int73 = strList69.size();
        java.util.Spliterator<java.lang.String> strSpliterator74 = strList69.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator75 = strList69.spliterator();
        boolean boolean76 = strList24.contains((java.lang.Object) strSpliterator75);
        java.util.Iterator<java.lang.String> strItor77 = strList24.iterator();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder78 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strList24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray79 = reflectionToStringBuilder78.getExcludeFieldNames();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendStatics(true);
        float[] floatArray16 = new float[] { 1.0f, (byte) 100, 10, (-1L), (byte) 1, 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder1.append("{1,-1,0,0,-1,100}40{}Integer[value=100]10", floatArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray18 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray2 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle0, (java.util.Collection<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        strList9.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray14 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle12, (java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList15.parallelStream();
        boolean boolean19 = strList9.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean20 = strList3.addAll((java.util.Collection<java.lang.String>) strList9);
        java.lang.String[] strArray23 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        strList24.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray29 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle27, (java.util.Collection<java.lang.String>) strList30);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray35 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle33, (java.util.Collection<java.lang.String>) strList36);
        int int39 = strList36.size();
        boolean boolean40 = strList30.retainAll((java.util.Collection<java.lang.String>) strList36);
        boolean boolean41 = strList24.containsAll((java.util.Collection<java.lang.String>) strList30);
        boolean boolean42 = strList9.addAll((java.util.Collection<java.lang.String>) strList24);
        java.util.Iterator<java.lang.String> strItor43 = strList24.iterator();
        java.lang.String[] strArray46 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        strList47.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle50 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray52 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.lang.String str55 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle50, (java.util.Collection<java.lang.String>) strList53);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle56 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray58 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.lang.String str61 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle56, (java.util.Collection<java.lang.String>) strList59);
        int int62 = strList59.size();
        boolean boolean63 = strList53.retainAll((java.util.Collection<java.lang.String>) strList59);
        boolean boolean64 = strList47.containsAll((java.util.Collection<java.lang.String>) strList53);
        boolean boolean65 = strList24.addAll((java.util.Collection<java.lang.String>) strList53);
        java.lang.String[] strArray68 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        strList69.clear();
        java.lang.Object[] objArray72 = strList69.toArray();
        boolean boolean73 = strList53.containsAll((java.util.Collection<java.lang.String>) strList69);
        int int74 = strList69.size();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder75 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strList69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray76 = reflectionToStringBuilder75.getExcludeFieldNames();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.String[] strArray2 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        strList3.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray8 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle6, (java.util.Collection<java.lang.String>) strList9);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray14 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle12, (java.util.Collection<java.lang.String>) strList15);
        int int18 = strList15.size();
        boolean boolean19 = strList9.retainAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean20 = strList3.containsAll((java.util.Collection<java.lang.String>) strList9);
        java.lang.String[] strArray23 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        strList24.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray29 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle27, (java.util.Collection<java.lang.String>) strList30);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray35 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle33, (java.util.Collection<java.lang.String>) strList36);
        int int39 = strList36.size();
        boolean boolean40 = strList30.retainAll((java.util.Collection<java.lang.String>) strList36);
        boolean boolean41 = strList24.containsAll((java.util.Collection<java.lang.String>) strList30);
        boolean boolean42 = strList3.addAll((java.util.Collection<java.lang.String>) strList24);
        boolean boolean43 = strList3.isEmpty();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder44 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) boolean43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray45 = reflectionToStringBuilder44.getExcludeFieldNames();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("Character[{1,-1,0,0,-1,100}]]", (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append(0.0d);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        java.lang.String str8 = reflectionToStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder10 = reflectionToStringBuilder1.append((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append(0.0d);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        java.lang.String str8 = reflectionToStringBuilder1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0);
        boolean boolean2 = reflectionToStringBuilder1.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) "Float[short[][{1,-1,0,0,-1,100}]=<null>]{}]]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        java.lang.String[] strArray2 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        strList3.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray8 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle6, (java.util.Collection<java.lang.String>) strList9);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray14 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle12, (java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList15.parallelStream();
        int int19 = strList15.size();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        boolean boolean21 = strList15.remove((java.lang.Object) toStringStyle20);
        boolean boolean22 = strList9.retainAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean24 = strList9.add("Boolean[value=false]");
        boolean boolean25 = strList3.containsAll((java.util.Collection<java.lang.String>) strList9);
        java.util.Spliterator<java.lang.String> strSpliterator26 = strList9.spliterator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray29 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle27, (java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList30.parallelStream();
        int int34 = strList30.size();
        java.util.stream.Stream<java.lang.String> strStream35 = strList30.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream36 = strList30.stream();
        boolean boolean37 = strList9.retainAll((java.util.Collection<java.lang.String>) strList30);
        boolean boolean39 = strList30.add("ArrayList[size=1]");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle40 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray42 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String str45 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle40, (java.util.Collection<java.lang.String>) strList43);
        java.util.stream.Stream<java.lang.String> strStream46 = strList43.parallelStream();
        int int47 = strList43.size();
        java.util.Spliterator<java.lang.String> strSpliterator48 = strList43.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator49 = strList43.spliterator();
        int int50 = strList43.size();
        int int51 = strList43.size();
        boolean boolean52 = strList30.addAll((java.util.Collection<java.lang.String>) strList43);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) strList43);
        java.util.stream.Stream<java.lang.String> strStream54 = strList43.stream();
        boolean boolean56 = strList43.add("Character[hi!=100.0]hi!={1,100,0}]<null>={10.0,10.0,-1.0}]100]<null>={0.0,0.0,-1.0,100.0}]0.0]97]]");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder57 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strList43);
        reflectionToStringBuilder57.setAppendStatics(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray60 = reflectionToStringBuilder57.getExcludeFieldNames();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder1.isAppendTransients();
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendTransients(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder1.isAppendTransients();
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        java.lang.String[] strArray2 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        strList3.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray8 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle6, (java.util.Collection<java.lang.String>) strList9);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray14 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle12, (java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList15.parallelStream();
        int int19 = strList15.size();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        boolean boolean21 = strList15.remove((java.lang.Object) toStringStyle20);
        boolean boolean22 = strList9.retainAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean24 = strList9.add("Boolean[value=false]");
        boolean boolean25 = strList3.containsAll((java.util.Collection<java.lang.String>) strList9);
        java.util.Spliterator<java.lang.String> strSpliterator26 = strList9.spliterator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray29 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle27, (java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList30.parallelStream();
        int int34 = strList30.size();
        java.util.stream.Stream<java.lang.String> strStream35 = strList30.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream36 = strList30.stream();
        boolean boolean37 = strList9.retainAll((java.util.Collection<java.lang.String>) strList30);
        boolean boolean39 = strList30.add("ArrayList[size=1]");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle40 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray42 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String str45 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle40, (java.util.Collection<java.lang.String>) strList43);
        java.util.stream.Stream<java.lang.String> strStream46 = strList43.parallelStream();
        int int47 = strList43.size();
        java.util.Spliterator<java.lang.String> strSpliterator48 = strList43.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator49 = strList43.spliterator();
        int int50 = strList43.size();
        int int51 = strList43.size();
        boolean boolean52 = strList30.addAll((java.util.Collection<java.lang.String>) strList43);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) strList43);
        java.util.stream.Stream<java.lang.String> strStream54 = strList43.stream();
        java.util.Iterator<java.lang.String> strItor55 = strList43.iterator();
        java.util.stream.Stream<java.lang.String> strStream56 = strList43.parallelStream();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder57 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strStream56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray58 = reflectionToStringBuilder57.getExcludeFieldNames();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("Character[{1,-1,0,0,-1,100}]]", (double) (-1L));
        java.lang.StringBuffer stringBuffer8 = reflectionToStringBuilder1.getStringBuffer();
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.Object obj11 = reflectionToStringBuilder1.getObject();
        boolean boolean12 = reflectionToStringBuilder1.isAppendStatics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.Object obj5 = reflectionToStringBuilder1.getObject();
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendTransients(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("Character[{1,-1,0,0,-1,100}]]", (double) (-1L));
        java.lang.StringBuffer stringBuffer8 = reflectionToStringBuilder1.getStringBuffer();
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean11 = reflectionToStringBuilder1.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append(0.0d);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder10 = reflectionToStringBuilder1.append("1", (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendStatics(true);
        boolean boolean9 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.Class<?> wildcardClass10 = reflectionToStringBuilder1.getUpToClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder1.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append((short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder10 = reflectionToStringBuilder1.appendSuper("Character[value= ]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.String str5 = reflectionToStringBuilder1.build();
        reflectionToStringBuilder1.setAppendTransients(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder1.getStringBuffer();
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        boolean boolean8 = reflectionToStringBuilder1.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("Character[hi!=100.0]hi!={1,100,0}]false]Character[value=#]=1]Character[value=#]={10,10,100}]Character[hi!=100.0]=-1]]=10]]", 100);
        java.lang.Object obj12 = reflectionToStringBuilder1.getObject();
        java.lang.Class<?> wildcardClass13 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.appendToString("Character[{1,-1,0,0,-1,100}]hi!=-1.0]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray16 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("Character[{1,-1,0,0,-1,100}]]", (double) (-1L));
        java.lang.StringBuffer stringBuffer8 = reflectionToStringBuilder1.getStringBuffer();
        reflectionToStringBuilder1.setAppendTransients(true);
        java.lang.String str11 = reflectionToStringBuilder1.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append(true);
        reflectionToStringBuilder1.setAppendTransients(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("100.0{1,100,0}Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]0true", (float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder1.getStringBuffer();
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        boolean boolean8 = reflectionToStringBuilder1.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("Character[hi!=100.0]hi!={1,100,0}]false]Character[value=#]=1]Character[value=#]={10,10,100}]Character[hi!=100.0]=-1]]=10]]", 100);
        java.lang.Object obj12 = reflectionToStringBuilder1.getObject();
        java.lang.Class<?> wildcardClass13 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.appendToString("Character[{1,-1,0,0,-1,100}]hi!=-1.0]]");
        java.lang.String str16 = reflectionToStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder1.append((long) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray19 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("Character[{1,-1,0,0,-1,100}]={10,1}]0]=100.0]]", byteArray11, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append(0L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder1.appendSuper("100.0hi!-1.0<size=4>a-1falseString[value={C,h,a,r,a,c,t,e,r,[,h,i,!,=,1,0,0,.,0,],=,-,1,],]},hash=1004703528]100a1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray18 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        java.lang.String[] strArray3 = new java.lang.String[] { "{C,h,a,r,a,c,t,e,r,[,h,i,!,=,1,0,0,.,0,],],=,-,1,.,0,],<,n,u,l,l,>,=,<,s,i,z,e,=,4,>,],a,],]},1551513042" };
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = reflectionToStringBuilder1.setExcludeFieldNames(strArray3);
        reflectionToStringBuilder4.setAppendStatics(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder4.append((int) (short) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = reflectionToStringBuilder9.getExcludeFieldNames();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray2 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle0, (java.util.Collection<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        strList9.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray14 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle12, (java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList15.parallelStream();
        boolean boolean19 = strList9.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean20 = strList3.addAll((java.util.Collection<java.lang.String>) strList9);
        strList3.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray24 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle22, (java.util.Collection<java.lang.String>) strList25);
        int int28 = strList25.size();
        java.lang.String[] strArray31 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        strList32.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle35 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray37 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle35, (java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.lang.String> strStream41 = strList38.parallelStream();
        boolean boolean42 = strList32.addAll((java.util.Collection<java.lang.String>) strList38);
        strList38.clear();
        java.lang.String[] strArray46 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        strList47.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle50 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray52 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.lang.String str55 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle50, (java.util.Collection<java.lang.String>) strList53);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle56 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray58 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.lang.String str61 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle56, (java.util.Collection<java.lang.String>) strList59);
        java.util.stream.Stream<java.lang.String> strStream62 = strList59.parallelStream();
        int int63 = strList59.size();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle64 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        boolean boolean65 = strList59.remove((java.lang.Object) toStringStyle64);
        boolean boolean66 = strList53.retainAll((java.util.Collection<java.lang.String>) strList59);
        boolean boolean68 = strList53.add("Boolean[value=false]");
        boolean boolean69 = strList47.containsAll((java.util.Collection<java.lang.String>) strList53);
        java.util.Spliterator<java.lang.String> strSpliterator70 = strList53.spliterator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle71 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray73 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.lang.String str76 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle71, (java.util.Collection<java.lang.String>) strList74);
        java.util.stream.Stream<java.lang.String> strStream77 = strList74.parallelStream();
        int int78 = strList74.size();
        java.util.stream.Stream<java.lang.String> strStream79 = strList74.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream80 = strList74.stream();
        boolean boolean81 = strList53.retainAll((java.util.Collection<java.lang.String>) strList74);
        boolean boolean83 = strList74.add("ArrayList[size=1]");
        boolean boolean84 = strList38.removeAll((java.util.Collection<java.lang.String>) strList74);
        boolean boolean85 = strList25.removeAll((java.util.Collection<java.lang.String>) strList74);
        boolean boolean86 = strList3.containsAll((java.util.Collection<java.lang.String>) strList25);
        java.util.stream.Stream<java.lang.String> strStream87 = strList3.stream();
        java.util.Spliterator<java.lang.String> strSpliterator88 = strList3.spliterator();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder89 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strSpliterator88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray90 = reflectionToStringBuilder89.getExcludeFieldNames();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendStatics(false);
        reflectionToStringBuilder1.setAppendTransients(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder10 = reflectionToStringBuilder1.appendSuper("Character[value= ]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("float[][{35.0,32.0,0.0,10.0,10.0}]", (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("8683452581122892189,10,{},{},0,2147483639,2147483639", (long) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = reflectionToStringBuilder1.getExcludeFieldNames();
    }
}


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
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.Object obj5 = reflectionToStringBuilder1.getObject();
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder1.getUpToClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder1.isAppendTransients();
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean10 = reflectionToStringBuilder1.isAppendStatics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = reflectionToStringBuilder1.getExcludeFieldNames();
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
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder1.getStringBuffer();
        reflectionToStringBuilder1.setAppendStatics(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendStatics(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendStatics(false);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        boolean boolean54 = strList43.isEmpty();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder55 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) boolean54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray56 = reflectionToStringBuilder55.getExcludeFieldNames();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder1.getStringBuffer();
        boolean boolean7 = reflectionToStringBuilder1.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("Character[hi!=100.0]hi!={1,100,0}]<null>={10.0,10.0,-1.0}]100]<null>={0.0,0.0,-1.0,100.0}]0.0]97]String[value={<,n,u,l,l,>},hash=1822929115]={10,1}]value={S,t,r,i,n,g,[,v,a,l,u,e,=,{,<,,,n,,,u,,,l,,,l,,,>,},,,h,a,s,h,=,1,8,2,2,9,2,9,1,1,5,]},hash=-1838241515]]", (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        java.lang.String[] strArray2 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        strList3.clear();
        java.lang.Object[] objArray6 = strList3.toArray();
        boolean boolean7 = strList3.isEmpty();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray10 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle8, (java.util.Collection<java.lang.String>) strList11);
        java.util.stream.Stream<java.lang.String> strStream14 = strList11.parallelStream();
        int int15 = strList11.size();
        boolean boolean16 = strList3.addAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strList3);
        java.lang.String str18 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder17);
        boolean boolean19 = reflectionToStringBuilder17.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray20 = reflectionToStringBuilder17.getExcludeFieldNames();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append(0.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((short) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append(0.0d);
        reflectionToStringBuilder1.setAppendStatics(false);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) reflectionToStringBuilder1, "4");
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder1.getUpToClass();
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray12 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle10, (java.util.Collection<java.lang.String>) strList13);
        java.util.stream.Stream<java.lang.String> strStream16 = strList13.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream17 = strList13.stream();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray20 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle18, (java.util.Collection<java.lang.String>) strList21);
        java.util.stream.Stream<java.lang.String> strStream24 = strList21.parallelStream();
        int int25 = strList21.size();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        boolean boolean27 = strList21.remove((java.lang.Object) toStringStyle26);
        boolean boolean29 = strList21.add("String[value={<,n,u,l,l,>},hash=1822929115]");
        strList21.clear();
        java.lang.String[] strArray33 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        strList34.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray39 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle37, (java.util.Collection<java.lang.String>) strList40);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray45 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String str48 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle43, (java.util.Collection<java.lang.String>) strList46);
        int int49 = strList46.size();
        boolean boolean50 = strList40.retainAll((java.util.Collection<java.lang.String>) strList46);
        boolean boolean51 = strList34.containsAll((java.util.Collection<java.lang.String>) strList40);
        boolean boolean52 = strList21.retainAll((java.util.Collection<java.lang.String>) strList40);
        boolean boolean53 = strList13.removeAll((java.util.Collection<java.lang.String>) strList21);
        java.util.stream.Stream<java.lang.String> strStream54 = strList21.parallelStream();
        java.lang.String str55 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) strList21);
        java.util.stream.Stream<java.lang.String> strStream56 = strList21.parallelStream();
        boolean boolean57 = strList21.isEmpty();
        int int58 = strList21.size();
        java.util.Spliterator<java.lang.String> strSpliterator59 = strList21.spliterator();
        java.lang.String str60 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) reflectionToStringBuilder1, (java.util.Collection<java.lang.String>) strList21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray61 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder1.getUpToClass();
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append(10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder10 = reflectionToStringBuilder1.append((long) (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray14 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        boolean boolean20 = reflectionToStringBuilder17.isAppendTransients();
        reflectionToStringBuilder17.setAppendStatics(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray23 = reflectionToStringBuilder17.getExcludeFieldNames();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        boolean boolean54 = strList43.isEmpty();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder55 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) boolean54);
        reflectionToStringBuilder55.setAppendStatics(false);
        reflectionToStringBuilder55.setAppendTransients(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray60 = reflectionToStringBuilder55.getExcludeFieldNames();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        boolean boolean2 = reflectionToStringBuilder1.isAppendTransients();
        boolean boolean3 = reflectionToStringBuilder1.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append(0.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        reflectionToStringBuilder17.setAppendTransients(false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder24 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray25 = reflectionToStringBuilder24.getExcludeFieldNames();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        reflectionToStringBuilder1.setAppendTransients(false);
        reflectionToStringBuilder1.setAppendTransients(true);
        java.lang.Object obj8 = reflectionToStringBuilder1.getObject();
        reflectionToStringBuilder1.setAppendTransients(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder17.append("Character[hi!=100.0]]=-1.0]{}]ArrayList[size=0]=1]]", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder17.append("String[value={1,0,0,.,0,{,-,1,,,1,,,0,,,1,0,,,-,1,,,1,},1,0,0,.,0,{,1,,,1,0,0,,,0,}},hash=-600957111]", '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray28 = reflectionToStringBuilder17.getExcludeFieldNames();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder1.getUpToClass();
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((byte) 1);
        reflectionToStringBuilder1.setAppendStatics(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append("{},0100.0{}-10", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String str4 = reflectionToStringBuilder1.toString();
        boolean boolean5 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder1.getStringBuffer();
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        reflectionToStringBuilder1.setAppendTransients(false);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append("Character[hi!=100.0]]0]100]Character[hi!=100.0]hi!={1,100,0}],a,p,p,e,n,d,S,t,a,t,i,c,s,=,f,a,l,s,e,,,a,p,p,e,n,d,T,r,a,n,s,i,e,n,t,s,=,f,a,l,s,e,,,e,x,c,l,u,d,e,F,i,e,l,d,N,a,m,e,s,=,<,n,u,l,l,>,,,u,p,T,o,C,l,a,s,s,=,<,n,u,l,l,>,,,b,u,f,f,e,r,=,T,o,S,t,r,i,n,g,S,t,y,l,e,.,S,h,o,r,t,P,r,e,f,i,x,T,o,S,t,r,i,n,g,S,t,y,l,e,[,,,o,b,j,e,c,t,=,o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,h,o,r,t,P,r,e,f,i,x,T,o,S,t,r,i,n,g,S,t,y,l,e,@,7,1,3,6,a,d,9,a,,,s,t,y,l,e,=,o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,h,o,r,t,P,r,e,f,i,x,T,o,S,t,r,i,n,g,S,t,y,l,e,@,7,1,3,6,a,d,9,a,]]=<size=0>]]", (byte) 10);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder1.append("Character[{1,-1,0,0,-1,100}]{#}]Character[hi!={-1,1,0,10,-1,1}]=<size=6>]]=-1]10]]", 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray20 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray2 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle0, (java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList3.parallelStream();
        int int7 = strList3.size();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        boolean boolean9 = strList3.remove((java.lang.Object) toStringStyle8);
        boolean boolean11 = strList3.add("String[value={<,n,u,l,l,>},hash=1822929115]");
        strList3.clear();
        java.util.stream.Stream<java.lang.String> strStream13 = strList3.stream();
        java.util.stream.Stream<java.lang.String> strStream14 = strList3.stream();
        boolean boolean16 = strList3.add("Byte[value=-1]");
        java.util.stream.Stream<java.lang.String> strStream17 = strList3.stream();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray20 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle18, (java.util.Collection<java.lang.String>) strList21);
        java.lang.String[] strArray26 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        strList27.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle30 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray32 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle30, (java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream36 = strList33.parallelStream();
        boolean boolean37 = strList27.addAll((java.util.Collection<java.lang.String>) strList33);
        boolean boolean38 = strList21.addAll((java.util.Collection<java.lang.String>) strList27);
        java.lang.String[] strArray41 = new java.lang.String[] { "String[value={<,n,u,l,l,>},hash=1822929115]", "String[value={},hash=0]" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        strList42.clear();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle45 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray47 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.lang.String str50 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle45, (java.util.Collection<java.lang.String>) strList48);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray53 = new java.lang.String[] { "Character[hi!=100.0]=Character[hi!=100.0]]]=true]hi!={10,10,100}]]" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.lang.String str56 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle51, (java.util.Collection<java.lang.String>) strList54);
        int int57 = strList54.size();
        boolean boolean58 = strList48.retainAll((java.util.Collection<java.lang.String>) strList54);
        boolean boolean59 = strList42.containsAll((java.util.Collection<java.lang.String>) strList48);
        boolean boolean60 = strList27.addAll((java.util.Collection<java.lang.String>) strList42);
        java.lang.Object[] objArray61 = strList42.toArray();
        boolean boolean63 = strList42.add("");
        strList42.clear();
        java.util.stream.Stream<java.lang.String> strStream65 = strList42.parallelStream();
        java.lang.String str67 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) strList42, "{1,-1,0,0,-1,100}-1.0");
        boolean boolean68 = strList3.retainAll((java.util.Collection<java.lang.String>) strList42);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder69 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strList42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray70 = reflectionToStringBuilder69.getExcludeFieldNames();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        boolean boolean20 = reflectionToStringBuilder17.isAppendTransients();
        boolean boolean21 = reflectionToStringBuilder17.isAppendStatics();
        boolean boolean22 = reflectionToStringBuilder17.isAppendStatics();
        java.lang.String str23 = reflectionToStringBuilder17.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray24 = reflectionToStringBuilder17.getExcludeFieldNames();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.appendSuper("ArrayList[hi!=100.0]]0],size=2]size=2]");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        reflectionToStringBuilder1.setAppendTransients(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0);
        reflectionToStringBuilder1.setAppendTransients(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = reflectionToStringBuilder1.getStyle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = reflectionToStringBuilder1.getExcludeFieldNames();
    }
}


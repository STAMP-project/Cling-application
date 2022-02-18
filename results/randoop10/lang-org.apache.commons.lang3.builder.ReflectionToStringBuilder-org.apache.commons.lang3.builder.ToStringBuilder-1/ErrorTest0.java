import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        java.lang.String[] strArray4 = new java.lang.String[] { "<null>", "<null>", "<null>" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) (short) -1, (java.util.Collection<java.lang.String>) strList5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "<null>" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String[] strArray17 = new java.lang.String[] { "<null>", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = strList12.retainAll((java.util.Collection<java.lang.String>) strList18);
        boolean boolean22 = strList18.contains((java.lang.Object) "<null>");
        java.lang.Object[] objArray23 = strList18.toArray();
        boolean boolean24 = strList5.retainAll((java.util.Collection<java.lang.String>) strList18);
        java.util.Spliterator<java.lang.String> strSpliterator25 = strList18.spliterator();
        int int26 = strList18.size();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "<null>" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String[] strArray36 = new java.lang.String[] { "<null>", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        boolean boolean39 = strList31.retainAll((java.util.Collection<java.lang.String>) strList37);
        boolean boolean41 = strList37.contains((java.lang.Object) "<null>");
        java.lang.Object[] objArray42 = strList37.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator43 = strList37.spliterator();
        boolean boolean44 = strList18.retainAll((java.util.Collection<java.lang.String>) strList37);
        java.util.stream.Stream<java.lang.String> strStream45 = strList18.parallelStream();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder46 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strStream45);
        boolean boolean47 = reflectionToStringBuilder46.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = reflectionToStringBuilder46.append((long) 9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray50 = reflectionToStringBuilder46.getExcludeFieldNames();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "<null>" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.lang.String[] strArray9 = new java.lang.String[] { "<null>", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList4.retainAll((java.util.Collection<java.lang.String>) strList10);
        boolean boolean14 = strList10.contains((java.lang.Object) "<null>");
        java.lang.Object[] objArray15 = strList10.toArray();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder16 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strList10);
        boolean boolean17 = reflectionToStringBuilder16.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray18 = reflectionToStringBuilder16.getExcludeFieldNames();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        java.lang.String[] strArray4 = new java.lang.String[] { "<null>", "<null>", "<null>" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) (short) -1, (java.util.Collection<java.lang.String>) strList5);
        java.lang.Object[] objArray8 = strList5.toArray();
        java.util.Iterator<java.lang.String> strItor9 = strList5.iterator();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder10 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) strItor9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = reflectionToStringBuilder10.getExcludeFieldNames();
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest77 {

    public static boolean debug = false;

    @Test
    public void test38501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("javaaaaaaaaaa.............................................................4a44                                                                                   ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "javaaaaaaaaaa.............................................................4a44                                                                                   " + "'", str2, "javaaaaaaaaaa.............................................................4a44                                                                                   ");
    }

    @Test
    public void test38502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38502");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String$class java.lang.String", "ssalinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io.SerializableC", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("java.lang.Cloneable4interface java.io.Serializa", "jAVA.L$ArrayList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38504");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                   ", "CHARACTER             UTILSTRI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38505");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38506");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Interf$ce#j$v$.l$ng.Clone$ble....................................................................#######################JAVAULANGinterf$ce#j$v$.io.Seri$liz$ble", "44444444444444444444444444444444444444444444444444444444", 156);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "................AA..................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38509");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("ceaj v al ngaClone bleaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable###########################################################################################################################################################################################################", 206);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable##########################################################################################################" + "'", str2, "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.io.Serializable##########################################################################################################");
    }

    @Test
    public void test38511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38511");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("UtilString.utilString-1java.-1java", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilString[]                                                                                 ", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "retcarahC44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...GNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlangjavaavajGNAL.avajGNALlan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38515");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(".o.e.GN.L.................................................................................................CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "ArrayLis4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) '#', 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ArrayLis4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.......................................................................CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str4, "ArrayLis4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.......................................................................CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
    }

    @Test
    public void test38516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("langaaaaa", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              langaaaaa                                               " + "'", str2, "                                              langaaaaa                                               ");
    }

    @Test
    public void test38517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38517");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                 java.uti", " ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ....javatsiLyarrAtsiLyarrAtsiLyarrA!iHgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                            utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444ELBAZILAIREs.OI.AVAJ ECAFRETNIGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaairtSirtSirtSirtSirtSirtSirtSirtSirtSirtSirtSstring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnis", "         arraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylistarraylist");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SirtSirtSirtSirtSirtSirtSirtSirtSirtSirtSstring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretn" + "'", str2, "SirtSirtSirtSirtSirtSirtSirtSirtSirtSirtSstring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretnistring.nal.avajecafretn");
    }

    @Test
    public void test38520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahacta", 434, 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38521");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AtsiLytcejbO4gnal4avaj ssalcrrAtsiLytcejbO4gnal4avaj ssalcrrAva4langGNAL44langjava4langAGNAL4AVAJAtsiLytcejbO4gnal4avaj ssalcrrAtsiLytcejbO4gnal4avaj ssalcrrAva4langGNAL44langjava4langAGNAL4AVAJAtsiLytcejbO4gnal4avaj ssalcrrAtsiLytcejbO4gnal4avaj ssalcrrAva4langGNAL44langjava4langAGNAL4AVAJAtsiLytcejbO4gnal4avaj ssalcrrAtsiLytcejStringAtsiLytcejbO4gnal4avaj ssalcrrAtsiLytcejbO4gnal4avaj ssalcrrAva4langGNAL44langjava4langAGNAL4AVAJAtsiLytcejbO4gnaaaaaa444                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38522");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "efce..Coebe...efce.o.ezbe", 51);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("RARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '$');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String" + "'", str4, "RARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38524");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "...l.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...", (java.lang.CharSequence) "etyBetyBetyBetyBetyBetyBetyBetyBetyB");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...l.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA..." + "'", charSequence2, "...l.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA...");
    }

    @Test
    public void test38525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "st");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str2, "AAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAlgnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
    }

    @Test
    public void test38526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaa...aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa...aaaa" + "'", str1, "aaaaaaaaaa...aaaa");
    }

    @Test
    public void test38527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "RFACEJAVA.LANG.CLONEABLE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38528");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("V", "avaj.gnalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       cHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38529");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "jbOgnlvjsslsiyjb");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jbOgnlvjsslsiyjb" + "'", str2, "jbOgnlvjsslsiyjb");
    }

    @Test
    public void test38530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Avaj.gnal");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38532");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAA$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializabletyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAA", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAA$44444444444444444444444444444444444444444444444444444444444444444444444444444444///saitujairtssaijavaulainterfacejava/lang/cloneable4interfacejava/io/serializable///saitujairtssaijavaulainterfacejava/lang/cloneable4interfacejava/io/serializable///saitujairtssaijavaulainterfacejava/lang/cloneable4interfacejava/io/serializable///saitujairtssaijavaulainterfacejava/lang/cloneable4interfacejava/io/serializabletyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38533");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("$$$$$$$$$$$$.", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38534");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("interface java.lang.CloneableRFACEJAVA.LANG.CLONEABLEinterface java.io.Serializable", "aRRAYlISTaRRAYlISTaRRAYlIST", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38535");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ETYB", "INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaarrINTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38536");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                    String[]", "ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAla javalaS", 154);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38537");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                   4444444444444444444444GNL$4$VJ44444444444444444444444                                                                                                                                                    ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("arSERIAavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string", "facejavaAAAAAAAAAAAAAAAAAAAAAAAAALANG.JAVA                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 503, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$...$$aaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test38540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38540");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAULANG", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVA.UTIL", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("Integer", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "################################", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny(".langGNAL..langjava.langAGNAL.AVAJ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "        44444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("INTERFACE JAVA.LANG.CLONEABLE", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test38541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38541");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("serializable", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38542");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...", "arralitu.avajlitu.avaj", 8);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("iSerializabl...     java", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("ass...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test38543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38543");
        java.lang.String[] strArray4 = new java.lang.String[] { "                                   " };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "                                   " };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray9);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("AVAJ.GNAL", (java.lang.Object[]) strArray4);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("                                Integer                            Inte                                 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                   " + "'", str5, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                   " + "'", str10, "                                   ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str13, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                   " + "'", str15, "                                   ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test38544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#", 456, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#");
    }

    @Test
    public void test38545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38545");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       #############################################", "#                                   ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("interfacejava.lang.Cloneableinterfacejava.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializableinterfacejava.io.Serializable", 492, "gNAL.AVAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interfacejava.lang.Cloneableinterfacejava.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializableinterfacejava.io.Serializable" + "'", str3, "interfacejava.lang.Cloneableinterfacejava.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializableinterfacejava.io.Serializable");
    }

    @Test
    public void test38547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38547");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "sERIALIZABLE");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test38548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JAVA.LANGAgnal.avajgnal..LANGgnal.av", '.');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "A$L.AVAj");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test38549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38549");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaautil$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaa", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38550");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AVAJjava.lang.String assGNAL", "                                                                                                                                                                                                                                                                                                                                                        ", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38551");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("A Lya..A                                      ", "INTERFACE JAVA.LANG.CLONEABLE... ... ... ... ... ... ... ... INTERFACE JAVA.IO.SERIALIZABLE", "ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 444);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A Lya..A                                      " + "'", str4, "A Lya..A                                      ");
    }

    @Test
    public void test38552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("interfce jv.lng.cloneble", "                                                                                                                                                                                                                                      JAVA.L$ArrayAAAAAAAAAA                                                                                                                                                                                                                                        ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$IRFcO$IRFIOsRIIZ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "inte$fce$jv$lng$cloneble" + "'", str3, "inte$fce$jv$lng$cloneble");
    }

    @Test
    public void test38553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38553");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                ", "gnal                                                                1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("vvayLasavvayLasajavaulainterface java.lang.Cloneable4interface java.io.SerializablevvayLasavvayLasa.", "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                                        interfacejava.lang.Cloneable$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interfacejava.io", "-1String[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("I.......                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I.......                                                                                                                                                  ..." + "'", str2, "I.......                                                                                                                                                  ...");
    }

    @Test
    public void test38557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".......");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("NAL", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "......." + "'", str4, ".......");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test38558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object###################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object##################################################################################################################################################" + "'", str1, "###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object##################################################################################################################################################");
    }

    @Test
    public void test38559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38559");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(".......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", 59, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               interf$ce#j$v$.l$ng.Clone$ble....................................................................#######################JAVAULANGinterf$ce#j$v$.io.Seri$liz$ble");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38561");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "$");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("JAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", "#                                             ", 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach(".......", strArray4, strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("-1java.utilString-1java.utilString", strArray4);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "......." + "'", str12, ".......");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test38562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                tsiLyarrA.La.lang", (java.lang.CharSequence) "JAVA.........................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("java.", 460, 155);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java." + "'", str3, "java.");
    }

    @Test
    public void test38564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("LANG.Gaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".lang.lang.lang.lang", "$$$$$$$$$$$$.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LANG.Gaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "LANG.Gaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38565");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAgnaluavajAAAAAAAAAAAAAAAAAAA", "stAArrayListAArrayListAArrayListAArrayListAArrayListA", 788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("bYTE", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "stArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38568");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Serilizbl                         ", "4A4A4hhhh4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh4AAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#######################################################################################ArrayListArrayListArrayListavaj.gnal                                                                ########################################################################################", 481);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################################ArrayListArrayListArrayListavaj.gnal                                                                ########################################################################################" + "'", str2, "#######################################################################################ArrayListArrayListArrayListavaj.gnal                                                                ########################################################################################");
    }

    @Test
    public void test38570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("IOINTERFACEJAVAIN", "Class444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IOINTERFACEJAVAIN" + "'", str2, "IOINTERFACEJAVAIN");
    }

    @Test
    public void test38571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38571");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AAAAAAAAAAAAAAAAAAAjavaulangAAAAAAAAAAAAAAAAAA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38572");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A.LANG.CLONEABLESTRINGINTERFACE JAVA.IO");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("....................................................................                       javaulang");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv", strArray2, strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv" + "'", str5, "jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv");
    }

    @Test
    public void test38573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38573");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("int", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...esaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 70);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "lvj.gn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38576");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "rrayLi", "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38577");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("StringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUtilsStringUti");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38578");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu avajli", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444444444444      CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.a", "4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38580");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("arraylistarraylistarraylistavaj.gnal", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38581");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                    aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", 663);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38583");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS...sAitUJAirtSsAitUJAirtSsAitUJAi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sAitUJAirtSsAitUJAirtSsAitUJAi" + "'", str1, "sAitUJAirtSsAitUJAirtSsAitUJAi");
    }

    @Test
    public void test38584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AA...                                                              ", "Gnirt...GniNAL....................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38585");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                   " };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "                                   " };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray2, strArray7);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "$");
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray16);
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray19);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray23, "$");
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray23);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray26);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray39);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray39, "                                  ");
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray39);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray39);
        java.lang.String[] strArray46 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray49);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray50);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray50, ' ', 300, 198);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str11, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class java.lang.String" + "'", str13, "class java.lang.String");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test38586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("it.it", 12, 118);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38587");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirts", (java.lang.CharSequence) "ONEABLE#INTERFACEJAVA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("interface java.lang.Cloneableinterface java.lang.CloneableNG.Llitinterface java.io.Serializableinterface java.io.Serializable", "aaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaNAELOOB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.Cloneableinterface java.lang.CloneableNG.Llitinterface java.io.Serializableinterface java.io.Serializable" + "'", str2, "interface java.lang.Cloneableinterface java.lang.CloneableNG.Llitinterface java.io.Serializableinterface java.io.Serializable");
    }

    @Test
    public void test38589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38589");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "nAAAAAAAAAAjavalagnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang", "aaaaaaggginterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavainterfaeajavagiogSerializableinterfaeajavaglanggaloneablegggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggjavaggggggggggja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang" + "'", str2, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang");
    }

    @Test
    public void test38591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.........ava..........java....ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aj....avaj..........ava.........$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "aj....avaj..........ava.........$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test38592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38592");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38593");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38594");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.alya..a                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$              ", 687);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38595");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("a rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr", 620, 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ssssssssss", "                                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38597");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test38598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("INTERFACE#JAVA.LANG.cLONEABLE4INTERFACE#JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "interface#java.lang.Cloneable4interface#java.io.Serializable" + "'", str1, "interface#java.lang.Cloneable4interface#java.io.Serializable");
    }

    @Test
    public void test38599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38599");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("jAVAAAAAAAAAAVA.LANG...");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38600");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "slitugnirtsslitugnirtsslitugnirtsslitugnirtssl", (java.lang.CharSequence) "irfCo$irfioSrAaaaaaaaaaaa                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test38601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38601");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("VAgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgn", "Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$$$$$$$$$$$$$$$$Hi!ArrayLis$$$$$$$$            java.util             ", 479);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                  litu                                                                 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test38602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#", "4444444STRING");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#");
    }

    @Test
    public void test38603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38603");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "interface java.lang.CloneableAVAJGNALjavajavajavajavajavajavajavgnal                                                                interface java.io.Serializable", (java.lang.CharSequence) "GNAL.AVAJGNAL..langGNAL.AVAJGNAL.                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test38604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38604");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("ARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("                                                                              javalitu.", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test38605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38605");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test38606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38606");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "A..AYLA.44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38607");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("jAV-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA.UTILsTRING-1JAVA", "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllyaaa.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38608");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                            Arra                                             ", ".........................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A..ayL A.44444444444444444444444444", 17, "VJ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A..ayL A.44444444444444444444444444" + "'", str3, "A..ayL A.44444444444444444444444444");
    }

    @Test
    public void test38610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS", (int) (byte) 1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS" + "'", str3, "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
    }

    @Test
    public void test38611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38611");
        java.lang.String[] strArray1 = new java.lang.String[] { "                                   " };
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?> wildcardClass4 = null;
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, "$", 18, (int) (byte) 1);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray21);
        java.lang.String str28 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray17, "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang" + "'", str28, "java.lang");
    }

    @Test
    public void test38612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38612");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("LNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLinterface java.io.Serializable", "StringU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("java.io.Serializableinterfacejava.lang.Cloneable..", "ARR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.Serializableinterfacejava.lang.Cloneable.." + "'", str2, "java.io.Serializableinterfacejava.lang.Cloneable..");
    }

    @Test
    public void test38615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38615");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng", "", 666);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38616");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.L", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38617");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("INTERFACE JAV...    ....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SERIALIZABLE" + "'", str1, "SERIALIZABLE");
    }

    @Test
    public void test38618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("avaj.###########################################################################################################################################gn gnal");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: avaj.###########################################################################################################################################gngnal");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("LITULITULITULITULITUL####LITULITULITULITULITUL                                                ", "slitUgnirtS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "b$YTE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "B$YTE" + "'", str1, "B$YTE");
    }

    @Test
    public void test38621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38621");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                         aaaaaaa       INTEGER        aaaaaaa                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38622");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("SERIA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SERIA" + "'", str1, "SERIA");
    }

    @Test
    public void test38624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("gNAL.AVAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 576);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gNAL.AVAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "gNAL.AVAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaGNL$.$VJaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaGNL$.$VJaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaGNL$.$VJaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test38626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("INTERFACE JAV...    ....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACE JAV...    ....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLE" + "'", str1, "INTERFACE JAV...    ....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test38627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38627");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("..", "");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("##########", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     A..AYL A.44444444444444444444444444      ", strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test38628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38628");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("avajgn", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ", 0, 25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    " + "'", str4, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ");
    }

    @Test
    public void test38629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38629");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaa......", "java.lang.Cloneable4interface java.io.Serializa  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38630");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.String", "                                   ");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray4, "                                                                                                    ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("][sslC][sslCrChahacta][sslC][sslC", strArray1, strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hinterface java.lang.Cloneable4interface java.io.Serializabl....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String[]" + "'", str6, "String[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class java.lang.String" + "'", str7, "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "][sslC][sslCrChahacta][sslC][sslC" + "'", str8, "][sslC][sslCrChahacta][sslC][sslC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class java.lang.String" + "'", str10, "class java.lang.String");
    }

    @Test
    public void test38631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444444444aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agn", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agn" + "'", str2, "4444444444444aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agn");
    }

    @Test
    public void test38632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38632");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java...", "RFACEJAVA.LANG.CLONEABLE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38633");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("slitugnirtsslitugnirtsslitugnirtsslitugnirtssl", "litulitulitulitulitul####litulitulitulitulitul", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38634");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("             Character             utilStraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".......JAVA..........JAVA..........JAVA..........JAVA..........J");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS");
    }

    @Test
    public void test38636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38636");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("#############################################################################################################################################################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38637");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("string");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38638");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("avaJ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 444, 14);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "avaJ" + "'", str9, "avaJ");
    }

    @Test
    public void test38639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38640");
        char[] charArray15 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAULANG", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVA.UTIL", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "jvstringnlrrylistrrylistrrylistvj", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ETYB", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IRFCO.IRFIOSRIIZ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interface java.lang.Cloneable-1A.A.Auti.StriAj-1A.A.Auti.StriAjinterface java.io.Serializable", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test38641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38641");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "ArrayList");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("litu", strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("             character             utilstri", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str8, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test38642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38642");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                       REGETNI                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38643");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                    cafretni", 788);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38644");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("....................................................................                       jvulng");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38645");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("serializabl...     java", "hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test38646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38646");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38647");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(".............................................................................................................................................................................................................................................................................................................................................................................................................................................JAV..............................................................................................................................................................................................................................................................................................................................................................................................................................................", "$$$$$$$$$$$$$$$$$$$$44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Character");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("..........a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a                       ..............................................................................a", "..........................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST" + "'", str1, "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST");
    }

    @Test
    public void test38650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38650");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("RChahacta");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RChahacta" + "'", str1, "RChahacta");
    }

    @Test
    public void test38652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 416, 641);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38653");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang        ", "################################", 149);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializabl");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("                                                                     $$$$$$$$$$$$..                                                                     ", (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ss javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javau" + "'", str9, "ss javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javau");
    }

    @Test
    public void test38654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("CLASclass java.lang.StringCLAS", 924, 210);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38655");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test38656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38656");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ARRaArrRyListArrRyListArrRyListRRRnSARRaArrRyListArrRyListArrRyLiSSSRLSArrRyListARRaSRLSArrRyListSSSRLSArrRyListARRaSRLSArrRyListSSSRLSArrRyListARRaSRLS", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ARRaArrRyListArrRyListArrRyListRRRnSARRaArrRyListArrRyListArrRyLiSSSRLSArrRyListARRaSRLSArrRyListSSSRLSArrRyListARRaSRLSArrRyListSSSRLSArrRyListARRaSRLS");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38657");
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "String", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "litulitulitulitulitul####litulitulitulitulitul", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test38658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38658");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ArrayLis", "", 35);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("java.langjava.langjava.langjava.langjava.langjava.la                                                ", strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "VAJ.GNAL");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str10, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ArrayLis" + "'", str13, "ArrayLis");
    }

    @Test
    public void test38659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJJAVAINTERFACE JAVAIOSERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJJAVAINTERFACE JAVAIOSERIALIZABLE" + "'", str1, "RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN                                                                                                                                                                                                                                                                                                                                                                                                                                                                      INTERFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJJAVAINTERFACE JAVAIOSERIALIZABLE");
    }

    @Test
    public void test38660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38660");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38661");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAV...", "................................                       JAVAULANGinterface java.io.Serializable", 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A Lya..A                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A Lya..A                                     " + "'", str1, "A Lya..A                                     ");
    }

    @Test
    public void test38663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38663");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..", "hi!Arr...", 200);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test38664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar", "#####A##ay...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38665");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#########################################################################################yList", "AVAJ ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38666");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AVA.LA", "JAVA..........JAVA..........JAVA..........JA...", "rry");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38667");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '.', 788, 939);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 788");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38668");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interfacejava.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterfacejava.io.Serializable", "                           rrayList                            rrayList                            rrayList                            rrayclass java.lang.StringArrayLis");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38669");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(".....", "44444444444444444444444444                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("e..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e.." + "'", str1, "e..");
    }

    @Test
    public void test38672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("OI.AVAJ ECAFRETNIGNIRTSELBAENOLC.GNAL.A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OI.AVAJ ECAFRETNIGNIRTSELBAENOLC.GNAL.A" + "'", str1, "OI.AVAJ ECAFRETNIGNIRTSELBAENOLC.GNAL.A");
    }

    @Test
    public void test38673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38673");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ", "aRRAYlISTaRRAYlISTaRRAYlISTaRRAYlIS", "ssalc gnirtsagnalaavaj", 822);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ" + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      LC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNIELBAZILAIRES.OI.AVAJ ECAFRETNI$ELBAENOLC.GNAL.AVAJ ECAFRETNI$GNAL.AVAJ");
    }

    @Test
    public void test38674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ayli", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$nterface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ayli" + "'", str2, "ayli");
    }

    @Test
    public void test38675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38675");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("sTRINGuTILS", "");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test38676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB", "va.lang", "...       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "..................................", "Booleaninterface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!ArrayListArrayListArrayListavaj.... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38679");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38680");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iNTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINtu                    ", "...O.gnal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "lang.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajava.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38682");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("javaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444.44444444", 663);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rrayList44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 940);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                            44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rrayList44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                            44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rrayList44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test38684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38684");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaaaaaaaaa...aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iRFCO.IRFIOSRIIZ", "                                                                                                                                                                                                                                                                                                                                                                                                                                       javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test38685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38685");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "$");
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray12);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray27 = null;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray27);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray27, false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test38686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "44444444444444444444444444444444444444444444444]TU44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("JJJJJJJJJJJJJJJJJJJJJJAA  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jjjjjjjjjjjjjjjjjjjjjjaa  " + "'", str1, "jjjjjjjjjjjjjjjjjjjjjjaa  ");
    }

    @Test
    public void test38688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38688");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("GNL ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AVAJ.GNAL......j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v.i.terf.ce j.v..io.Seri.aiz.bae");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJ.GNAL......j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v.i.terf.ce j.v..io.Seri.aiz.ba" + "'", str1, "AVAJ.GNAL......j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v...........j.v.i.terf.ce j.v..io.Seri.aiz.ba");
    }

    @Test
    public void test38690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38690");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ULANGrrayList", "INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAINTERFACE JAVAaIOasERIALIZABLE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38692");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("javatsilyarratsilyarratsilyarra4444", "                                                                                                                                                                             javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444.", "                                                    ...L.AGNAAAAAAAAAA...", 73);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444." + "'", str3, "44444.");
    }

    @Test
    public void test38694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38694");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                      g", "ass...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                      g" + "'", str4, "                                                                                      g");
    }

    @Test
    public void test38695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterfacejava.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.iointerfacejava.io.SerializableAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA......", "aRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACloneable4iaRR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterfacejava.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.iointerfacejava.io.SerializableAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA......" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAinterfacejava.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.iointerfacejava.io.SerializableAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA......");
    }

    @Test
    public void test38696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38696");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#agnaaaaaaaaGnal", 50, 525);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38697");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("interfacejava.lang.Cloneablejv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jv..........jvinterfcejv.iointerfacejava.io.Serializable", ".......                                                                                                                                                                                                                             va.langGNAL..la..                                                                                                                                                                                                                              ......................................44444444444444444444444444444444444444444444444444444444444444444444444javaulang444444444444444444444444444444444444444444444444444444444444444444444444....................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38698");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ', 91, 938);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38699");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LASS...                                       ", 58, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LASS...                                       " + "'", str3, "..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................LASS...                                       ");
    }

    @Test
    public void test38701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38701");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      44444444444444444444444444.A LYA..A     ", "string.nal.avaj ecafretni");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("SE...  ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ArrayLisArrayLisArrayLisArrayLisArr", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38703");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                   " };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("..", (java.lang.Object[]) strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 131, 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, ".lang");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray11, "hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                   " + "'", str5, "                                   ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "String[]" + "'", str13, "String[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                   " + "'", str14, "                                   ");
    }

    @Test
    public void test38704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38704");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V A.langjava.la...                                                                                                  V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38705");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       .", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAA", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test38706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38706");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("java.util");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("-1java.utilString[]", strArray5, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("...       ", strArray5);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray10, '$', 943, 7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1java.utilString[]" + "'", str8, "-1java.utilString[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test38707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38707");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                              javalitu.", "######################                                                                                                            ... ... ... ... ... ... ... ... ... ... ", 92, (int) '$');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                    ######################                                                                                                            ... ... ... ... ... ... ... ... ... ... " + "'", str4, "                                    ######################                                                                                                            ... ... ... ... ... ... ... ... ... ... ");
    }

    @Test
    public void test38708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("vaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gna...", 938);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38709");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                    cafretni", "Byaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable", "interfacejava.lang.cloneable#interfacejava.io");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable" + "'", str2, ".........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
    }

    @Test
    public void test38711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38711");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(".utiljava.util", "                     ", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("arrayListArrayListArrayListavaj.gnal                                                                                                                                         ", 3, 939);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ayListArrayListArrayListavaj.gnal                                                                                                                                         " + "'", str3, "ayListArrayListArrayListavaj.gnal                                                                                                                                         ");
    }

    @Test
    public void test38713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("gn gnal.avaj", 938, "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gn gnal.avaj#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#" + "'", str3, "gn gnal.avaj#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#");
    }

    @Test
    public void test38714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                              ...LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG###########################                                                         ...", "-1String[.VJ.VJ.VJ.VJ.VJ.VJ.V", 60);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                -1String[.VJ.VJ.VJ.VJ.VJ.VJ.V            ..." + "'", str3, "                -1String[.VJ.VJ.VJ.VJ.VJ.VJ.V            ...");
    }

    @Test
    public void test38715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "-1JAVA.UTILsTRING-1JAVA ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38716");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".La.langtsiLyarrA.La...tsiLyarrA.La.langts...", "INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaarrINTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaa", 516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38717");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang.Stringc", "                                                                                                                                                                                                                                                                                                                                                                                                         utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38718");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                   ", (java.lang.CharSequence) "lang.javatsilyarratsilyarratsilyarra");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38719");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "java.io.Serializable java.lang.CloneableStringinterface interface", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/io/Serializablejava/lang/CloneableStringinterfaceinterface");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38720");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       aaClass[]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38721");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("VAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC", "ARRYLIST  $         $         $         $         $         $         $         $         $         $         $         $ ...", 243);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                    arraylist", "ulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    arraylist" + "'", str2, "                                    arraylist");
    }

    @Test
    public void test38723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("VAARRARJAVAARRARJAVAARR", 523);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VAARRARJAVAARRARJAVAARR" + "'", str2, "VAARRARJAVAARRARJAVAARR");
    }

    @Test
    public void test38724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("utilString.utilString-1java.-1java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "utilString.utilString-1java.-1java" + "'", str1, "utilString.utilString-1java.-1java");
    }

    @Test
    public void test38725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38725");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38726");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("javaStrin..........................................................................................", "ang                                                 JAVAULANGang                          ", 169);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                 ][gnirtSlituGNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalCavaj1-", 905);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                  ][gnirtSlituGNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalCavaj1-                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                  ][gnirtSlituGNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalCavaj1-                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test38728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38728");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".LANG.LANG.LANG.LANG.Llitu", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "tsilyarrgnaluavajtsilyarrgnaluavaj");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray6, '.', 143, 36);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".LANG.LANG.LANG.LANG.Llitu" + "'", str4, ".LANG.LANG.LANG.LANG.Llitu");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".LANG.LANG.LANG.LANG.Llitu" + "'", str5, ".LANG.LANG.LANG.LANG.Llitu");
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test38729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.J");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnal.avajlang.javagnal.avajlang.j" + "'", str1, "gnal.avajlang.javagnal.avajlang.j");
    }

    @Test
    public void test38730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38730");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejb", "character", 136);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "j.v.tsily.rr.tsily.rr.tsily");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "j.v.tsily.rr.tsily.rr.tsily", "                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$$$$$.$$$$$$$$$$avajssalcrrAtsiLytcejb$$$$$$$$$$$$.$$$$$$$$$$$                                                                                                                                                                                                                       ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "String" + "'", str8, "String");
    }

    @Test
    public void test38731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38731");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("javaStri", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: javaStri");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38732");
        char[] charArray17 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "......", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "avaj.gnal", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "gnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnal.LANG.LANG.LANG.LANG.LANG.LANG.Llitu", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("INTEGE", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "cloneable", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$$$$$$$JAVA.UTI", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test38733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38733");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj", "", "44444444444444444444444444444444444444444444444444444444444444444444444javaulang44444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                          ", "gnl..vj", "             Character             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          " + "'", str3, "                          ");
    }

    @Test
    public void test38735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38735");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...RGNALUAVAJTUTUTUTUTUTUT..", 217, 152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAA..", '.', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAA44" + "'", str3, "AAAAAAAAAAAAAAAAAAA44");
    }

    @Test
    public void test38737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38737");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("YARRATSILYARRATSILYARRA", "bYTE", 36);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$tS.gnal.avaj", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARRASILARRASILARRA" + "'", str6, "ARRASILARRASILARRA");
    }

    @Test
    public void test38738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38738");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".lang.Stringclass java.lang.Stringclass java.lang.Stringclas");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 832, 113);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 93, 2);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("GNIRTs.GE       .", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test38739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                              ", 629, 822);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb", "...stg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$Ar...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb" + "'", str2, "444444.444444444444444444...44444444444444444.444444444444444444...44444$aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelbagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langagaga.langafretnigniragecagaoi.aenolc.gnaelb");
    }

    @Test
    public void test38741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38741");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "$");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "$");
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray13);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "                                   " };
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray25);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray25);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray31);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray31, true);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray31, false);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray45, "ETYb");
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray49 = null;
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray49, false);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                   " + "'", str26, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test38742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38742");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   GNAL.AVAJ", 154);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "atsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejStringAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO.gnal.avajssalcrrAva.langGNAL..langjava.langAGNAL.AVAJAtsiLytcejbO.gnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                     AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", 26, "java.io.Serializablejava.lang.CloneableStringinterfaceinterface");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                     AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str3, "                                                                                                                                                                                                                                     AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
    }

    @Test
    public void test38745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38745");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?> wildcardClass4 = null;
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray7, true);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray16, "...                                 ");
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?> wildcardClass24 = null;
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "                                   " };
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray32);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray32);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray38);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray38, true);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray45, true);
        java.lang.String[] strArray50 = new java.lang.String[] { "                                   " };
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray50);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray50);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.concatWith("$", (java.lang.Object[]) wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray54);
        java.lang.String[] strArray57 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####");
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray57);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray58, true);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray54, true);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, '#');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                   " + "'", str33, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "                                   " + "'", str51, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "class java.lang.String" + "'", str53, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test38746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str1, "Hi!ArrayLisaVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
    }

    @Test
    public void test38747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                            rrayList                            rrayList                            rrayList                            rray$ArrayLis", 144);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            rrayList                            rrayList                            rrayList                            rray$ArrayLis" + "'", str2, "                            rrayList                            rrayList                            rrayList                            rray$ArrayLis");
    }

    @Test
    public void test38748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("CLASS JAVA.UTIL.ABSTRACTLISTGN LU V J ....................................................................CLASS JAVA.UTIL.ABSTRACTCOLLECTIONGN LU V J ....................................................................CLASS JAVA.LANG.OBJECT", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASSJAVA.UTIL.ABSTRACTLISTGNLUVJ....................................................................CLASSJAVA.UTIL.ABSTRACTCOLLECTIONGNLUVJ....................................................................CLASSJAVA.LANG.OBJECT" + "'", str2, "CLASSJAVA.UTIL.ABSTRACTLISTGNLUVJ....................................................................CLASSJAVA.UTIL.ABSTRACTCOLLECTIONGNLUVJ....................................................................CLASSJAVA.LANG.OBJECT");
    }

    @Test
    public void test38750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38750");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ArrayLisArrayLisArrayLisArrayLisArra", 2, 717);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38751");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                              AAAAAA...                                                                                                                                                                                                                                                                                                                                                                                                    ", "siLyvvAlllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "gNAL.AVAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilString[]                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilstring[]                                                                                                                                                                                                                                                                                                            " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1java.utilstring[]                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test38754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38754");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("java.langjava.langjava.langjava.langjava.langjavjava.langjava.langjava.langjava.langjava.langjavjava.langjava.langjava.langjava.langjava.langjavjava.langjava.langjajava.util", "                                   TU                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38755");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("GN", "                                            .", "                                                                                                                                                                                                                                                                                                                                                                                                                      javaulangrraylist                       javaulangrraylist                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GN" + "'", str3, "GN");
    }

    @Test
    public void test38757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "siLyarrAtsiLyarrAtsiLyarrAtsiLyarrA.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("util", "                                hi!arraylis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $                                ", "yList");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "LANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38760");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("E", "avaj.gnalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       cHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA", 41);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38761");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("       $                                                                                            ", 536);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("javal#####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javal#####################" + "'", str1, "javal#####################");
    }

    @Test
    public void test38763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38763");
        char[] charArray10 = new char[] { '$', '.', '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "JAVAULANG", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny(" ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AA...", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "javaaaaaaaaa", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "StringUtils", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "$.#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "$.#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[$, ., #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test38764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38764");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Arrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                            utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444ELBAZILAIREs.OI.AVAJ ECAFRETNIGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38766");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#                                              AAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAAJ#V##.#GNAAAAAAAAAARING", "tu]tu", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLIST", "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlISTaRRAYlISaRRAYlISTaRRAYlISTaRRAYlIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLIST" + "'", str2, "ARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLISTARRYLIST");
    }

    @Test
    public void test38768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... ");
    }

    @Test
    public void test38769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38769");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 119 + "'", int1 == 119);
    }

    @Test
    public void test38770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("gNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          ", "JAVAJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN..........JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNJAVAJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN..........JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNJAVAJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "gNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test38771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38771");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaarin");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 0, 881);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38772");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                              javaulainterface java.lang.cloneable4interface java.io.serializabl", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   $A", 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                              langajavatsiLyarrAtsiLyarrAtsiLyarrA                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                              langajavatsilyarratsilyarratsilyarra                                                                                                                                                                                                                                                                              " + "'", str1, "                                                                                                                                                                                                                                                                              langajavatsilyarratsilyarratsilyarra                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test38774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38774");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                         slitugnirtsslitugnirtsslitugnirtsslitugnirtssl                                                                          ", "JAVALITU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38775");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("AVA.LA");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: AVA.LA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38776");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                              ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "....................................................................                       javaulang");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "li");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("gn gnal.avajgn gnal.avajgn gnal.avINTERFACEJAVA.LANG.CLONEABLESTRINGINTERFACEJAVAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38778");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                    ", "...                                                                                                 ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang", "rA", "A..AAAA                       JAVAULANGrrayListyLA.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38780");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("oi#avaj#ecafretnignirtselbaenolc#gnal#avaj#ecafretni", "                                                                           Javastring..                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38781");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("rrayList", "                                    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("$$$$$$$$$$$$..", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "gnirt...", 89, 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("java.util");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "StringStringStringStringStringStringStringStringStringString");
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "rrayList" + "'", str5, "rrayList");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang" + "'", str17, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang");
    }

    @Test
    public void test38782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                     " + "'", str1, "                                                                                    AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA                                                                                     ");
    }

    @Test
    public void test38783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                               #                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("sAitUJAirtSsAitUJAirtSsAitUJAi", 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                 sAitUJAirtSsAitUJAirtSsAitUJAi" + "'", str2, "                                                                                                                 sAitUJAirtSsAitUJAirtSsAitUJAi");
    }

    @Test
    public void test38785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38785");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                  Arrclass java.lang.ObjectyList                                   ", "J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "rChahacta");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test38786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38786");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("..", "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", 2);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("CEAJ V AL", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".." + "'", str6, "..");
    }

    @Test
    public void test38787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ULITULITULITULITUL####LITULITULITULITULITUL", 544, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..........................................................................................................................................................................................................................................................ULITULITULITULITUL####LITULITULITULITULITUL..........................................................................................................................................................................................................................................................." + "'", str3, "..........................................................................................................................................................................................................................................................ULITULITULITULITUL####LITULITULITULITULITUL...........................................................................................................................................................................................................................................................");
    }

    @Test
    public void test38788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "interf ce      l ng Clone ble$interf ce      io Seri liz ble");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "utilString-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38790");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    AvAAlitu                                             ...                                                    AvAA", "][SSALc                         ", 943);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("iaaarfaaaaaaaaaaaaaaCaoaaaaaa$iaaarfaaaaaaaaaioaSariaaizaaaa", "RRAYLIST                            RRAYLIST                            RRAYLIST                            RRAY$ARRAYLIS", "class java.util.AbstractListjavaclass java.util.AbstractCollectionjavaclass java.lang.Object");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", "                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String" + "'", str2, "J#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
    }

    @Test
    public void test38793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("interfacejava.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterfacejava.io.Serializable", "objec");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38794");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                    java.lang.cloneable...                                 interface java.io.serializable", (java.lang.CharSequence) "Stringc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra.    .aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("CAFRETNI", 489, "                                                                       javaStrin                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                       javaStrin                                                                                                                                              javaStrin         CAFRETNI                                                                       javaStrin                                                                                                                                              javaStrin          " + "'", str3, "                                                                       javaStrin                                                                                                                                              javaStrin         CAFRETNI                                                                       javaStrin                                                                                                                                              javaStrin          ");
    }

    @Test
    public void test38797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal" + "'", str1, "aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal");
    }

    @Test
    public void test38798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.langjava.langja" + "'", str2, "Java.langjava.langja");
    }

    @Test
    public void test38799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("st", "AtsiLytcejbO.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ", 126);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void test38800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38800");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void test38801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("J", "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $        #####################################################################.", 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
    }

    @Test
    public void test38802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38802");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "SIlYARRa!Ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38803");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "$");
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray19, "$");
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray19);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "                                   " };
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray31);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray37);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray37, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray37, false);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray46);
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray46, ' ', (int) (short) 0, 0);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray46, "string.nal.avaj ecafretni");
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray56);
        java.lang.Class<?> wildcardClass58 = wildcardClassArray56.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                   " + "'", str32, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "class java.lang.String" + "'", str55, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test38804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38804");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("classjava", "ARRAYLISTARRAYLISTARRAYLISTAVAJ", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38805");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "javalitu.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test38806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38806");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AVAJ.GNAL", "class java.lang.String", 940);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("java.langjava.langjava.langjava.langjava.langjava.la                                                ", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$gnal.avaj $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "avaj");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("NAL.AVAJ", strArray5, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test38807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38807");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("cloneble", 202, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...gnal.avaaaaaaaaaavaJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...gnal.avaaaaaaaaaavaJ" + "'", str1, "...gnal.avaaaaaaaaaavaJ");
    }

    @Test
    public void test38809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38809");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclss jv.lng.O...", (java.lang.CharSequence) "avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test38810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38811");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj", "....................................................................                       JAVAULANG");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("SIlYARRa!Ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test38812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(".lnG                                                                                                                                                                                                                                                                                                                                                                 ", 893);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38813");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGNJAVALAGNGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "A..AAAA                       JAVAULANGrrayListyLA.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test38816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38816");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG", "se...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AVA.", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38818");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "int");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "arr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "arr...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38820");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", "Class", 2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "ssalC");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("lass java.lang.string", 'a');
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("########################################################################################################################################################################################################################################################################################################################################################################################################################....................................", strArray6, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav" + "'", str10, "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test38821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38821");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                       javaulangrraylist                       javaulangrraylist          ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("Litulitulitulitulitul####litulitulitulitulitul", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) boolean3, "utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrAjava.utiljava.utilarrA#########################################################################itu.avaj#########################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Boolean" + "'", str5, "Boolean");
    }

    @Test
    public void test38822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38822");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("jAVAJAVAsTRINjAVAJAVAsTRINjAVAJAVAsTjAVAJAVAsTRINjA                                            ..", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...", 193);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       utilString.utilString-1java.-1java", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test38823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("se...  ...", "", "gnl$ $vj");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "se...  ..." + "'", str3, "se...  ...");
    }

    @Test
    public void test38824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                  litu                                                                                                                                                                                                                                                                                                                                                                                                  ", 942);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  litu                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "                                                                  litu                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test38825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38825");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ceajvalngaClonebleaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvinterfceajvaioaSerilizble", "                                                                                                                                                            Arr                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("CLASS JAVA.UTIL.ABSTRACTLISTGN LU V J ....................................................................CLASS JAVA.UTIL.ABSTRACTCOLLECTIONGN LU V J ....................................................................CLASS JAVA.LANG.OBJEC", "                                       ..gnirtsavaJ                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("interface java.lang.Cloneableinterface#java.lang.cloneable4interfaceinterface java.io.Serializable", "classjava.util.AbstractListgnluvj....................................................................classjava.util.AbstractCollectiongnluvj....................................................................classjava.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444444444444444444INGuTILSsTRINGuTILS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38829");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringcl...avaj..........avaj.........", "VAJ", 641);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                        i4elbaenolC.gnal.avaj ecafretniTRINGi4elbaenolC.gnal.avaj ecaf", "                                                                                                                                                       S                                                                                                                                                                                   ", "AAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAAngalavajAAAAAAAAAA                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi4elbaenolC.gnal.avajAecafretniTRINGi4elbaenolC.gnal.avajAecaf" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi4elbaenolC.gnal.avajAecafretniTRINGi4elbaenolC.gnal.avajAecaf");
    }

    @Test
    public void test38831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("tavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarrayli                                 ..", "interface java.lang.Cloneable AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyListinterface java.io.Serializable", "RFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANG.naluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.nal.avajSSALC.GNALJAVA.LANG.naluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.nal.avajSSALC.GNALJAVA.LANG.naluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.nal.avajSSALC.GNALJAVA.LANG.naluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.nal.avajSSALC.GNALJAVA.LANG.naluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.nal.avajSSALC.GNALJAVA.LANG.naluAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.nal.avajSSALC.GN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarrayli                                 .." + "'", str3, "tavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarrayli                                 ..");
    }

    @Test
    public void test38832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38832");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test38833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                  JaTSILYaRRaTSILYaRRaTSILYaRRa                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaa");
    }

    @Test
    public void test38835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38835");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAULANG", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVA.UTIL", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJ", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("Integer", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "################################", charArray14);
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) charArray14, "Arralitu.avajlitu.ava");
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!arrylistarrylistarrylistvjhhhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                ...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "char[]" + "'", str22, "char[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test38836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ngaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       lavaj                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ngaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       lavaj                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str1, "Ngaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       lavaj                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test38837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38837");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...$$$$$$$$$$$$$$$..gn                                            gn      tavaj.gnalarraylistarraylistarraylign      ", 29, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...$$$$$$$$$$$$$$$..gn                                            gn      tavaj.gnalarraylistarraylistarraylign      " + "'", str3, "...$$$$$$$$$$$$$$$..gn                                            gn      tavaj.gnalarraylistarraylistarraylign      ");
    }

    @Test
    public void test38838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("avaj.gnalavaj.gnalavaj.gnal", '.');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "rrA", 23, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String[]" + "'", str4, "String[]");
    }

    @Test
    public void test38839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38839");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(".         44444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38840");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "                                   " };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.Class<?> wildcardClass11 = null;
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray14);
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray14, true);
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray24, false);
        java.lang.String[] strArray31 = new java.lang.String[] { "                                   " };
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray31);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray37);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray33);
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean48 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray47);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray49);
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String[] strArray59 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", 'a');
        java.lang.String[] strArray62 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("$", "                                   ");
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...       ", strArray59, strArray62);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                              ", strArray55, strArray62);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray55);
        boolean boolean66 = org.apache.commons.lang3.StringUtils.endsWithAny("ArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnal", strArray55);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray55);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray67, true);
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray49, '4', 888, 503);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                   " + "'", str9, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                   " + "'", str32, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "$       " + "'", str63, "$       ");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "                                              " + "'", str64, "                                              ");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "avaj.gnal" + "'", str65, "avaj.gnal");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test38841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38841");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".aL.ArrayListgnal.aL.ArrayList");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("             cHARACTER             UTILsTRI             cHARACTER   g.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.             cHARACTER             UTILsTRI             cHARACTER   ", 200);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             cHARACTER             UTILsTRI             cHARACTER   g.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.             cHARACTER             UTILsTRI             cHARACTER   " + "'", str2, "             cHARACTER             UTILsTRI             cHARACTER   g.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.             cHARACTER             UTILsTRI             cHARACTER   ");
    }

    @Test
    public void test38843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "jA44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444v");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("SE...  ...interface java.lang.CloneableStringinterfNAL....................interface java.lang.CloneableStringinterfa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bleStringinterfang.Clonea.lavace jableStringinterfNAL....................interfang.Clonea.lavace jaSE...  ...interf" + "'", str2, "bleStringinterfang.Clonea.lavace jableStringinterfNAL....................interfang.Clonea.lavace jaSE...  ...interf");
    }

    @Test
    public void test38845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i", "-1String[.VJ.VJ.VJ.VJ.VJ.VJ.V", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i" + "'", str4, "interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i");
    }

    @Test
    public void test38846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......", 793, "ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38847");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "                                   " };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray14);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray20);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray20, true);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray20, false);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ArrayList", '4');
        int int38 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray37);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray37);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray37);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray40, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray40, ' ', 0, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                   " + "'", str15, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class java.lang.String" + "'", str32, "class java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ArrayList" + "'", str39, "ArrayList");
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test38848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38848");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "interface java.lang.CloneableJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILStringcJAVA.UTILJAVA.UTILinterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38850");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", "][sslC", (int) '$');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray6, "S.r..gU..ls");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gNAL.AVAJ", "gnal.avajgnal..LANGgnal.avajgnal");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("tsiLytcejbO.gnal.avaj ssalcrrAavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrrrrjavarrrrrrrr", strArray6, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test38851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38851");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "-1JAVA.UTILsTRING-1JAVA.UTILsTRING", "interface java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test38852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38852");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........", "Boolean", 50);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "ArrayList");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", strArray8, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("litu", strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaA..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.4444444444...A..yL A.44", strArray4, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 50 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str12, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test38853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38853");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444gnaluavaj4444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "##########################java.lan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38855");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("lan         ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444 $");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihlitu.avaj", 159);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38857");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "String", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "GN", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#.#agnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajaval#", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ                                                                                                                                                                                                                                              javaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializableSerializableSerialijavaStrinSerializableSerializable", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test38858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("java.lang$interface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.lang.Cl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANG$INTERFACE JAVA.LANG.cLONEABLE$INTERFACE JAVA.IO.sERIALIZABLEINTERFACE JAVA.LANG.cLONEABLE$INTERFACE JAVA.IO.sERIALIZABLEINTERFACE JAVA.LANG.cL" + "'", str1, "JAVA.LANG$INTERFACE JAVA.LANG.cLONEABLE$INTERFACE JAVA.IO.sERIALIZABLEINTERFACE JAVA.LANG.cLONEABLE$INTERFACE JAVA.IO.sERIALIZABLEINTERFACE JAVA.LANG.cL");
    }

    @Test
    public void test38859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("JAVA.UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h##############################", "INTERFACE#JAVA.LANG.cLONEABLE4INTERFACE#JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INTERFACE#JAVA.LANG.cLONEABLE4INTERFACE#JAVA.IO.sERIALIZABLE" + "'", str2, "INTERFACE#JAVA.LANG.cLONEABLE4INTERFACE#JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test38860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("gnirtSlitu.avaj1-gnirtSlitu.avaj1-", 390, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                  gnirtSlitu.avaj1-gnirtSlitu.avaj1-                                                                                                                                                                                  " + "'", str3, "                                                                                                                                                                                  gnirtSlitu.avaj1-gnirtSlitu.avaj1-                                                                                                                                                                                  ");
    }

    @Test
    public void test38861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38861");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG", "arahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahCretcarahC       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALANG.JAVa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("classjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang", "                                                                                                                                                                                                                                                                    java..........java..........java.......ARJAVAARR......java..........java..........java                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "classjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang" + "'", str2, "classjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang.Stringclassjava.lang");
    }

    @Test
    public void test38863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("JAV", 57, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...........................JAV..........................." + "'", str3, "...........................JAV...........................");
    }

    @Test
    public void test38864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...O.gnal.avaj ssalcr4444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Arralitu.avajlitu.ava", 940);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray4, "GNALUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGNAL.AVAJssalC");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "$");
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray9);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "                                   " };
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray20);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray14, true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Class[]" + "'", str6, "Class[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                   " + "'", str18, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test38865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38865");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("gnlvj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray1, "ss java.lang.Stringu.................................u.................................u.................................u.....................Lass java.lang.Stringu.................................u............................$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializable...saitujairtssaijavaulainterface java.lang.cloneable4interface java.io.serializablLass java.lang.Stringu.................................u.................................u.................................u.....................Lass java.lang.Stringu.................................u............................");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String[]" + "'", str3, "String[]");
    }

    @Test
    public void test38866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a.lang.CloneableStringinterfacejava.i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a.lang.CloneableStringinterfacejava.i" + "'", str1, "a.lang.CloneableStringinterfacejava.i");
    }

    @Test
    public void test38867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38867");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("javaaaaaaaaaava.langava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjav");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "langjav" + "'", str1, "langjav");
    }

    @Test
    public void test38868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                       ", "INGuTILSsTRINGuTILS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                       " + "'", str2, "                                                                                                       ");
    }

    @Test
    public void test38869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "rrA", "JAVA.UTILJAVA.UTIL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 939, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38872");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         util          ", "utilString[]", 151);
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#############################################################", strArray5, strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "hi!", (int) (byte) -1);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("ArrayList", strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa$$$$$$$$");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("GNIRT", strArray5, strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#############################################################" + "'", str7, "#############################################################");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GNIRT" + "'", str20, "GNIRT");
    }

    @Test
    public void test38873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38873");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object##################################################################################################################################################", "$rr$ylis...v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng$v$j.gn$lj$v$.l$ng", "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################-1String[]", 231);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object##################################################################################################################################################" + "'", str4, "###################################################################################################################################################class java.util.AbstractList$class java.util.AbstractCollection$class java.lang.Object##################################################################################################################################################");
    }

    @Test
    public void test38874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                    ######################                                                                                                            ... ... ... ... ... ... ... ... ... ... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38875");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("IIIEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIII44IIIEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE44444$EEEEEEEEE", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38876");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("     aaaaaaaaaa      ", "gnAls4444", 537, 482);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     aaaaaaaaaa      gnAls4444" + "'", str4, "     aaaaaaaaaa      gnAls4444");
    }

    @Test
    public void test38877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38877");
        char[] charArray17 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAULANG", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("...       ", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                    ", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializable", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".######################################################################", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Gnal$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "GNAL.", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50 + "'", int27 == 50);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test38878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38878");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaajaaaaaaa", "TRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38879");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("ArrayList", "hi!", (int) (short) 100);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("Booleaninterface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("AVALITU.", "rrayList                            rrayList                            rrayList                            rray$ArrayLis", 151);
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strArray10, "AGNaaaaaaaaaaJAARRAYLISTARRAYLISTARRAYLISTAVAJ                                                        ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("jAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "String[]" + "'", str12, "String[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "jAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA" + "'", str13, "jAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVA");
    }

    @Test
    public void test38880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("$         $         $         $               Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character             $         $         $         $  ", "JAVA.UTI", "                                  Arrclass java.lang.ObjectyList                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$         $         $         $               Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character             $         $         $         $  " + "'", str3, "$         $         $         $               Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character                          Character             $         $         $         $  ");
    }

    @Test
    public void test38881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "................AA..................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "................AA.................." + "'", str1, "................AA..................");
    }

    @Test
    public void test38882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38882");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacter");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38883");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#########################################################...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38884");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "$");
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "                                   " };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray20);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray26);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray26, true);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray26, false);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray35);
        java.lang.String[] strArray39 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray41 = org.apache.commons.lang3.StringUtils.stripAll(strArray39, "$");
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray39);
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.stripAll(strArray45, "$");
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray45);
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        java.lang.String[] strArray57 = new java.lang.String[] { "                                   " };
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray57);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray57);
        java.lang.Class<?> wildcardClass60 = null;
        java.lang.Class[] classArray62 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        wildcardClassArray63[0] = wildcardClass60;
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, wildcardClassArray63);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray52, wildcardClassArray63, true);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, wildcardClassArray63, false);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray72);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray72);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray72);
        java.lang.String[] strArray78 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ArrayList", '4');
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray78);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray72, wildcardClassArray79);
        java.lang.String[] strArray82 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray82);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray83);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray84);
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray79, wildcardClassArray84, true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                   " + "'", str21, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "                                   " + "'", str58, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test38885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("INTERFACE JAVA.LANG.cLONEABLEvajINTERFACE JAVA.IO.sERIALIZABLE", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38886");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           JAVA.L$ArrayAAAAAAAAAA                                                                                                                                                                                                                                        ", "Class javalangclass                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang                       javaulang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38887");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("              Integer              ", "elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal.avaj ecafretni444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test38889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38889");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "ULITULITULITULITUL####LITULITULITULITULITUL", (java.lang.CharSequence) "SE...  ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ULITULITULITULITUL####LITULITULITULITULITUL" + "'", charSequence2, "ULITULITULITULITUL####LITULITULITULITULITUL");
    }

    @Test
    public void test38890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaajaval.agnaaaaaaaaaa", (java.lang.CharSequence) "                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38891");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...L.AGNAAAAAAAAAA...", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("gnl..vj", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test38892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "#########################################################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38893");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Serilizbl", "4444444STRING44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.LY..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAA", 570, 850);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAA" + "'", str3, "AAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAAaaaalaagaAAAAAAAAAA");
    }

    @Test
    public void test38895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38895");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRs", "LlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLva.langGNAL..la...", 948);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38896");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("JAVA.IO.sERIALIZABLE JAVA.LANG.cLONEABLEsTRINGINTERFACE INTERFACE############################################", "...                                   ...       ....       .", 535);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ssal..............................................rrayList..............................................C", 931, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                             ssal..............................................rrayList..............................................C                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                             ssal..............................................rrayList..............................................C                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test38898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("java.io.Serializablejava.lang.CloneableStringinterfaceinterface", "AtsiLytcejbOlvjsslcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.Serializablejava.lang.CloneableStringinterfaceinterface" + "'", str2, "java.io.Serializablejava.lang.CloneableStringinterfaceinterface");
    }

    @Test
    public void test38899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38899");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJ");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avaJ", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test38900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("avaj ..........................................................................................................................................................................................................................................................................................................................................", "interface java.lang.Cloneable#interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "avaj .........................................................................................................................................................................................................................................................................................................................................." + "'", str2, "avaj ..........................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test38901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable.                                 interface java.io.Serializable", "444444444444444444444444444444444444444444444444444444444444444444444TSILYARRA.LA.LANGTSILYARRA.LA.LANGTSILYARRAJAVAAAAAAAAAAVA.LANGAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGA.LANGTSILYARRA.LA.LANGTSILYARRA.LA.LANG");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("INTERFACE JAVA.LANG.cLONEABLE.......JAVA.......oBJECTAVA..........JAVAINTERFACE JAVA.IO", "etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38903");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                              ", 84, "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test38904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38904");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38905");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("char[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable", 540);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable" + "'", str2, "interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable");
    }

    @Test
    public void test38908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".............................................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "gnAls4444", 262);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38909");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("inte$fce$jv$lng$cloneble", "va", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("rrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLi", "...                                                                                        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLi" + "'", str2, "rrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLi");
    }

    @Test
    public void test38911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38911");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "face java.lang.CloneableINTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLEinterf                                                                                          gnal.............RJAVAARR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38912");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38913");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "##########################################################################################################################################################################################################################java.lang                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ##########################################################################################################################################################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test38914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38914");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "       #############################################", (int) (byte) 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("YLIST", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test38915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interfacejava.lang.CloneableJ#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#nginterfacejava.io.Serializabl$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "                                                                                                                                                                                                                                                                                                                                                                                                                      javaulangrraylist                       javaulangrraylist                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38916");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("irfCo$irfioSrA..ayL.A.44444444444444444444444444", 25, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38917");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".......JAVA..........JAVA..........JAVA..........JAVA..........J", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38918");
        char[] charArray16 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "JAVAULANG", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Arr... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("...       ", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                    ", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "interface java.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interface java.io.Serializable", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".............................................................................................................................................................................................................................................................................................................................................................................................................................................jAV..............................................................................................................................................................................................................................................................................................................................................................................................................................................", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaautilaaaaaaaaa", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test38919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38919");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38920");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String", "####.........................................####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("rrayList                            rrayList                            rrayList                            rray$ArrayLis", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javaaaaaaaaaa                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrayList                            rrayList                            rrayList                            rray$ArrayLis" + "'", str2, "rrayList                            rrayList                            rrayList                            rray$ArrayLis");
    }

    @Test
    public void test38922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("interfacejava.lang.CloneableLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituinterfacejava.io.SerializablegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS", 524);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejava.lang.CloneableLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituinterfacejava.io.SerializablegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS" + "'", str2, "interfacejava.lang.CloneableLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituinterfacejava.io.SerializablegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS.gegnirtS");
    }

    @Test
    public void test38923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38923");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("JAVAsTRINJAVAsTRINJA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVAsTRINJAVAsTRINJA.." + "'", str1, "JAVAsTRINJAVAsTRINJA..");
    }

    @Test
    public void test38924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38924");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ceajvalngaClonebleaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvaaaaaaaaaajvinterfceajvaioaSerilizble", 250, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "g.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(".....................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 103, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, ".....................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test38927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                  JAVATSILYARRATSILYARRATSILYARRA                                                                                                                                                                                                                                  ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny(" lang.javalang.javalang.javava                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                                      va                   ", strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 764, 44);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test38929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajli", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jliava444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu." + "'", str2, "jliava444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.");
    }

    @Test
    public void test38930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "-1JAVA.UTILsTRING-1JAVA.UTILsTRING");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("jAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANGJAVA.LANG", "4444444444444javastringslitUgnirtSarraylistarr######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....                                                                                                                         raylistarrayli44444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "interfacejava.lang.CloneableString[]Strijavaulang[]String[]interfacejava.io");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "iNTEGER");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java.........");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........" + "'", str1, ".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java........");
    }

    @Test
    public void test38935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) ".langjava.langjava.langjava.langjava...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".langjava.langjava.langjava.langjava...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      " + "'", str1, ".langjava.langjava.langjava.langjava...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ");
    }

    @Test
    public void test38936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38936");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGAAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAANALAV.A..AAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38937");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                          CLASSJAVA.LANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG", "4444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLASSJAVALANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG" + "'", str3, "CLASSJAVALANGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAULANG");
    }

    @Test
    public void test38938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38938");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "gnl$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38939");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("ArrayList", "$", 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray4, "oneable#interfacejava.io");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ArrayList" + "'", str5, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
    }

    @Test
    public void test38940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38940");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                       irfCo$irfioSrA..yL A.444444444444444444444444444", (java.lang.CharSequence) "V");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                       irfCo$irfioSrA..yL A.444444444444444444444444444" + "'", charSequence2, "                                                                                                                       irfCo$irfioSrA..yL A.444444444444444444444444444");
    }

    @Test
    public void test38941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray6, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass11 = null;
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray18, "                                  ");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "$");
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray24);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "                                   " };
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray36);
        java.lang.Class<?> wildcardClass39 = null;
        java.lang.Class[] classArray41 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        wildcardClassArray42[0] = wildcardClass39;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray42);
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray42, true);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray42, false);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray42, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray42);
        java.lang.String str58 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray42, ".......");
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray42);
        java.lang.String str61 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "jAVA.L$ArrayList");
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "                                   " + "'", str37, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java.lang" + "'", str58, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.lang" + "'", str61, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray62);
    }

    @Test
    public void test38942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                                                                                                                            44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rrayList44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaja                                              aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring", 243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring" + "'", str2, "                                           aaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaajaval.agnaaaaaaaaaaring");
    }

    @Test
    public void test38944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".. .. .. .. .. .. .. .. .. .. .. ..." + "'", str2, ".. .. .. .. .. .. .. .. .. .. .. ...");
    }

    @Test
    public void test38945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("############################..", "gn                                            gn                                            gn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################.." + "'", str2, "############################..");
    }

    @Test
    public void test38946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38946");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38947");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("rrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLirrayLi", "GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("ILyarrAtsiLyarrAtsiLyarrAlang.javatsiLyarrAtsiLyarrAtsiAAAAAAAAAAngag", 210, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...yarrAtsiLyarrAtsiAAAAAAAAAAngag" + "'", str3, "...yarrAtsiLyarrAtsiAAAAAAAAAAngag");
    }

    @Test
    public void test38949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38949");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Gnl$", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38950");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG", 348);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ siLyarrA!iH$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$" + "'", str2, "$$$$$$$$$$");
    }

    @Test
    public void test38952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("A$L");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A$L" + "'", str1, "A$L");
    }

    @Test
    public void test38953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                       irfCo$irfioSriiNTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                       irfCo$irfioSriiNTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG" + "'", str2, "                                                                                                       irfCo$irfioSriiNTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG.cLONEABLE......NTERFACEJAVA.LANG");
    }

    @Test
    public void test38954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test38955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ziirSoifri.oCfri", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           ziirSoifri.oCfri                                            " + "'", str2, "                                           ziirSoifri.oCfri                                            ");
    }

    @Test
    public void test38956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38956");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38957");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                  . ", 'a');
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test38958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38958");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     aaaaaaaaaa      ", "AVAJ.GNALNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJ", 34);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                         aaaaajaaaaaaa                                                                                                                                                                                                                                                                                          ", "CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                         aaaaajaaaaaaa                                                                                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                                                                                         aaaaajaaaaaaa                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test38960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38960");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("NALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38961");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("nterface java.lang.cloneable....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "elb$zil$ireS.oi.$v$j#ec$fretniGNALUAVAJ#######################....................................................................elb$enolC.gn$l.$v$j#ec$fretni", 924);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444aaaaaaaINTEGERaaaaaaa4444444", "tu");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avaj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38964");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                 -1jv.utilString-1jv.utilString", "langaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38965");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("NAELOOB.................................................................................................................................................................................................................................................", "JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38966");
        java.lang.String[] strArray4 = new java.lang.String[] { "                                   " };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("java.lang", strArray4);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...$$$$$$$$$$$$$$$...", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                                                                                                                                                                                                                                                                                                                                                          Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...                                                                                                                                                                                                                                                                                                                                                                                                           ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray12, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAri");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                   " + "'", str5, "                                   ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "String[]" + "'", str14, "String[]");
    }

    @Test
    public void test38967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(".avaj", "                                                                              javaulainterface java.lang.cloneable4interface java.io.serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".avaj" + "'", str2, ".avaj");
    }

    @Test
    public void test38968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38968");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "....................................................................................................................................................................jvstringnlrrylistrrylistrrylistv..............................................................................................................................................................................................................................................................", (java.lang.CharSequence) "                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 441 + "'", int2 == 441);
    }

    @Test
    public void test38969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar", "$$$$$$$$$$$$$$$.....$$$$", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar" + "'", str3, "Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar");
    }

    @Test
    public void test38970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38970");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ", (java.lang.CharSequence) "YLISTARRAYLISTARRAY");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 151 + "'", int2 == 151);
    }

    @Test
    public void test38971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("INTERFACE JAVA.LANG.CLONEABLE$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACE JAVA.LANG.CLONEABLE$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE" + "'", str1, "INTERFACE JAVA.LANG.CLONEABLE$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVA$$$.JAVAINTERFACE JAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test38972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("rrayList rrayList rrayList rray$ArrayLis", 544);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          " + "'", str1, "                          ");
    }

    @Test
    public void test38974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38974");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "STRING", 12);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "JAVA");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("Arra", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "n");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str9, "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38975");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!ArrayLis", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "..........................................................................................................................................................................................................................................................ULITULITULITULITUL####LITULITULITULITULITUL...........................................................................................................................................................................................................................................................");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!ArrayLis" + "'", str5, "Hi!ArrayLis");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test38976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaa...                          $$", 897);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38977");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                      ", "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38978");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                               JLANGAVLANGALLANGANG       ", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "VA", "NGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGJAVAGNALAVAJLANGGNALELBAENOLCGNALAVAJ ECAFR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", 113);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi                        " + "'", str2, "                        gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi                        ");
    }

    @Test
    public void test38981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "StringStringStringStringStringStringStringStringStringString", 0);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray3, "Array");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                      litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test38982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38982");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                interface java.lang.Cloneable][sslCinterface java.io.Serializable                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 90, 793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aYl a4444444444", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38984");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) ".lang.lang.lang.lang", "... java.lang.stringclass java.lang.stringclass...                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test38985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 357, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....................................................................................................................................................................................................................................................................................................." + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test38986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38986");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("][sslC", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "hi!", (int) (byte) -1);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("ArrayList", strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "Serializabl");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r...", strArray5, strArray12);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ".. java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........avainterface java.io.Serializable", 943, 135);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    " + "'", str17, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$A rrr rrr rrr r                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "..." + "'", str18, "...");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test38987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("########################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test38988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "JAVA..........JAVA..........JAVA..........JA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38989");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#", "...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38990");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38991");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "                                   " };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray14);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray20);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray20, true);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray20, false);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray20, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray33);
        java.lang.Class[] classArray37 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        java.lang.Class<?> wildcardClass40 = null;
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray43, true);
        java.lang.Class[] classArray50 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray51);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray52, "...                                 ");
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray57, true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                   " + "'", str15, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test38992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38992");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JAVA..........JAVA..........JAVA...", "siLyrrA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "VAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass java.lang.O...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.O...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "java.lang.O...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rclass AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38995");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......", ".langGNAL..langjava.langAGNAL.AVAJAAAAjGNALAAAAAjAAAAAAAAjAG", 83);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  ...                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "GNALaRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlI...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.aRRAYlIST...Al.aRRAYlISTGNAL.Al.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "Arrclas...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                          ClassJAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaULANG");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "utilString-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "utilString-" + "'", str1, "utilString-");
    }

    @Test
    public void test39000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test39000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl" + "'", str1, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSsl");
    }
}


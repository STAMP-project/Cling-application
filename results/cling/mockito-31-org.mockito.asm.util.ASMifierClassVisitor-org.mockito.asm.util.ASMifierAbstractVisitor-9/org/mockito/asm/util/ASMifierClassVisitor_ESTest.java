/*

 * Tue Mar 03 14:16:03 GMT 2020
 */

package org.mockito.asm.util;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "", "'9,bb'Y", "'9,bb'Y", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(48, 512, "'9,bb'Y", "StackMap", (String) null, aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16373, "", "Ei|v!", "ACC_BRIDGE", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("XyVKCZ*9SoB.GfV", false);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16373, "XyVKCZ*9SoB.GfV", "ACC_PROTECTED", "XyVKCZ*9SoB.GfV", ((AbstractVisitor) annotationVisitor0).TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(297, "Ei|v!", "Ei|v!", "", (String[]) null);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "().class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // ().class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "F=0TFgv|y", "&", "x=", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(8192, 8192, "wC,7Y(y[DGB9u]", "Signature", "Signature", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "wC,7Y(y[DGB9u]", (String) null, "}, ", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(196653, 50, "4;*97+MF<", "DGB9u]", "7r>3y_|2]29>b", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(155, (-2895), "4;*97+MF<", "7[kO]u", (String) null, aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-1071), 8192, "<!xdh::9k6/\"i", "wC,7Y(y[DGB9u]", "wC,7Y(y[DGB9u]", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "java/lang/Object";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // java/lang/Object (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(16416, "DGBu]", "DGBu]", "A'PDM/K/v", "A'PDM/K/v");
      aSMifierClassVisitor0.appendAccess(813);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(16416, "DGBu]", "DGBu]", "A'PDM/K/v", "A'PDM/K/v");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(193, "A'PDM/K/v", "PeAlP$`*r8;V=^=..class", "PeAlP$`*r8;V=^=..class", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(16416);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-938), "DGBu]", "Prints the ASM code to generate the given class.", "PeAlP$`*r8;V=^=.", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 195, "4.ZeE'\u0003\"4+~[p~;ds.class", "FieldVisitor fv;\n", "&w6n&qJ", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(8192, 8192, "&", "&", "&", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField(8192, "fM\"J.o1>3bnJ", "\"/uPrFi|H ", "+|C|0LjOE8%", object0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "wC,7Y(y[DGB9u]";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Class not found
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("2(s@QZeB^<,;[spF", "2(s@QZeB^<,;[spF", "EHc", 16384);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "MJ!_[b@4Q<", "MJ!_[b@4Q<", "ACC_STATIC", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 48, "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-432), "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("DGBu]", "import java.util.*;\n", "DGBu]", 65535);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(184, "DGB9u]", "g{pP~t/vn 9TK]5A WJ", "kN\"F", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "`&Sm KaN)}", "Signature", "g-S#fy", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(16384, 8, "'9,bb'Y", "PeAlP$`*r8;V=^=..class", "import java.util.*;\n", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(3626, "r!}J", "mv.visitMultiANewArrayInsn(", "wC,7Y(y[DGB9u].class", "wC,7Y(y[DGB9u].class");
      String[] stringArray0 = new String[1];
      stringArray0[0] = " });\n";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Class not found
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "`&Sm KaN)}", "wC,7Y(y[DGB9u]", "g-S#fy", aSMifierClassVisitor0.TYPES);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "wC,7Y(y[DGB9u]";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Class not found
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 48, "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", "Q\"]", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(16416, "DGBu]", "DGBu]", "A'PDM/K/v", "A'PDM/K/v");
      aSMifierClassVisitor0.visit(8, (-1064), "A'PDM/K/v", "new Byte((byte)", "A'PDM/K/v", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("2(s@QZeB^<,;[spF", "2(s@QZeB^<,;[spF", "EHc", 16384);
      aSMifierClassVisitor0.visit(16384, 255, "n", "EHc", "n", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(46, "`&Sm KaN)}", "4.ZeE'\u0003\"4+~[p~;ds", ",8sKJ24w{3D", (String[]) null);
      aSMifierClassVisitor0.visit(46, 8192, "`&Sm KaN)}", "g{pP~t/vn 9TK]5A WJ", "-debug", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "&", "'9,bb'Y", "'9,bb'Y", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1364), "ktERV:eX", "'9,bb'Y", "PeAlP$`*r8;V=^=.", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-942), "-", "~7Gmw#ED^WQ", "V1_6", aSMifierClassVisitor0.OPCODES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "", "'9,bb'Y", "'9,bb'Y", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(48, "", (String) null, "Yw};,", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(8192, "wC,7Y(y[DGB9u]", (String) null, "}, ", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("DGBu]", "YuvF(]v0ubW6'gEvFx", "DGBu]", 65535);
      aSMifierClassVisitor0.visit(2089, 171, "9/7ON", "kN\"F", "YuvF(]v0ubW6'gEvFx", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(16416);
      aSMifierClassVisitor0.visit(8, (-1064), "A'PDM/K/v", "new Byte((byte)", "A'PDM/K/v", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("XyVKCZ*9SoB.GfV", false);
      aSMifierClassVisitor0.visit(46, 1092, "XyVKCZ*9SoB.GfV", ",IF'$UY#,=,C=ZW:", "SourceDebugExtension", ((AbstractVisitor) annotationVisitor0).TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-5642), "(;XS&hGo&][t[&]P-", "(;XS&hGo&][t[&]P-", "%bWq", ((AbstractVisitor) annotationVisitor0).OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, (-2628), "ioJRXizge{K[,Q_c", "1|0bsOm9", "1|0bsOm9", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, 2491, "00", "xHRE#0~e]z#sGzb_K/&", "XyVKCZ*9SoB.GfV", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, 8192, "Signature", "`eS:", "wC,7Y(y[DGB9u]", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-942), "-", "~7Gmw#ED^WQ", "V1_6", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(8192, "N", "new String[] {", "}\n", "wC,7Y(y[DGB9u]");
      aSMifierClassVisitor0.visit(2910, 2910, "'pN T*Mui1H&c3EbbD", "new String[] {", "{\n.class", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(16416, "DGBu]", "DGBu]", "A'PDM/K/v", "A'PDM/K/v");
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(16384);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2602), (-2602), "XyVKCZ*9SoB.GfV", "XyVKCZ*9SoB.GfV", "XyVKCZ*9SoB.GfV", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit((-2602), 168, "XyVKCZ*9SoB.GfV", "6=", ">G<rX>y0", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-141));
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-889275714), 193, "D(E^d<EV`IO", "D(E^d<EV`IO", "D(E^d<EV`IO", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 48, "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", "42:DWr}S)7}=y%K)]U", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(1945, 16384, ".OA]:^0zM", "().class", ".OA]:^0zM", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(16384);
      aSMifierClassVisitor0.visit(16384, 255, "n", "EHc", "n", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-853));
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(23, "-`]~!g2[G&K~^X", (String) null, "", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(5178, 16384, ">3bnJ", "-`]~!g2[G&K~^X", "new Short((short)", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(16384, 16384, "wC,7Y(y[DGB9u]", "a$EXU:C", "a$EXU:C", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, (String) null, "At+2`2\"@SLd,1/", "'u<,]T50 Gz(bmnK", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, 8192, "Signature", "`eS:", "wC,7Y(y[DGB9u]", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16416, "DGBu]", "DGBu]", "A'PDM/K/v", "A'PDM/K/v");
      aSMifierClassVisitor0.visit((-572), 1822, "LjO.8%", "NY9Rvta~TIzoHY'~rY", "ACC_VARARGS", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-938), "DGBu]", "Prints the ASM code to generate the given class.", "PeAlP$`*r8;V=^=.", (String[]) null);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(2511, "hx^", "PeAlP$`*r8;V=^=.", "DGBu]", stringArray0);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(16416);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(2511, "hx^", "PeAlP$`*r8;V=^=.", "DGBu]", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16416, "DGBu]", "DGBu]", "A'PDM/K/v", "A'PDM/K/v");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-572), "ACC_VARARGS", " = av", "LjO.8%", ((AbstractVisitor) fieldVisitor0).TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(184, 16416, "DGBu]", "kN\"F", "(;XS&hGo&][t[&]P-", (String[]) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16416, "kN\"F", "DGB9u]", "DGB9u]", "PeAlP$`*r8;V=^=..class");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(196653, 50, "4;*97+MF<", "DGB9u]", "7r>3y_|2]29>b", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(50, (-1845), "Qu a/]Ha1:d", ".class", "7[kO]u", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("DGBu]", "import java.util.*;\n", "DGBu]", 65535);
      aSMifierClassVisitor0.visit(1329, 16416, "DGBu]", "kN\"F", "DGBu]", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass((String) null, (String) null, " });\n.class", (-967));
      aSMifierClassVisitor0.visit(49, 16416, "i", "i", "i", (String[]) null);
  }
}

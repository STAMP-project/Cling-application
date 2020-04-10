/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 08:46:07 GMT 2019
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
import org.mockito.asm.util.ASMifierMethodVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(128);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(8192, (String) null, "?4^iXZ", (String) null, aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(79, 256, "RuntimeInvisibleAnnotations", "SPx^;", "Fi*G}])//DA4%l'J", (String[]) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("}z*Dpuf-F$G/g,", "}z*Dpuf-F$G/g,", "}z*Dpuf-F$G/g,", 2864);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "N,HGpX[%8A>/Y+";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // N,HGpX[%8A>/Y+ (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(1910);
      String[] stringArray0 = new String[1];
      stringArray0[0] = " + ";
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
  public void test04()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(188, 46, "package asm.", "double", (String) null, stringArray0);
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(196653, 1990, "mv.visitLdcInsn(", "null", ")UV", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, 50, "MH#xMW?F1eqHU,,}", "MH#xMW?F1eqHU,,}", "MH#xMW?F1eqHU,,}", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(49, 8192, "pJ8[*P", "mv.visitTryCatchBlock(", "mv.visitTryCatchBlock(", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(1910);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "%`$$.}U{)\"t+.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // %`$$.}U{)\"t+.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(8192, 8192, "Cf\"?_#fk", (String) null, "i=O,(l[Y{^HwF", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("(short)", "}z*Dpuf-F$G/g,", ".o\"jcM)u_Uh0~", 2864);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(8192, 8192, "Cf\"?_#fk", (String) null, "i=O,(l[Y{^HwF", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(2838, "t,MX+{Gb9f", (String) null, "zWH(&\".:fi(#sn9Q@", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(5071, 8192, "Cf\"?_#fk", (String) null, "i=O,(l[Y{^HwF", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess(32);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(1948);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "N,HGpX[%8A>/Y+";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // N,HGpX[%8A>/Y+ (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2096), "*Sojt%f", "*Sojt%f", "*Sojt%f", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(0, "qoc", "qoc", "ukhexui9pRc`).=etA", stringArray0);
      aSMifierClassVisitor0.visit(0, 8192, "ukhexui9pRc`).=etA", "tX9K'?vTiw!Cy/P ,g_", "Aq2[1N4wv51rrO", ((AbstractVisitor) methodVisitor0).TYPES);
      aSMifierClassVisitor0.visitInnerClass("RuntimeInvisibleAnotations.class", "-debug", "00", 198);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(1549, ")_cI_6>;h+t", " 7]`XJk|has\"(-;0+", "3OJB;fD>BVV`&]hGDn", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(48, (-1341), "ACC_SYNTHETIC", "org.mockito.asm.util.AbstractVisitor", "EY.!-[]^", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(46, 8192, "sP?hR?", "ations", "ACC_INTERFACE", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(5071, 8192, "Cf\"?_#fk", (String) null, "i=O,(l[Y{^HwF", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "qoc", ")>", "Xn^p<$PB35T%lgaF3", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1572, "mv.visitLdcInsn(", "mv.visitLdcInsn(", "mv.visitLdcInsn(", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(47, 8192, "L=j-7R>", "Pl8b  kqsnkV)]j7", "Cf\"?_#fk", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(5071, 8192, "Cf\"?_#fk", (String) null, "i=O,(l[Y{^HwF", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(178, (-167), "*[", (String) null, "wB", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("+e%jv~Y(giUD^A", "0ZU5aLo#>%h6NQr", "ACC_ANNOTATION", 176);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "/`\"dOB", "3OJB;fD>BVV`&]hGDn.class.class", "-debug", "0U");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-3351), (-3351), "SSQ/fJ$j1?&\"E ea}\"M", "SSQ/fJ$j1?&\"E ea}\"M", " }, new Label[] {", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(65535, "/`\"dOB", " +[yk.class", "-debug", "0U");
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("-debug", true);
      aSMifierClassVisitor0.visit(65535, 65535, ".visit(", "=", "-debug", ((AbstractVisitor) annotationVisitor0).OPCODES);
      aSMifierClassVisitor0.appendAccess(32);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-1148), " }", " }", " }", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(49, 49, "^4rD", "ConstantValue", " }", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor.main(stringArray0);
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16384, 16384, "RuntimeInvisibleAnnotations", "t(1", "f*g~N<fwz;D'6.class", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-1698), (-690), "6T!~`re`+k^", "(short)", "V1_3", aSMifierClassVisitor0.TYPES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(200, "hXU)4^!\"t)U", "hXU)4^!\"t)U", "V1_3", "hXU)4^!\"t)U");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter1 = new PrintWriter(printWriter0, true);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter1);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(808, (String) null, "-debug", (String) null, object0);
      FieldVisitor fieldVisitor1 = aSMifierClassVisitor0.visitField(65535, "=", "ACC_PRIVATE", "w&#%efYvl1~^}f7D", "ACC_PRIVATE");
      assertFalse(fieldVisitor1.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(188, 46, "package asm.", "double", (String) null, aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(4096, 16384, "!Kff@?o", "!Kff@?o", "!Kff@?o", stringArray0);
      aSMifierClassVisitor0.visit((-528), (-528), ",xIst?=}.class", "!Kff@?o", ",xIst?=}.class", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(4096, 16384, "!Kff@?o", "!Kff@?o", "!Kff@?o", stringArray0);
      aSMifierClassVisitor0.visitInnerClass(" + ", "8A>/Y+", "!Kff@?o", 6);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("-debug", true);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(65535, 65535, ".visit(", "=", "-debug", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "/`\"dOB", " +[yk.class", "-debug", "0U");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess((-2039));
      String[] stringArray0 = new String[2];
      stringArray0[0] = ",xIst?=}";
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
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "!Kff@?o", (String) null, "java/lang/Object", stringArray0);
      aSMifierClassVisitor0.visit(16384, 16384, "RuntimeInvisibleAnnotations", "t(1", "f*g~N<fwz;D'6.class", stringArray0);
      aSMifierClassVisitor0.visit(3, 4096, "java/lang/Object", "}XsjDU3rlK", "}XsjDU3rlK", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(17, "qoc", "MoV`LUmow3fa5h1c", "ukhexui9pRc`).=etA", stringArray0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, " 7]`XJk|has\"(-;0+", "qoc", ".visitAnnotation(", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[8];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, (-709), "ConstantValue", "ACC_ENUM", "ACC_ENUM", stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess((-2039));
      aSMifierClassVisitor0.visit(47, 3, "mv.visitVarInsn(", "}h PEz&", "A</E#U>xh,yE1", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitField(65535, "/`\"dOB", " +[yk.class", "-debug", "0U");
      aSMifierClassVisitor0.visit(1024, 65535, "L)", "-debug", "!4,-l,F", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-690), "6T!~`re`+k^", " 7]`XJk|has\"(-;0+", " 7]`XJk|has\"(-;0+", aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, ":x~+=[Lj@Dh}|;:k?", "7", "-debug", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(196653, (-1397), "~w@)`\"xv", "ations", "hXU)4^!\"t)U", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(50, (-137), " 7]`XJk|has\"(-;0+.class", " + .class.class", "m^9*", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1440, "&]hGDn", "-debug", "new double[] {", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(49, 49, "-debug", "elbp:r9@", "i=O,(l[Y{^HwF", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1149), "SSQ/fJ$j1?&\"E ea}\"M", (String) null, (String) null, (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("-debug", true);
      aSMifierClassVisitor0.visitInnerClass("0U", "=", "=", 65535);
      aSMifierClassVisitor0.visit(65535, 65535, "/`\"dOB", "[JH69)F bA=", "", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(17, "qoc", "MoV`LUmow3fa5h1c", "ukhexui9pRc`).=etA", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("ukhexui9pRc`).=etA", "RuntimeInvisibleAnotations.class", "mv.visitVarInsn(", 65535);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("+e%jv~Y(giUD^A", "0ZU5aLo#>%h6NQr", "ACC_ANNOTATION", 176);
      aSMifierClassVisitor0.visitInnerClass("0U", "=", "=", 65535);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "!Kff@?o", (String) null, "java/lang/Object", stringArray0);
      aSMifierClassVisitor0.visit(16384, 16384, "RuntimeInvisibleAnnotations", "t(1", "f*g~N<fwz;D'6.class", stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(1681, "new Long(", "\"", "", ((AbstractVisitor) methodVisitor0).OPCODES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("0U", "=", "=", 65535);
      aSMifierClassVisitor0.appendAccess(32);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("mv.visitVarInsn(", "mv.visitVarInsn(", "}z*Dpuf-F$G/g,", 65535);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(200, "hXU)4^!\"t)U", "hXU)4^!\"t)U", "V1_3", "hXU)4^!\"t)U");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("0U", "=", "=", 65535);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("mv.visitVarInsn(", "mv.visitVarInsn(", "}z*Dpuf-F$G/g,", 65535);
      aSMifierClassVisitor0.visit(46, 180, "$`:-t$eM?;Y-A{", "f*g~N<fwz;D'6", "}z*Dpuf-F$G/g,", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("-debug", "-debug", ">,LLsE< 8q{+G/s:i", 65535);
      aSMifierClassVisitor0.visit(47, 3, "mv.visitVarInsn(", "}h PEz&", "A</E#U>xh,yE1", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("mv.visitVarInsn(", "mv.visitVarInsn(", "}z*Dpuf-F$G/g,", 65535);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1344, (String) null, "}z*Dpuf-F$G/g,", "$`:-t$eM?;Y-A{", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }
}

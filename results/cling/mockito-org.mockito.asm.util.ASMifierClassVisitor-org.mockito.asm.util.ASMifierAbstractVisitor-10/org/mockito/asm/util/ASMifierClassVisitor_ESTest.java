/*

 * Tue Mar 03 14:15:45 GMT 2020
 */

package org.mockito.asm.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2560), (String) null, (String) null, "zKOwF}e=t;j6e`NwX", object0);
      aSMifierClassVisitor0.visit((-367), 280, "ByhDL", "z[U=tQ", "new char[] {", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32, "mY \"", "mY \"", (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "sm-M3S{yl vXRl[", "", "U0l;v", object0);
      FieldVisitor fieldVisitor1 = aSMifierClassVisitor0.visitField(160, "0* *wyUmtRE V?Q`u*d", ".r\">dS%:U6$]N[r.", "org.mockito.asm.util.AbstractVisitor", object0);
      assertFalse(fieldVisitor1.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitInnerClass("sm-M3S{yl vXRl[", "(=)", "cw", 65535);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(160, "0* *wyUmtRE V?Q`u*d", ".r\">dS%:U6$]N[r.", "org.mockito.asm.util.AbstractVisitor", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2560), (String) null, (String) null, "zKOwF}e=t;j6e`NwX", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "zLVrm ", "new char[] {.class", "#%j_\":sC\"vE<i", (String[]) null);
      aSMifierClassVisitor0.visit((-1452), 8192, "#%j_\":sC\"vE<i", "+MzadJ/\"", "ttr);\n", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(127, 127, "Yf6)mTG", "zKOwF}e=t;j6e`NwX", (String) null, (String[]) null);
      aSMifierClassVisitor0.visit(327, 8192, "Opcodes.DOUBLE", "StackMap", "Yf6)mTG", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "", "", "av0 = cw.visitAnnotation(", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("", false);
      aSMifierClassVisitor0.appendAccess((-3145));
      aSMifierClassVisitor0.visit(48, 48, "new boolean[] {", "up+i#!:!]2b.class", (String) null, ((AbstractVisitor) annotationVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "new char[] {.class", "sm-M3S{yl vXRl[", "", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-257), "U0l;v", "", "RuntimeInvisibleAnnotations", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("ACC_NATIVE", "mv.visitLdcInsn(", "", 65535);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(65535, "", "", "", "");
      aSMifierClassVisitor0.visitInnerClass(" ", " = new Label();\n", "", 65535);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("} U zx\"mW[&lO\"7@cM*", true);
      aSMifierClassVisitor0.visit(8192, 8192, "", "", "KTq%", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(3826, 32, "} U zx\"mW[&lO\"7@cM*", "", "ZId!+D6o(_p", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(65535, "U0l;v", "RuntimeInvisibleAnnotations", "", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass(" ", " = new Label();\n", "", 65535);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "zKOwF}e=t;j6e`NwX";
      aSMifierClassVisitor0.visit((-2560), 1000, "Opcodes.DOUBLE", "StackMap", (String) null, stringArray0);
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
  public void test15()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "sm-M3S{yl vXRl[", "", "U0l;v", object0);
      aSMifierClassVisitor0.visit(1343, (-256), "zKOwF}e=t;j6e`NwX", "", (String) null, ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2560), (String) null, (String) null, "zKOwF}e=t;j6e`NwX", object0);
      aSMifierClassVisitor0.visit((-2560), 1000, "Opcodes.DOUBLE", "StackMap", (String) null, ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass(" ", " = new Label();\n", "", 65535);
      aSMifierClassVisitor0.appendAccess(0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(4433, "", "new char[] {.class", "", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitField(200, "sm-M3S{yl vXRl[", "zKOwF}e=t;j6e`NwX", "sm-M3S{yl vXRl[", (Object) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "", "zKOwF}e=t;j6e`NwX", "#", aSMifierMethodVisitor0.OPCODES);
      assertFalse(methodVisitor0.equals((Object)aSMifierMethodVisitor0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit((-2423), (-2423), "m$vvxCuL$ Ks", "F`wokRcNCts=?B`m07T", "F`wokRcNCts=?B`m07T", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "sm-M3S{yl vXRl[", "", "U0l;v", object0);
      aSMifierClassVisitor0.visit(8192, 8192, "l7/Q~`eh", "", "6e`NwX", ((AbstractVisitor) fieldVisitor0).TYPES);
      aSMifierClassVisitor0.visitInnerClass("6e`NwX", "P#cbm\u0004*7~", "new char[] {.class", (-1368));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation((String) null, true);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1232, "up+i#!:!]2b.class", "up+i#!:!]2b.class", "Boolean.TRUE", ((AbstractVisitor) annotationVisitor0).TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod((-2079), "public static byte[] dump () throws Exception {\n\n", " U(", (String) null, ((AbstractVisitor) methodVisitor0).OPCODES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("} U zx\"mW[&lO\"7@cM*", true);
      aSMifierClassVisitor0.visit(8192, 8192, "", "", "KTq%", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(127, 127, "", "U0l;v", "sm-M3S{yl vXRl[", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass(" ", " = new Label();\n", "", 65535);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(46, 46, "pahcKiv7", "import org.mockito.asm.attrs.*;\n.class", "import org.mockito.asm.attrs.*;\n.class", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(68, (-3249), "P9n8:/Jal1Z_{tj", "P9n8:/Jal1Z_{tj", "MethodVisitor mv;\n", stringArray0);
      aSMifierClassVisitor0.visit(47, 1024, "P9n8:/Jal1Z_{tj", "P9n8:/Jal1Z_{tj", "%%wj$rcr]qju:?", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "", "", "KTq%", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "", "", "av0 = cw.visitAnnotation(", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      aSMifierClassVisitor0.visitField(65535, "", stringArray0[1], "", "");
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("", false);
      aSMifierClassVisitor0.visit(48, 48, "new boolean[] {", "up+i#!:!]2b.class", (String) null, ((AbstractVisitor) annotationVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(65535, "", aSMifierClassVisitor0.name, "", "");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "[\"Gz^Ovtn6N}k>d1YI", "", "sm-M3S{yl vXRl[", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-3249), (-3249), "mY \"", "mY \"", "mY \"", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32, "mY \"", "mY \"", (String) null, aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2079), "public static byte[] dump () throws Exception {\n\n", " U(", (String) null, aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(49, 3, "Boolean.TRUE", "up+i#!:!]2b.class", (String) null, aSMifierMethodVisitor0.TYPES);
      assertFalse(aSMifierMethodVisitor0.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(59, 59, "//lu1y_5K*#", "//lu1y_5K*#", "oNs6a{A", aSMifierMethodVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2816), "//lu1y_5K*#", "ACC_VARARGS.class", "[]%[", aSMifierMethodVisitor0.TYPES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2423), (-2423), "m$vvxCuL$ Ks", "F`wokRcNCts=?B`m07T", "F`wokRcNCts=?B`m07T", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "zLVrm ", "new char[] {.class", "#%j_\":sC\"vE<i", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("} U zx\"mW[&lO\"7@cM*", true);
      aSMifierClassVisitor0.visit(3826, 32, "} U zx\"mW[&lO\"7@cM*", "", "ZId!+D6o(_p", ((AbstractVisitor) annotationVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(65535, "U0l;v", "RuntimeInvisibleAnnotations", "", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(0, 65535, "RuntimeInvisibleAnnotations", (String) null, " ", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "sm-M3S{yl vXRl[", "", "U0l;v", object0);
      aSMifierClassVisitor0.visitMethod(8192, "/R`", "up+i#!:!]2b.class", "new char[] {.class", stringArray0);
      aSMifierClassVisitor0.visit(8192, 8192, "l7/Q~`eh", "", "6e`NwX", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(65535, "U0l;v", "RuntimeInvisibleAnnotations", "", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess(0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField((-2560), (String) null, (String) null, "zKOwF}e=t;j6e`NwX", object0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "zKOwF}e=t;j6e`NwX";
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
  public void test39()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "sm-M3S{yl vXRl[";
      aSMifierClassVisitor0.visitField(65535, "", stringArray0[1], "", "");
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
}

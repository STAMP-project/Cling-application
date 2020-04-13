/*

 * Tue Mar 03 14:15:29 GMT 2020
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
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-2079), (-2079), "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", "X(~", stringArray0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "X(~", "org.mockito.asm.Type", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, 46, "MA", "", "", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(16384, "-nm", "g*OOs,", "g*OOs,", (String[]) null);
      aSMifierClassVisitor0.visit((-187), 16384, ",", "-debug", "-debug", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2015), 16384, ")jnW>W,QTS^4oL\"#7", "J^?ZmAi~Nl;[`^E", "J^?ZmAi~Nl;[`^E", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess(40);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "sZhLg:b/xkT";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // sZhLg:b/xkT (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "N`m,_6KY", "11'qe*OC", (String) null, aSMifierClassVisitor0.OPCODES);
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.OPCODES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(128);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("#\"^nGd{>HL", "org.mockito.asm.Type", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", 16384);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-2079), (-2079), "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", (String) null, "X(~", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("#\"^nGd{>HL", "org.mockito.asm.Type", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", 16384);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "N`m,_6KY", "11'qe*OC", (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, (-233), "ACC_VARARGS", "nX&y]Lc<V)<\"F", "", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("5'd*y", "5'd*y", (String) null, 247);
      aSMifierClassVisitor0.appendAccess(16384);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16398, "-nm", "g*OOs,", "g*OOs,", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(32);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, ");\n\n", "<Y7xZ:ndpD.class", (String) null, (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField(4096, "{iZ]C!G?z*5PYkX", "{iZ]C!G?z*5PYkX", "{iZ]C!G?z*5PYkX", object0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "g*OOs,";
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
      aSMifierClassVisitor0.appendAccess(16384);
      aSMifierClassVisitor0.visit(48, 48, "YXUA:r(y9#$v4l@{o#f.class", "mv.visitFrame(Opcodes.F_NEW, ", "g*OOs,", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-233), (-233), "1C8jYY17/{}e*XO:h", "ACC_VARARGS", "ACC_VARARGS", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("#\"^nGd{>HL", "org.mockito.asm.Type", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", 16384);
      aSMifierClassVisitor0.appendAccess(342);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("#\"^nGd{>HL", "org.mockito.asm.Type", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", 16384);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("X(~", false);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1517), (String) null, "(3>DFog*OOs,.class", "mv.visitIntInsn(", ((AbstractVisitor) annotationVisitor0).OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "-nm", "-nm", "T", (String[]) null);
      aSMifierClassVisitor0.visit(8192, (-2182), "g*OOs,", "g*OOs,", ", ", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(248, 248, "0*=7u&]Dj Cp,D@=e ", "0*=7u&]Dj Cp,D@=e ", "mv", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess((-428));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess((-428));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("RuntimeVisibleAnnotations", "aHTVvyZA#C%9e0AfS9o", "]UO0", 2903);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, ");\n\n", "<Y7xZ:ndpD.class", (String) null, (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16384, 8192, "-nm", "g*OOs,", ", ", (String[]) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "-nm", ", ", "|$XAES2fvSXMM[*@~", ", ");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("#\"^nGd{>HL", "org.mockito.asm.Type", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", 16384);
      aSMifierClassVisitor0.visit((-2195), 437, "Q [4/o", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", "Q [4/o", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, (-1562), "MA", "", "", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, 47, "Z1", "gS`yy,Ud}t~O{>", "gS`yy,Ud}t~O{>", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess((-316));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-2724));
      aSMifierClassVisitor0.visit(50, 50, "f$=]$s#u@MT", "< ", "f$=]$s#u@MT", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, ");\n\n", "<Y7xZ:ndpD.class", (String) null, (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("#\"^nGd{>HL", "org.mockito.asm.Type", "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", 16384);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2099), (-2099), "H@#_9$,S_zG $VY+f", "H@#_9$,S_zG $VY+f", "3T*wgdecUZ_C3X2U", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16384, 16384, "g*OOs,", "g*OOs,", ", ", (String[]) null);
      aSMifierClassVisitor0.visit((-2099), (-2099), "H@#_9$,S_zG $VY+f", "H@#_9$,S_zG $VY+f", "3T*wgdecUZ_C3X2U", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-362207053), "E}Eo%O51%#_(-", (String) null, "T8za,D", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(49, "<Y7xZ:ndpD.class", "cw", "V1_5", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess((-428));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-2079), (-2079), "Usage: ASMifierClassVisitor [-debug] <fully qualified class name or class file name>", (String) null, "X(~", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "N`m,_6KY", "11'qe*OC", (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(49, "<Y7xZ:ndpD.class", "cw", "V1_5", aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, ");\n\n", "<Y7xZ:ndpD.class", (String) null, (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2789), (-2789), "g*OOs,", "T?", "g*OOs,", aSMifierClassVisitor0.TYPES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "g*OOs,";
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
  public void test36()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-2049));
      aSMifierClassVisitor0.visit(196653, 8, " = new Label();\n", "%~aL=F", ", ", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, 32, ",", "8/k*K(", "<Y7xZ:ndpD.class", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess((-428));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(32, 49, "RuntimeVisibleAnnotations", ",", "<Y7xZ:ndpD.class", aSMifierClassVisitor0.TYPES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, ");\n\n", "<Y7xZ:ndpD.class", (String) null, (Object) null);
      assertNotNull(fieldVisitor0);
  }
}

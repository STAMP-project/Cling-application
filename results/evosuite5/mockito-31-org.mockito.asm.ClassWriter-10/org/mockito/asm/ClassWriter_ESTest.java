/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 21:53:19 GMT 2019
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.MethodWriter;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1048558));
      classWriter0.threshold = 2;
      int int0 = classWriter0.newMethod("$E;rrETcu>b|)", "$E;rrETcu>b|)", "$E;rrETcu>b|)", true);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2393));
      classWriter0.threshold = (-2393);
      Item item0 = classWriter0.newLong((-2393));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassWriter", "org.mockito.asm.ByteVector");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-931));
      String string0 = classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-931));
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.Item", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2393));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(40, (-1191));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-931));
      Item[] itemArray0 = new Item[4];
      classWriter0.typeTable = itemArray0;
      classWriter0.addUninitializedType("*M6<K4z5D ^D~", (-931));
      classWriter0.addType("java/lang/Object");
      classWriter0.addType("$TgmL&^]");
      int int0 = classWriter0.addType("*M6<K4z5D ^D~");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(44);
      classWriter0.addUninitializedType("java/lang/Object", 17);
      int int0 = classWriter0.addUninitializedType("java/lang/Object", 17);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      classWriter0.addType(":I0MKGbjI_=uF");
      int int0 = classWriter0.addType(":I0MKGbjI_=uF");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      Item item0 = classWriter0.newMethodItem("", "", "", true);
      Item item1 = classWriter0.newMethodItem("", "", "", false);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3163));
      Item item0 = classWriter0.newConstItem("");
      Item item1 = classWriter0.newConstItem("");
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      Item item0 = classWriter0.newDouble((-782));
      Item item1 = classWriter0.newDouble((-782));
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2393));
      Item item0 = classWriter0.newLong((-2393));
      Item item1 = classWriter0.newLong((-2393));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      Item item0 = classWriter0.newFloat(0.0F);
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      classWriter0.newMethodItem("h`{LhBiTXR'Afy", "h`{LhBiTXR'Afy", "h`{LhBiTXR'Afy", false);
      int int0 = classWriter0.newMethod("h`{LhBiTXR'Afy", "h`{LhBiTXR'Afy", "h`{LhBiTXR'Afy", false);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2784));
      classWriter0.newField("", "", "");
      int int0 = classWriter0.newField("", "", "");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassWriter classWriter0 = new ClassWriter(9);
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      Type type0 = Type.getObjectType("l@=y^&VM{)mMHyj1c");
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-952));
      Double double0 = new Double(2);
      Item item0 = classWriter0.newConstItem(double0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-931));
      Long long0 = new Long(14);
      Item item0 = classWriter0.newConstItem(long0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(189);
      Float float0 = new Float((double) 2);
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-850));
      Boolean boolean0 = Boolean.TRUE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      Boolean boolean0 = Boolean.valueOf("~IU'p5uG#");
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      Short short0 = new Short((short)21);
      Item item0 = classWriter0.newConstItem(short0);
      Item item1 = classWriter0.newConstItem(short0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      Character character0 = new Character('U');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-931));
      Byte byte0 = new Byte((byte) (-36));
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(38);
      int int0 = classWriter0.newConst(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2393));
      Attribute attribute0 = new Attribute(";e~$zjgk-c");
      byte[] byteArray0 = new byte[9];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(40, (-1191));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "oq";
      stringArray0[1] = "SourceFile";
      classWriter0.visit((-2), (-2), "oq", "SourceFile", "SourceDebugExtension", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.visitSource(")V", ")V");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1164);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "t7#0_M\"Ys@W) ol";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "t7#0_M\"Ys@W) ol", "", "", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitInnerClass("", (String) null, (String) null, 2);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2378));
      classWriter0.visitInnerClass((String) null, (String) null, "U%p-mxk;7nHLrz'Y$", (-2378));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(82);
      classWriter0.visitInnerClass(";2s", ";2s", ";2s", 82);
      classWriter0.visitInnerClass(";2s", ";2s", ";2s", 82);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2378));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      classWriter0.visitAnnotation(".s.IFJDCS", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(105);
      classWriter0.visitOuterClass("org.mockito.asm.Frame", "org.mockito.asm.Frame", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      classWriter0.visitOuterClass("6tJF,@;", "6tJF,@;", "6tJF,@;");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1512);
      classWriter0.visitOuterClass("<", (String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2393));
      classWriter0.visitSource("", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2378));
      classWriter0.visitSource((String) null, "'\"9roBs;5P5!b");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "w!08.,";
      stringArray0[1] = "\"]vladVh6)6C";
      stringArray0[2] = "\"]vladVh6)6C";
      stringArray0[3] = "\"]vladVh6)6C";
      stringArray0[4] = "w!08.,";
      stringArray0[5] = "w!08.,";
      stringArray0[6] = "\"]vladVh6)6C";
      classWriter0.visit(10, (-1815), "\"]vladVh6)6C", "\"]vladVh6)6C", "w!08.,", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(125, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(340);
      String[] stringArray0 = new String[0];
      classWriter0.visit(11, 340, "~", "~", (String) null, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3242);
      classWriter0.visit(3242, 3242, "SourceFile", "SourceFile", "SourceFile", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        classWriter0.visit((-268435456), 11, ".s.IFJDCS", (String) null, ".s.IFJDCS", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3398);
      classWriter0.visitField(3398, "", "", "", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-268435441));
      // Undeclared exception!
      try { 
        classWriter0.newConst((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(91, "4oF|}x{ieh|]rJt];", "4oF|}x{ieh|]rJt];", "4oF|}x{ieh|]rJt];", (String[]) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 7579);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      classWriter0.visitEnd();
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }
}

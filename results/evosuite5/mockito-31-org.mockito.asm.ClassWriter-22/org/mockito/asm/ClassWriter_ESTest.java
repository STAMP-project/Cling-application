/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:25:14 GMT 2019
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      classWriter0.threshold = 4;
      Item item0 = classWriter0.newFieldItem("C#D", "C#D", "C#D");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(45);
      Item item0 = classWriter0.newFieldItem("yN.#.", "C#D", "yN.#.");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-11));
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.Edge", "java/lang/Object");
      assertNotNull(string0);
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1509);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.Label", "org.mockito.asm.Label");
      assertEquals("org.mockito.asm.Label", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-8));
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.Label", "java/lang/Throwable");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-8));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-8), (-1721));
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
      ClassWriter classWriter0 = new ClassWriter((-8));
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("rr01", 1857);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      int int0 = classWriter0.addUninitializedType("", (-982));
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("", (-982));
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.addType("j\"");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("j\"");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-44));
      classWriter0.newConstItem("YiP+}Mf");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "YiP+}Mf", "java/lang/Throwable", "yO&?2<bB", "YiP+}Mf");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3470);
      Item item0 = classWriter0.newDouble(3470);
      Item item1 = classWriter0.newDouble(3470);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      Long long0 = new Long(552L);
      Item item0 = classWriter0.newConstItem(long0);
      Item item1 = classWriter0.newLong(552L);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newFloat(0);
      Item item1 = classWriter0.newFloat(0);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Item item0 = classWriter0.newMethodItem("cgUmO-D.W", "cgUmO-D.W", "cgUmO-D.W", true);
      Item item1 = classWriter0.newMethodItem("cgUmO-D.W", "cgUmO-D.W", "cgUmO-D.W", true);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      Item item0 = classWriter0.newMethodItem("C#D", "C#D", "C#D", false);
      Item item1 = classWriter0.newFieldItem("Synthetic", "C#D", "C#D");
      assertFalse(item1.equals((Object)item0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Item item0 = classWriter0.newFieldItem("", "java/lang/Object", "");
      Item item1 = classWriter0.newFieldItem("", "java/lang/Object", "");
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-14));
      Type type0 = Type.SHORT_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(107);
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-863));
      byte[] byteArray0 = classWriter0.toByteArray();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.ByteArrayInputStream@3a90488
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Double double0 = new Double(13);
      Item item0 = classWriter0.newConstItem(double0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Float float0 = new Float(0.0F);
      int int0 = classWriter0.newConst(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Boolean boolean0 = Boolean.TRUE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      Boolean boolean0 = Boolean.valueOf("InnerClasses");
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(55);
      Short short0 = new Short((short)4);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2654);
      Byte byte0 = new Byte((byte)49);
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Item item0 = classWriter0.newConstItem(2);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      Attribute attribute0 = new Attribute("StackMap");
      byte[] byteArray0 = new byte[3];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(44, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2645);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(15, 4471, "", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5));
      classWriter0.visitInnerClass("1E?X0", (String) null, (String) null, (-5));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2155));
      classWriter0.visitInnerClass((String) null, (String) null, "09$\"'mD1rvB:v", (-2155));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      classWriter0.visitInnerClass(")V", "t:5#twzi[g/EE", "6Z'%9sOput9;ygx", 109);
      classWriter0.visitInnerClass("6Z'%9sOput9;ygx", "6Z'%9sOput9;ygx", ")V", 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2994));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2994));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-634));
      classWriter0.visitOuterClass("java/lang/String", "_ J;e", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2181));
      classWriter0.visitOuterClass("8L9(Hzt+<gG zFXcOCr", "8L9(Hzt+<gG zFXcOCr", "8L9(Hzt+<gG zFXcOCr");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      classWriter0.visitOuterClass("';g]Rl8&", (String) null, "9W]B}DI+l");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2994));
      classWriter0.visitSource("88K=}A!a1F])z`)Zh", "88K=}A!a1F])z`)Zh");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3009));
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2164));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "+^BxgQ{: )dL<D?";
      classWriter0.visit((-2164), (-2164), "+^BxgQ{: )dL<D?", "7tl<l%|&xe$@%~", "7tl<l%|&xe$@%~", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(107, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visit((-975), (-975), "", (String) null, (String) null, (String[]) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1498));
      classWriter0.visitField((-1498), "[;$KX", "})M`=50)I(>ecfA6J!", "[;$KX", "})M`=50)I(>ecfA6J!");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(145, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2654);
      Character character0 = new Character(':');
      classWriter0.newConst(character0);
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2164));
      int int0 = classWriter0.newMethod("SourceFile", "SourceFile", "SourceFile", true);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[0];
      classWriter0.visitMethod(8, "EnclosingMethod", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2994));
      int int0 = classWriter0.newField("g, z&'~V<.", "g, z&'~V<.", "g, z&'~V<.");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2994));
      classWriter0.invalidFrames = true;
      classWriter0.visit((-2994), 512, "", "", "", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(50, byteArray0.length);
  }
}

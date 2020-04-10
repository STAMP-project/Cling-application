/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 21:13:13 GMT 2019
 */

package org.mockito.asm.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.Attribute;
import org.mockito.asm.Type;
import org.mockito.asm.util.ASMifierAbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierAbstractVisitor_ESTest extends ASMifierAbstractVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Double double0 = new Double(1.0);
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, double0);
      assertEquals("new Double(\"1.0\")", stringBuffer0.toString());
      assertEquals(17, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Long long0 = new Long(0L);
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, long0);
      assertEquals("new Long(0L)", stringBuffer0.toString());
      assertEquals(12, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Float float0 = new Float((-1645.3627F));
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, float0);
      assertEquals("new Float(\"-1645.3627\")", stringBuffer0.toString());
      assertEquals(23, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Integer integer0 = Integer.valueOf((-3502));
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, integer0);
      assertEquals("new Integer(-3502)", stringBuffer0.toString());
      assertEquals(18, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Character character0 = Character.valueOf('4');
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, character0);
      assertEquals(23, stringBuffer0.length());
      assertEquals("new Character((char)52)", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Short short0 = new Short((short)0);
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, short0);
      assertEquals(19, stringBuffer0.length());
      assertEquals("new Short((short)0)", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.TRUE;
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, boolean0);
      assertEquals("Boolean.TRUE", stringBuffer0.toString());
      assertEquals(12, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, boolean0);
      assertEquals("Boolean.FALSE", stringBuffer0.toString());
      assertEquals(13, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Byte byte0 = new Byte((byte) (-63));
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, byte0);
      assertEquals("new Byte((byte)-63)", stringBuffer0.toString());
      assertEquals(19, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Type type0 = Type.BOOLEAN_TYPE;
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, type0);
      assertEquals("Type.getType(\"Z\")", stringBuffer0.toString());
      assertEquals(17, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ASMifierAbstractVisitor.appendConstant((StringBuffer) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.util.ASMifierAbstractVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASMifierAbstractVisitor aSMifierAbstractVisitor0 = new ASMifierAbstractVisitor((String) null);
      Attribute attribute0 = mock(Attribute.class, new ViolatedAssumptionAnswer());
      aSMifierAbstractVisitor0.visitAttribute(attribute0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASMifierAbstractVisitor aSMifierAbstractVisitor0 = new ASMifierAbstractVisitor("g,b-*40{F9k$<*WC");
      aSMifierAbstractVisitor0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierAbstractVisitor aSMifierAbstractVisitor0 = new ASMifierAbstractVisitor("");
      AnnotationVisitor annotationVisitor0 = aSMifierAbstractVisitor0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }
}

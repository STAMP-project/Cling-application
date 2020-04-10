/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 15:06:51 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = new Context();
      assertFalse(context0.isGeneratingDebugChanged());
      assertEquals(0, context0.getOptimizationLevel());
      assertEquals(Integer.MAX_VALUE, context0.getMaximumInterpreterStackDepth());
      assertFalse(context0.isSealed());
      assertFalse(context0.isGeneratingDebug());
      assertEquals(0, context0.getLanguageVersion());
      assertEquals(0, context0.getInstructionObserverThreshold());
      assertTrue(context0.isGeneratingSource());
      assertEquals(130, Context.VERSION_1_3);
      assertEquals(170, Context.VERSION_1_7);
      assertEquals(11, Context.FEATURE_STRICT_MODE);
      assertFalse(context0.generateObserverCount);
      assertEquals(0, Context.VERSION_DEFAULT);
      assertEquals(1, Context.FEATURE_NON_ECMA_GET_YEAR);
      assertEquals(120, Context.VERSION_1_2);
      assertEquals(4, Context.FEATURE_TO_STRING_AS_SOURCE);
      assertEquals(5, Context.FEATURE_PARENT_PROTO_PROPRTIES);
      assertEquals(2, Context.FEATURE_MEMBER_EXPR_AS_FUNCTION_NAME);
      assertEquals(160, Context.VERSION_1_6);
      assertEquals(6, Context.FEATURE_E4X);
      assertEquals(140, Context.VERSION_1_4);
      assertEquals(180, Context.VERSION_1_8);
      assertEquals(13, Context.FEATURE_ENHANCED_JAVA_ACCESS);
      assertEquals((-1), Context.VERSION_UNKNOWN);
      assertEquals(100, Context.VERSION_1_0);
      assertEquals(8, Context.FEATURE_STRICT_VARS);
      assertEquals(10, Context.FEATURE_LOCATION_INFORMATION_IN_ERROR);
      assertEquals(7, Context.FEATURE_DYNAMIC_SCOPE);
      assertEquals(9, Context.FEATURE_STRICT_EVAL);
      assertEquals(12, Context.FEATURE_WARNING_AS_ERROR);
      assertEquals(110, Context.VERSION_1_1);
      assertEquals(3, Context.FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER);
      assertEquals(150, Context.VERSION_1_5);
      assertEquals(5, Context.FEATURE_PARENT_PROTO_PROPERTIES);
      assertNotNull(context0);
      
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      assertFalse(nativeContinuation0.avoidObjectDetection());
      assertFalse(nativeContinuation0.isSealed());
      assertTrue(nativeContinuation0.isEmpty());
      assertFalse(nativeContinuation0.hasPrototypeMap());
      assertEquals("object", nativeContinuation0.getTypeOf());
      assertEquals("Continuation", nativeContinuation0.getClassName());
      assertTrue(nativeContinuation0.isExtensible());
      assertEquals(4, ScriptableObject.PERMANENT);
      assertEquals(2, ScriptableObject.DONTENUM);
      assertEquals(13, ScriptableObject.CONST);
      assertEquals(1, ScriptableObject.READONLY);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
      assertEquals(0, ScriptableObject.EMPTY);
      assertNotNull(nativeContinuation0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = Context.enter();
      assertFalse(context0.isSealed());
      assertEquals(Integer.MAX_VALUE, context0.getMaximumInterpreterStackDepth());
      assertFalse(context0.isGeneratingDebug());
      assertEquals(0, context0.getLanguageVersion());
      assertEquals(0, context0.getOptimizationLevel());
      assertTrue(context0.isGeneratingSource());
      assertEquals(0, context0.getInstructionObserverThreshold());
      assertFalse(context0.isGeneratingDebugChanged());
      assertEquals(130, Context.VERSION_1_3);
      assertFalse(context0.generateObserverCount);
      assertEquals(5, Context.FEATURE_PARENT_PROTO_PROPERTIES);
      assertEquals(170, Context.VERSION_1_7);
      assertEquals(5, Context.FEATURE_PARENT_PROTO_PROPRTIES);
      assertEquals(2, Context.FEATURE_MEMBER_EXPR_AS_FUNCTION_NAME);
      assertEquals(120, Context.VERSION_1_2);
      assertEquals(11, Context.FEATURE_STRICT_MODE);
      assertEquals(160, Context.VERSION_1_6);
      assertEquals(140, Context.VERSION_1_4);
      assertEquals(10, Context.FEATURE_LOCATION_INFORMATION_IN_ERROR);
      assertEquals(4, Context.FEATURE_TO_STRING_AS_SOURCE);
      assertEquals(180, Context.VERSION_1_8);
      assertEquals(6, Context.FEATURE_E4X);
      assertEquals(13, Context.FEATURE_ENHANCED_JAVA_ACCESS);
      assertEquals(100, Context.VERSION_1_0);
      assertEquals(8, Context.FEATURE_STRICT_VARS);
      assertEquals((-1), Context.VERSION_UNKNOWN);
      assertEquals(9, Context.FEATURE_STRICT_EVAL);
      assertEquals(7, Context.FEATURE_DYNAMIC_SCOPE);
      assertEquals(12, Context.FEATURE_WARNING_AS_ERROR);
      assertEquals(110, Context.VERSION_1_1);
      assertEquals(1, Context.FEATURE_NON_ECMA_GET_YEAR);
      assertEquals(3, Context.FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER);
      assertEquals(150, Context.VERSION_1_5);
      assertEquals(0, Context.VERSION_DEFAULT);
      assertNotNull(context0);
      
      Double double0 = new Double(170);
      assertEquals(170.0, (double)double0, 0.01);
      assertNotNull(double0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(2254, "HEa]bT})=-:2&H", (String) null, false);
      assertFalse(interpreterData0.isFunction());
      assertNull(interpreterData0.getFunctionName());
      assertEquals("HEa]bT})=-:2&H", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertNotNull(interpreterData0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(2254, "HEa]bT})=-:2&H", "HEa]bT})=-:2&H", false);
      assertFalse(interpreterData0.isGeneratedScript());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertNull(interpreterData0.getFunctionName());
      assertEquals(0, interpreterData0.getParamCount());
      assertEquals("HEa]bT})=-:2&H", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isFunction());
      assertNotNull(interpreterData0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      EvaluatorException evaluatorException0 = null;
      try {
        evaluatorException0 = new EvaluatorException("msg.re.unmatched.right.paren");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isTopLevel());
      assertNull(interpreterData0.getFunctionName());
      assertEquals(0, interpreterData0.getParamCount());
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)85;
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isTopLevel());
      assertNull(interpreterData0.getFunctionName());
      assertEquals(0, interpreterData0.getParamCount());
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", false);
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isFunction());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)5;
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isFunction());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", false);
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals("language version", interpreterData0.getSourceName());
      assertNull(interpreterData0.getFunctionName());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte) (-6);
      interpreterData0.itsICode = byteArray0;
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals("language version", interpreterData0.getSourceName());
      assertNull(interpreterData0.getFunctionName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isGeneratedScript());
      assertNull(interpreterData0.getFunctionName());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-10);
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isGeneratedScript());
      assertNull(interpreterData0.getFunctionName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", false);
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isFunction());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getParamCount());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-21);
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isFunction());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertFalse(interpreterData0.isFunction());
      assertNull(interpreterData0.getFunctionName());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertFalse(interpreterData0.isGeneratedScript());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-23);
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isFunction());
      assertNull(interpreterData0.getFunctionName());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertFalse(interpreterData0.isGeneratedScript());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertNull(interpreterData0.getFunctionName());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-27);
      interpreterData0.itsICode = byteArray0;
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertNull(interpreterData0.getFunctionName());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
      assertEquals(0, interpreterData0.getFunctionCount());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertEquals(0, interpreterData0.getParamCount());
      assertNull(interpreterData0.getFunctionName());
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-28);
      interpreterData0.itsICode = byteArray0;
      assertEquals(0, interpreterData0.getParamCount());
      assertNull(interpreterData0.getFunctionName());
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getFunctionCount());
      
      // Undeclared exception!
      try { 
        interpreterData0.getLineNumbers();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/javascript/rhino/head/Interpreter
         //
         verifyException("com.google.javascript.rhino.head.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertEquals("language version", interpreterData0.getSourceName());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getParamCount());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-38);
      interpreterData0.itsICode = byteArray0;
      assertEquals("language version", interpreterData0.getSourceName());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertFalse(interpreterData0.isFunction());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getParamCount());
      assertEquals(0, interpreterData0.getFunctionCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertFalse(interpreterData0.isGeneratedScript());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertNull(interpreterData0.getFunctionName());
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isFunction());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-40);
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isGeneratedScript());
      assertFalse(interpreterData0.isTopLevel());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertNull(interpreterData0.getFunctionName());
      assertEquals("language version", interpreterData0.getSourceName());
      assertFalse(interpreterData0.isFunction());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-45);
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals("language version", interpreterData0.getSourceName());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-62);
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals(0, interpreterData0.getParamCount());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals("language version", interpreterData0.getSourceName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(150, "language version", "error reporter", true);
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isFunction());
      assertNotNull(interpreterData0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-63);
      interpreterData0.itsICode = byteArray0;
      assertFalse(interpreterData0.isGeneratedScript());
      assertEquals(0, interpreterData0.getFunctionCount());
      assertEquals("language version", interpreterData0.getSourceName());
      assertEquals(0, interpreterData0.getParamCount());
      assertFalse(interpreterData0.isTopLevel());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isFunction());
      
      // Undeclared exception!
      try { 
        interpreterData0.getLineNumbers();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/javascript/rhino/head/Interpreter
         //
         verifyException("com.google.javascript.rhino.head.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(18, "J;TF!?rOu", "J;TF!?rOu", false);
      assertEquals(0, interpreterData0.getFunctionCount());
      assertFalse(interpreterData0.isTopLevel());
      assertFalse(interpreterData0.isFunction());
      assertEquals(0, interpreterData0.getParamCount());
      assertEquals("J;TF!?rOu", interpreterData0.getSourceName());
      assertNull(interpreterData0.getFunctionName());
      assertFalse(interpreterData0.isGeneratedScript());
      assertNotNull(interpreterData0);
  }
}

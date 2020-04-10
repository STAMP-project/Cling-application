/*

 * Tue Mar 03 18:44:36 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        nativeError0.defineProperty("", class0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(15);
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable(integer0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type number
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeError nativeError1 = (NativeError)ScriptableObject.ensureScriptable(nativeError0);
      assertTrue(nativeError1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Object object0 = nativeError0.getStack();
      boolean boolean0 = nativeError0.sameValue(object0, (Object) null);
      assertFalse(nativeError0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      BaseFunction baseFunction1 = new BaseFunction(baseFunction0, baseFunction0);
      boolean boolean0 = baseFunction0.isDataDescriptor(baseFunction1);
      assertTrue(baseFunction0.isExtensible());
      assertFalse(boolean0);
      assertTrue(baseFunction1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = ScriptableObject.getPropertyIds((Scriptable) null);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.defineConstProperty(nativeError0, (String) null);
      assertFalse(nativeError0.isEmpty());
      assertFalse(nativeError0.isSealed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.putConstProperty(nativeError0, "enumerable", nativeError0);
      ScriptableObject.putConstProperty(nativeError0, "enumerable", "enumerable");
      assertFalse(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeString nativeString0 = new NativeString("fZAA'/W'n ");
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeString0, 1607);
      assertFalse(boolean0);
      assertTrue(nativeString0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox) null, "wM59J`7'c&Nxcki");
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeJavaMethod0, "=.`K#A5ta");
      assertTrue(nativeJavaMethod0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "null,null,null,null,null";
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeError0.defineFunctionProperties(stringArray0, class0, 2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"null,null,null,null,null\" not found in \"java.lang.Object\".
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        ScriptableObject.isFalse(nativeError0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeError nativeError0 = new NativeError();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeArray0, nativeJavaClass0, nativeError0, objectArray0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.getTopScopeValue(nativeError0, nativeError0.UNINITIALIZED_CONST);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      NativeGenerator nativeGenerator0 = new NativeGenerator(nativeJavaClass0, nativeFunction0, nativeJavaClass0);
      assertTrue(nativeGenerator0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.lastIndexOf("com.google.javascript.rhino.head.v8dtoa.FastDtoaBuilder");
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeError0, 2, class0);
      assertTrue(nativeError0.isEmpty());
      assertTrue(nativeError0.isExtensible());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.redefineProperty(nativeError0, "(eval)", false);
      assertTrue(nativeError0.isExtensible());
      assertTrue(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2874L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-2207), (Object) nativeArray0);
      assertEquals((-2206L), nativeArray0.jsGet_length());
      assertFalse(nativeArray0.isSealed());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      boolean boolean0 = importerTopLevel0.isGenericDescriptor(importerTopLevel0);
      assertTrue(importerTopLevel0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray nativeArray0 = new NativeArray(2344L);
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      doReturn(0).when(nativeFunction0).getLanguageVersion();
      doReturn(0).when(nativeFunction0).getParamAndVarCount();
      doReturn(0).when(nativeFunction0).getParamCount();
      NativeCall nativeCall0 = new NativeCall(nativeFunction0, scriptable0, (Object[]) null);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(4, nativeCall0, true);
      // Undeclared exception!
      try { 
        nativeArray0.put(4613, (Scriptable) idFunctionObject0, (Object) "writable");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 4613.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Context) null, (Scriptable) nativeError0, "{9%1fw-k3I", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: {9%1fw-k3I is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty(scriptable0, "~a(n>h~E++Hm&fj8 %H", class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = nativeError0.sameValue(nativeError0.PERMANENT, nativeError0.PERMANENT);
      assertTrue(nativeError0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      boolean boolean0 = nativeError0.sameValue(context0, nativeJavaClass0);
      assertTrue(nativeError0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      NativeError nativeError0 = new NativeError();
      nativeError0.defineOwnProperties((Context) null, nativeFunction0);
      assertFalse(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Context context0 = new Context();
      context0.initStandardObjects((ScriptableObject) nativeError0);
      Object[] objectArray0 = ScriptableObject.getPropertyIds(nativeError0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ContextFactory contextFactory0 = mock(ContextFactory.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(contextFactory0).hasFeature(any(com.google.javascript.rhino.head.Context.class) , anyInt());
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      EvaluatorException evaluatorException0 = defaultErrorReporter0.runtimeError("", (String) null, 1911, "", 2);
      nativeError0.setStackProvider(evaluatorException0);
      assertFalse(evaluatorException0.usesMozillaStackStyle());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Class<String> class0 = String.class;
      nativeError0.defineProperty("null,null,null,null,null", class0, 8);
      assertTrue(nativeError0.isExtensible());
  }
}

/*

 * Tue Mar 03 18:46:09 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaArray;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.UniqueTag;
import com.google.javascript.rhino.head.WrapFactory;
import com.google.javascript.rhino.head.xml.XMLLib;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable((Object) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type object
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      BaseFunction baseFunction0 = new BaseFunction();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) baseFunction0);
      Object object0 = ScriptableObject.getProperty(scriptable0, (-704));
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(nativeContinuation0, 4);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeError nativeError0 = new NativeError();
      Object object0 = nativeError0.getStack();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(object0, object0);
      assertFalse(nativeError0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue((Object) null, uniqueTag0);
      assertFalse(boolean0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject.defineConstProperty(importerTopLevel0, "&i'D7*V|:':&");
      assertFalse(importerTopLevel0.isEmpty());
      assertFalse(importerTopLevel0.isSealed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.putConstProperty(nativeError0, "9\"eq", nativeError0);
      assertFalse(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = new Context();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.putProperty((Scriptable) nativeIterator_StopIteration0, 160, (Object) context0.FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeError0, 2);
      assertTrue(nativeError0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeContinuation0, "]^6oAXx#9wMe`_#Lk6");
      assertTrue(nativeContinuation0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      String[] stringArray0 = new String[9];
      stringArray0[0] = " ";
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        importerTopLevel0.defineFunctionProperties(stringArray0, class0, 4);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \" \" not found in \"java.lang.Integer\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(849L);
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeArray0, 256, class0);
      assertTrue(nativeArray0.isExtensible());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      ContextFactory contextFactory0 = mock(ContextFactory.class, new ViolatedAssumptionAnswer());
      doReturn((XMLLib.Factory) null).when(contextFactory0).getE4xImplementationFactory();
      doReturn(true).when(contextFactory0).hasFeature(any(com.google.javascript.rhino.head.Context.class) , anyInt());
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      NativeJavaArray nativeJavaArray0 = null;
      try {
        nativeJavaArray0 = new NativeJavaArray(baseFunction0, importerTopLevel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Array expected
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) null);
      Object object0 = ScriptableObject.getTopScopeValue(scriptable0, importerTopLevel0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      WrapFactory wrapFactory0 = new WrapFactory();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        wrapFactory0.wrapJavaClass(context0, nativeJavaClass0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.get((long) 1);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-330L));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeArray0, nativeArray0.UNINITIALIZED_CONST, 9);
      nativeArray0.defineOwnProperty(context0, nativeArray0.UNINITIALIZED_CONST, scriptableObject0);
      assertEquals(9L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject.redefineProperty(nativeContinuation0, "msg.undef.method.call", true);
      assertTrue(nativeContinuation0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeContinuation0, 4);
      assertTrue(nativeContinuation0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.sealObject();
      // Undeclared exception!
      try { 
        nativeContinuation0.delete("rV`\"-I7FE,33I:#}F");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: rV`\"-I7FE,33I:#}F.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(103, nativeError0, true);
      // Undeclared exception!
      try { 
        idFunctionObject0.setAttributes((-3775), (-3295));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: -3775.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) topLevel0, "error reporter", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(130);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, nativeArray0, 905, "error reporter", 150, nativeIterator_StopIteration0);
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) idFunctionObject0, "language version", class0);
      assertTrue(idFunctionObject0.isExtensible());
      assertTrue(idFunctionObject0.isEmpty());
      assertNull(object0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      BaseFunction baseFunction0 = new BaseFunction();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      BoundFunction boundFunction0 = new BoundFunction(context0, baseFunction0, nativeContinuation0, baseFunction0, (Object[]) null);
      boundFunction0.defineOwnProperties(context0, nativeContinuation0);
      assertTrue(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(nativeContinuation0.CONST, nativeContinuation0.CONST);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(importerTopLevel0, " ", 970);
      // Undeclared exception!
      try { 
        importerTopLevel0.defineOwnProperties(context0, scriptableObject0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(importerTopLevel0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeObject.init(scriptable0, true);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject.getPropertyIds(importerTopLevel0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) baseFunction0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      importerTopLevel0.defineOwnProperty(context0, scriptable0, baseFunction0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        topLevel0.defineProperty("hL{%-", class0, 1073741824);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1073741825
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}

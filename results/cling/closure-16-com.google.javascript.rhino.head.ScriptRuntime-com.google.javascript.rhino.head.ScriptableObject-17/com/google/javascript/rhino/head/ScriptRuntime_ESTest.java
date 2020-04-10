/*

 * Tue Mar 03 20:10:48 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Ref;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(true).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable0).toString();
      // Undeclared exception!
      try { 
        ScriptRuntime.toIterator(context0, scriptable0, scriptable0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Invalid iterator value
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable1 = ScriptRuntime.toIterator(context0, scriptable0, scriptable0, false);
      assertNull(scriptable1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectIndex((Object) null, 1.0, (Object) null, context0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot set property \"1.0\" of null to \"null\"
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScriptRuntime.toInteger((Object) "821.676816372");
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        ScriptRuntime.toCharSequence(importerTopLevel0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyInt() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.getObjectIndex(scriptable0, (-3268), context0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      CharSequence charSequence0 = ScriptRuntime.add((Object) boolean0, (CharSequence) "[object com.google.javascript.rhino.head.NativeJavaTopPackage]");
      assertEquals(67, charSequence0.length());
      
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.getIds(false);
      assertTrue(nativeContinuation0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeContinuation0.getIds(false);
      // Undeclared exception!
      try { 
        ScriptRuntime.typeofName(nativeIterator_StopIteration0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeWith nativeWith0 = new NativeWith(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      // Undeclared exception!
      try { 
        ScriptRuntime.add((Object) nativeWith0, (Object) "[object com.google.javascript.rhino.head.NativeJavaTopPackage]", (Context) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false, false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      Object object0 = ScriptRuntime.setObjectIndex((Object) scriptable0, 2692.15554, (Object) scriptable0, (Context) null);
      Object object1 = ScriptRuntime.setObjectElem(scriptable0, (Object) scriptable0, object0, (Context) null);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-6653111496142234890L));
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.getArrayElements(scriptable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      int[] intArray0 = new int[7];
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(context0).newObject(any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.newObjectLiteral(objectArray0, objectArray0, intArray0, context0, scriptable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, context0, 3);
      assertEquals(0.0, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScriptRuntime scriptRuntime0 = new ScriptRuntime();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptRuntime.toInteger((Object) scriptRuntime0.NaNobj);
      // Undeclared exception!
      try { 
        ScriptRuntime.toPrimitive((Object) nativeContinuation0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.getArrayElements(scriptable0);
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
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptRuntime.stringToNumber("8L@9e8", 1304, 4);
      // Undeclared exception!
      try { 
        ScriptRuntime.toPrimitive((Object) nativeContinuation0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      ScriptableObject.hasProperty((Scriptable) baseFunction0, 4);
      // Undeclared exception!
      try { 
        ScriptRuntime.toUint16(baseFunction0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScriptRuntime.toInteger((Object) "821.676816372");
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
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        ScriptRuntime.getGlobal(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}

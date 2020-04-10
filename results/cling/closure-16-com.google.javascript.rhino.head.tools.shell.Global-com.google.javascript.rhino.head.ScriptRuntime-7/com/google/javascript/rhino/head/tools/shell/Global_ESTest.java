/*

 * Tue Mar 03 20:46:46 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.commonjs.module.Require;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      Object[] objectArray0 = new Object[1];
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, objectArray0, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn((-1151)).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      Global.pipe(false, inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        Global.seal(context0, global0, objectArray0, (Function) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Global global0 = new Global(context0);
      Require require0 = global0.installRequire(context0, (List<String>) null, false);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) require0;
      Object object0 = Global.toint32(context0, nativeJavaObject0, objectArray0, require0);
      assertEquals(0, object0);
      assertFalse(require0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Delegator delegator0 = new Delegator();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.doctest((Context) null, delegator0, objectArray0, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.spawn(context0, baseFunction0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) global0;
      Global.seal(context0, global0, objectArray0, nativeContinuation0);
      assertTrue(global0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(global0).when(function0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[7];
      objectArray0[6] = (Object) function0;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      global0.installRequire(context0, linkedList0, false);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Global global0 = new Global();
      Object[] objectArray0 = new Object[3];
      Delegator delegator0 = new Delegator(global0);
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, global0, objectArray0, delegator0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) function0;
      // Undeclared exception!
      try { 
        Global.seal(context0, global0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(nativeJavaPackage0).when(function0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) function0;
      objectArray0[1] = (Object) function0;
      Thread thread0 = (Thread)Global.spawn(context0, global0, objectArray0, nativeJavaClass0);
      assertFalse(thread0.isDaemon());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) nativeJavaClass0;
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.enter();
      Thread thread0 = (Thread)Global.spawn(context0, nativeContinuation0, objectArray0, nativeJavaClass0);
      assertFalse(thread0.isDaemon());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, function0, "js>=", "js>=", 140);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // doctest failure running:
         // =
         // expected: actual: js: \"doctest input\", line 1: syntax error
         // js: =
         // js: ^
         // js: \"doctest input\", line 1: Compilation produced 1 syntax errors.
         // 
         // 
         //  (js>=#140)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Global.pipe(true, pipedInputStream0, (OutputStream) null);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.sync(context0, baseFunction0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      context0.initStandardObjects((ScriptableObject) nativeArray0);
      Object[] objectArray0 = context0.getElements(nativeArray0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(201).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      // Undeclared exception!
      try { 
        Global.pipe(false, inputStream0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object object0 = Global.toint32(context0, global0, context0.emptyArgs, nativeJavaClass0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      Object[] objectArray0 = new Object[1];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      try { 
        Global.readFile(context0, global0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      context0.initStandardObjects((ScriptableObject) global0, false);
      context0.getElements(global0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Global global0 = new Global();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator(nativeContinuation0);
      int int0 = global0.runDoctest(context0, delegator0, "i1*G)(Z(", "i1*G)(Z(", 5);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global(context0);
      Synchronizer synchronizer0 = new Synchronizer(global0);
      Object[] objectArray0 = new Object[5];
      objectArray0[4] = (Object) synchronizer0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, synchronizer0, objectArray0, synchronizer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      Object[] objectArray0 = new Object[8];
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        baseFunction0.construct(context0, global0, objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: missing formal parameter (<eval'ed string>#1(Function)#1)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      Object[] objectArray0 = new Object[1];
      BaseFunction baseFunction0 = new BaseFunction();
      try { 
        Global.readUrl(context0, global0, objectArray0, baseFunction0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(global0, dataInputStream0, context0, byteArrayInputStream0, dataInputStream0).when(function0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[7];
      objectArray0[6] = (Object) function0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Global global0 = new Global();
          Context context0 = Context.getCurrentContext();
          Object[] objectArray0 = new Object[1];
          Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
          doReturn(global0).when(function0).getParentScope();
          // Undeclared exception!
          try { 
            Global.runCommand(context0, global0, objectArray0, function0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor168.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}

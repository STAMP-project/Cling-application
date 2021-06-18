
# Time

## ST10

[Stack trace](stacktraces.md#st10-f1):

```
java.lang.IllegalArgumentException: Invalid min days in first week: 175
org.joda.time.chrono.JulianChronology.getInstance(JulianChronology.java:138)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:215)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:220)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:252)
```

Generated test ([test2](../../results/cling/time-org.joda.time.chrono.GJChronology-org.joda.time.chrono.JulianChronology-2/org/joda/time/chrono/GJChronology_ESTest.java#L52)):

```java
@Test(timeout = 4000)
public void test2()  throws Throwable  {
    DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
    doReturn("8i?{Nb)fS#1Zq,zj+v", "ZjC Ua").when(dateTimeZone0).getID();
    JulianChronology.getInstance(dateTimeZone0);
    DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis((-1839));
    // Undeclared exception!
    try { 
      GJChronology.getInstance(dateTimeZone1, 10800000L, 175);
      fail("Expecting exception: IllegalArgumentException");
    
    } catch(IllegalArgumentException e) {
        //
        // Invalid min days in first week: 175
        //
        verifyException("org.joda.time.chrono.JulianChronology", e);
    }
}
```

The generated test passes 175 as the value of minimum number of days per week. Naturally, the maximum number of days in a week is 7! but there is no check in the code of the caller and callee. And caller is called from outside. Also, it is not mentioned in the [documentation](projects/time/src/main/java/org/joda/time/chrono/GJChronology.java#L234) that the value must be lower than 7. The caller class gets the wrong value and passes it to callee without checking it. 

__! New update:__ This is not a fault because there is a test in the project that confirm this thrown exception is expected:

```java
   public void testFactory_Zone_RI_int() {
        GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L), 2);
        assertEquals(TOKYO, chrono.getZone());
        assertEquals(new Instant(0L), chrono.getGregorianCutover());
        assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L), 2).getClass());
        
        DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        chrono = GJChronology.getInstance(TOKYO, null, 2);
        assertEquals(TOKYO, chrono.getZone());
        assertEquals(cutover.toInstant(), chrono.getGregorianCutover());
        assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        
        try {
            GJChronology.getInstance(TOKYO, new Instant(0L), 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            GJChronology.getInstance(TOKYO, new Instant(0L), 8);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

```
## ST11

[Stack trace](stacktraces.md#st11-f2):

```
org.joda.time.IllegalFieldValueException: Value 14 for dayOfMonth is not supported
org.joda.time.chrono.GJChronology$CutoverField.set(GJChronology.java:719)
org.joda.time.chrono.ZonedChronology$ZonedDateTimeField.set(ZonedChronology.java:466)
org.joda.time.chrono.BaseChronology.set(BaseChronology.java:240)
```

Generated test ([test6](../../results/cling/time-org.joda.time.chrono.GJChronology-org.joda.time.chrono.GJChronology$CutoverField-14/org/joda/time/chrono/GJChronology_ESTest.java#L95)):

```java
@Test(timeout = 4000)
public void testSet_ifve()  throws Throwable  {
    DateTime dateTime0 = new DateTime();
    GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
    LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();


    gJChronology0.set(localDateTime0, (-748L));

}
```

Caller method [calls a method `set` in `ZonedChronology$ZonedDateTime`](projects/time/src/main/java/org/joda/time/chrono/BaseChronology.java#L240). This method changes one of the inputs and passes them to the set method in callee. Callee throws and exception because the returned value from one of the passed objects is not equal to the other passed value. There is no pre-checking before calling the callee.

__! New update:__ This is not a fault because the this exception indicates that this is not a realistic scenario. And the generated test is not possible to happen in real life.

# Mockito

## ST16

[Stack trace](stacktraces.md#st16-f3):

```
org.mockito.cglib.core.CodeGenerationException: java.beans.IntrospectionException-->java.lang.Object not superclass of java.lang.Object
org.mockito.cglib.core.ReflectUtils.getPropertiesHelper(ReflectUtils.java:324)
org.mockito.cglib.core.ReflectUtils.getBeanProperties(ReflectUtils.java:296)
org.mockito.cglib.proxy.MixinBeanEmitter.getMethods(MixinBeanEmitter.java:37)
org.mockito.cglib.proxy.MixinEmitter.<init>(MixinEmitter.java:63)
org.mockito.cglib.proxy.MixinBeanEmitter.<init>(MixinBeanEmitter.java:29)
org.mockito.cglib.proxy.Mixin$Generator.generateClass(Mixin.java:174)
org.mockito.cglib.core.DefaultGeneratorStrategy.generate(DefaultGeneratorStrategy.java:25)
org.mockito.cglib.core.AbstractClassGenerator.create(AbstractClassGenerator.java:217)
org.mockito.cglib.proxy.Mixin$Generator.create(Mixin.java:165)
```

Generated test ([test2](../../results/cling/mockito-org.mockito.cglib.proxy.Mixin$Generator-org.mockito.cglib.core.ReflectUtils-20/org/mockito/cglib/proxy/Mixin$Generator_ESTest.java#L79)):

```java
@Test(timeout = 4000)
public void test2()  throws Throwable  {
    Mixin.Generator mixin_Generator0 = new Mixin.Generator();
    ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
    Object[] objectArray0 = new Object[5];
    objectArray0[0] = (Object) mixin_Generator0;
    objectArray0[1] = (Object) mixin_Generator0;
    Object object0 = new Object();
    objectArray0[2] = object0;
    objectArray0[3] = (Object) classLoader0;
    objectArray0[4] = (Object) mixin_Generator0;
    mixin_Generator0.setDelegates(objectArray0);
    mixin_Generator0.setStyle(1);
    // Undeclared exception!
    try { 
      mixin_Generator0.create();
      fail("Expecting exception: CodeGenerationException");
    
    } catch(CodeGenerationException e) {
        //
        // java.beans.IntrospectionException-->java.lang.Object not superclass of java.lang.Object
        //
        verifyException("org.mockito.cglib.core.ReflectUtils", e);
    }
}
```

The fault is the passed objects to method `setDelegates` in caller class. If the values are not in the same hierarchy tree, and we [call `create()` method in caller class](projects/mockito/cglib-and-asm/src/org/mockito/cglib/proxy/Mixin.java#L132) afterward, the caller class passes these objects to the callee class indirectly. the callee class expect that these passed objects are in the same hierarchy tree. Hence, it throws exception if they do not fulfill this precondition.

__! New update:__ This fault is in the integration between Mockit and cglib, which [has been discontinued in favor of ByeBuddy](ByteBuddy). This integration is just moved to a seperate [repository](https://github.com/mockito/mockito-cglib). According to the [README](https://github.com/mockito/mockito-cglib/blob/master/README.md) file in this reporsitory, developers do not want to ship Mockito with cglib any more. Hence, they did not put any effort to update and improve this integration, and it is not useful to report this fault to developers.

## ST17

[Stack trace](stacktraces.md#st17-f4):

```
java.lang.NullPointerException
org.mockito.asm.tree.analysis.SimpleVerifier.isSubTypeOf(SimpleVerifier.java:166)
org.mockito.asm.tree.analysis.BasicVerifier.unaryOperation(BasicVerifier.java:179)
```

Generated test ([test12](../../results/cling/mockito-org.mockito.asm.tree.analysis.BasicVerifier-org.mockito.asm.tree.analysis.SimpleVerifier-3/org/mockito/asm/tree/analysis/SimpleVerifier_ESTest.java#L154)):

```java
@Test(timeout = 4000)
public void test12()  throws Throwable  {
    SimpleVerifier simpleVerifier0 = new SimpleVerifier();
    IntInsnNode intInsnNode0 = new IntInsnNode(119, (-4156));
    // Undeclared exception!
    try { 
      simpleVerifier0.unaryOperation(intInsnNode0, (Value) null);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
    }
}
```

`SimpleVerifier` is a subclass of `BasicVerifier`. Cling calls the `unaryOperation` method with a null `Value`. The [documentation of the caller class](projects/mockito/cglib-and-asm/src/org/mockito/asm/tree/analysis/BasicVerifier.java#L96) does not have limitation for input. The caller class passes the null value to the callee class without checking. The callee class uses null value without checking it. There is no input limitation in the callee method, as well.

__! New update:__ Same as previous stacktrace, these classes are archived to the [same repository](https://github.com/mockito/mockito-cglib). The developers did not put any effort to update and improve this integration, and it is not useful to report this fault to developers.

## ST18

[Stack trace](stacktraces.md#st18-f5):

```
java.lang.NullPointerException
org.mockito.asm.Item.set(Item.java:203)
org.mockito.asm.ClassWriter.addType(ClassWriter.java:1172)
org.mockito.asm.Frame.initInputFrame(Frame.java:797)
org.mockito.asm.MethodWriter.visitMaxs(MethodWriter.java:1238)
```

Generated test ([test18](../../results/cling/mockito-org.mockito.asm.MethodWriter-org.mockito.asm.ClassWriter-1/org/mockito/asm/MethodWriter_ESTest.java#L243)):

```java
@Test(timeout = 4000)
public void test18()  throws Throwable  {
    ClassWriter classWriter0 = new ClassWriter(30);
    String[] stringArray0 = new String[2];
    stringArray0[0] = "<init>";
    stringArray0[1] = "=Yi?_@2lHb";
    MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
    methodWriter0.visitVarInsn(2, 1105);
    // Undeclared exception!
    try { 
      methodWriter0.visitMaxs((-3), 1516);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
    }
}
```

The [`ClassWriter` (callee)](projects/mockito/cglib-and-asm/src/org/mockito/asm/ClassWriter.java) and the [`MethodWriter` (caller)](projects/mockito/cglib-and-asm/src/org/mockito/asm/MethodWriter.java) classes are both implementing a visitor pattern and make implicit assumptions about the underlying data structure. Those assumptions are not documents. 

More specifically, the [`ClassWriter` (callee)](projects/mockito/cglib-and-asm/src/org/mockito/asm/ClassWriter.java) instance is an input parameter for the constructor of the [`MethodWriter` (caller)](projects/mockito/cglib-and-asm/src/org/mockito/asm/MethodWriter.java) class. The caller needs two method calls before passing it to the callee class. The second method call is `public void visit(
        final int version,
        final int access,
        final String name,
        final String signature,
        final String superName,final String[] interfaces)`.
If we do not call visit or call it with null input parameter `name` and pass it to the caller class. Then, if we call `visitMaxs` in the caller class. It throws null pointer exception because caller does not check the value of name in the callee class. Also, when we set the name in the callee class there is no check. Moreover, there is no annotation about these facts in the documentation of involved classes.

__! New update:__ Same as previous stacktrace, these classes are archived to the [same repository](https://github.com/mockito/mockito-cglib). The developers did not put any effort to update and improve this integration, and it is not useful to report this fault to developers.
# Math

## ST22

[Stack trace](stacktraces.md#st22-f6):

```
java.lang.ArrayIndexOutOfBoundsException: 2
org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.computeInterpolatedState(GraggBulirschStoerStepInterpolator.java:326)
org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(AbstractStepInterpolator.java:260)
org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.readExternal(GraggBulirschStoerStepInterpolator.java:388)
```

Generated test ([test5](../../results/cling/math-org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator-org.apache.commons.math.ode.AbstractStepInterpolator-17/org/apache/commons/math/ode/GraggBulirschStoerStepInterpolator_ESTest.java#L102)):

```java
@Test(timeout = 4000)
public void test5()  throws Throwable  {
    GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
    ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
    doReturn(true).when(objectInput0).readBoolean();
    doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
    doReturn(1, 1).when(objectInput0).readInt();
    // Undeclared exception!
    try { 
      graggBulirschStoerStepInterpolator0.readExternal(objectInput0);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    
    } catch(ArrayIndexOutOfBoundsException e) {
        //
        // 2
        //
        verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
    }
}
```

The [documentation of the `readExternal` method](projects/math/src/java/org/apache/commons/math/ode/GraggBulirschStoerStepInterpolator.java#L364) specifies that the method reads `the state of the instance`. When looking at the [documentation of the `Externalizable` interface](https://docs.oracle.com/javase/8/docs/api/) defining the `readExternal` and `writeExternal` methods, the documentation specifies that the `readExternal method must read the values in the same sequence and with the same types as were written by writeExternal` and that the `Overriding methods should use this tag [@serialData] to describe the data layout of this Externalizable object`. Without any description of the format, CLING is unable to determine the right sequence of values to mock in the `objectInput0` object. However, none of the classes in the hierarchy of the `GraggBulirschStoerStepInterpolator` class describe the file format, as prescribed by the documentation of the `Externalizable` interface. Therefore, we count this as positive case, as Cling emphasizes the lack of documentation required to decide if the exception should be thrown or not. 

 __!__ Approved by developers. The fixing commit: https://svn.apache.org/viewvc?view=revision&revision=670469.
 This commit is found by searching in the git history of the project. In this commit, the documentations are updated, and developers are using `@inheritDoc`.


## ST23

[Stack trace](stacktraces.md#st23-f7):

```
java.lang.NullPointerException
org.apache.commons.math.ode.SwitchState.reinitializeBegin(SwitchState.java:124)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:98)
org.apache.commons.math.ode.GraggBulirschStoerIntegrator.integrate(GraggBulirschStoerIntegrator.java:848)
```

Generated test ([test03](../../results/cling/math-org.apache.commons.math.ode.GraggBulirschStoerIntegrator-org.apache.commons.math.ode.SwitchingFunctionsHandler-4/org/apache/commons/math/ode/GraggBulirschStoerIntegrator_ESTest.java#L64)):

```java
@Test(timeout = 4000)
public void test03()  throws Throwable  {
    GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.4353557902216363), (-1230.967072879003), (-0.4353557902216363), (-0.4353557902216363));
    graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, (-1230.967072879003), (-519.56), 12);
    SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
    doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
    FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
    double[] doubleArray0 = new double[0];
    // Undeclared exception!
    try { 
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 4927, doubleArray0, (-651.4), doubleArray0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("org.apache.commons.math.ode.SwitchState", e);
    }
}
```

The generated test calls the `addSwitchingFunction()` method from Caller class. This method is not called by any other class in the project. So, this method should be called from outside. One of the input parameters of this method is an object from `SwitchingFunction` class. The documentation does not indicate that this parameter cannot be null. The generated test passes null as an input parameter to the `addSwitchingFunction` method, and it does not trigger any exception. The called method uses this object to initialize an object from the callee class without any check (for instance, null checking).

Next, the test calls another method that uses that initialized object of Callee (`GraggBulirschStoerIntegrator.integrate()`). Comments and documentation of this method do not indicate that this method may throw a `NullPointerException`. However, by calling this method, we trigger a NullPointerException because of the null value we used to initialize Callee.

In summary, there are no checks or documentation about the internal consistency of the different objects, which allowed Cling to trigger a `NullPointerException`.


__!__ The `addSwitchingFunction` is renmed to `addStepHandler()`. Also, documentations were updated accordingly. One of the changes in the documentation of this method is the following sentence: "The handler will be called by the integrator for each accepted step."

This sentence indicates that the input parameter will be called afterward and it cannot be null.

The first commit that this document is updated is: https://svn.apache.org/viewvc?view=revision&revision=476930
By looking at the current documentation of apache commons math, you can see this sentence:  https://commons.apache.org/proper/commons-math/javadocs/api-3.4/org/apache/commons/math3/ode/ODEIntegrator.html#addStepHandler(org.apache.commons.math3.ode.sampling.StepHandler)

## ST24

[Stack trace](stacktraces.md#st24-f8):

```
java.lang.NullPointerException
org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:184)
org.apache.commons.math.ode.GraggBulirschStoerIntegrator.integrate(GraggBulirschStoerIntegrator.java:527)
```

Generated test ([test01](../../results/cling/math-org.apache.commons.math.ode.GraggBulirschStoerIntegrator-org.apache.commons.math.ode.AdaptiveStepsizeIntegrator-2/org/apache/commons/math/ode/GraggBulirschStoerIntegrator_ESTest.java#L49)):

```java
@Test(timeout = 4000)
public void test01()  throws Throwable  {
    double[] doubleArray0 = new double[0];
    GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
    graggBulirschStoerIntegrator0.setStabilityCheck(true, 18, 18, 1.0E-4);
    SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
    doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
    FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
    // Undeclared exception!
    try { 
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1671.6, doubleArray0, 0.0, (double[]) null);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
    }
}
```

In this case, Caller is the sub-class and Callee is the super-class. The called method in Caller is `integrate()` which is not called by any other class in the project. If we pass Null as one of the inputs of this method (last input which is ` double[] y`) it uses this method in one of the inherited methods from super-class (`sanityChecks()`). There is no null checking in any of these methods. Also, there is not specific information about the forbidden values for the inputs in the comments and documentations.

__!__ No change on the code and documentation.
# Closure

## ST28

[Stack trace](stacktraces.md#st28-f9):

```
java.lang.NullPointerException
com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:159)
com.google.javascript.rhino.jstype.JSType.testForEqualityHelper(JSType.java:666)
com.google.javascript.rhino.jstype.JSType.testForEquality(JSType.java:655)
com.google.javascript.rhino.jstype.NumberType.testForEquality(NumberType.java:63)
com.google.javascript.rhino.jstype.JSType.getTypesUnderInequality(JSType.java:962)
com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:486)
com.google.javascript.rhino.jstype.JSType.getTypesUnderInequality(JSType.java:957)
com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:486)
```

Generated test ([test04](../../results/cling/closure-com.google.javascript.rhino.jstype.JSType-com.google.javascript.rhino.jstype.UnionType-3/com/google/javascript/rhino/jstype/UnionType_ESTest.java#L62)):

```java
@Test(timeout = 4000)
public void test04()  throws Throwable  {
    NumberType numberType0 = new NumberType((JSTypeRegistry) null);
    ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0, (JSType) numberType0);
    UnionType unionType0 = new UnionType((JSTypeRegistry) null, immutableList0);
    // Undeclared exception!
    try { 
      unionType0.getTypesUnderInequality(unionType0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.jstype.JSType", e);
    }
}
```

In this case, `UnionType` (caller class) is the sub-class and `JSType` (callee class) is the superclass. The generated test instantiate a `UnionType` object with the following constructor ` UnionType(JSTypeRegistry registry, Collection<JSType> alternates)`. Also, it passes `NULL` for the first parameter. According to the documentation of this class, there is no limitation for the input. This constructor sets the value of a local variable (`registry`) to the passed value (here, it is `NULL`). Then, the generated test calls method `getTypesUnderInequality` of the instantiated object. This method invokes method `isEmptyType` in the superclass, indirectly. `isEmptyType` method tries to use the attribute `registry`. Since this attribute is set to `NULL` during the invocation of the constructor of `UnionType`, it throws a `NullPointerException`. No indication in the documentation specifies that the `registry` parameter of a [`JSType` constructor](projects/closure/src/com/google/javascript/rhino/jstype/JSType.java#L105) should not be null. No checks are done on the value of the parameter. 

__! New Update:__ This bug is fixed by developers using [this commit](https://github.com/google/closure-compiler/commit/cfc0fab3dc2be49692a4fe9162b8095c934f6c41). The `UnionType` should be initialized only by [`UnionTypeBuilder`](projects/closure/src/com/google/javascript/rhino/jstype/UnionTypeBuilder.java). However, in the version that we ran Cling on, the constructor is protected and it can be called by other classes too. Also, there is no comment that this class should be initialized only by  `UnionTypeBuilder`. However, the fixing [commit](https://github.com/google/closure-compiler/commit/cfc0fab3dc2be49692a4fe9162b8095c934f6c41) (i) converts `UnionTypeBuilder` into `UnionType.Builder`, a nested class of `UnionType` (ii) make `UnionType`'s constructor private, and (iii) add the required information to this [constructor's documentation](https://github.com/google/closure-compiler/blob/82b6ca08fd09f927ba5fa2e43347239373e87646/src/com/google/javascript/rhino/jstype/UnionType.java#L107), which indicates that this class cannot be called by any other class except its builder. It worths to mention that this builder makes sure that the passed `registry` is not Null.


## ST29

[Stack trace](stacktraces.md#st29-f10):

```
java.lang.NullPointerException
com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeUnionType(ProxyObjectType.java:203)
com.google.javascript.rhino.jstype.ParameterizedType.toMaybeUnionType(ParameterizedType.java:50)
com.google.javascript.rhino.jstype.JSType.isUnionType(JSType.java:248)
com.google.javascript.rhino.jstype.UnionType.isEquivalentTo(UnionType.java:318)
com.google.javascript.rhino.jstype.JSType.equals(JSType.java:478)
```

Generated test ([test22](../../results/cling/closure-com.google.javascript.rhino.jstype.JSType-com.google.javascript.rhino.jstype.UnionType-1/com/google/javascript/rhino/jstype/UnionType_ESTest.java#L313)):

```java
@Test(timeout = 4000)
public void test22()  throws Throwable  {
    JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
    PriorityQueue<JSType> priorityQueue0 = new PriorityQueue<JSType>();
    UnionType unionType0 = new UnionType(jSTypeRegistry0, priorityQueue0);
    SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
    JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter0);
    ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry1, (ObjectType) null, (JSType) null);
    // Undeclared exception!
    try { 
      unionType0.equals(parameterizedType0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.jstype.ProxyObjectType", e);
    }
}
```

In this case, `UnionType` (callee class) is the sub-class and `JSType` (caller class) is the superclass. In this test, calls equal on a `UnionType` object. The [`equals` method](projects/closure/src/com/google/javascript/rhino/jstype/JSType.java#L477) is defined in the class `JSType`. The input parameter of equals is a `ParameterizedType` object. The [constructor of `ParameterizedType`](projects/closure/src/com/google/javascript/rhino/jstype/ParameterizedType.java#L55) accepts multiple input parameters. The second one is `JSType referencedType`. The generated test passes `NULL` for this value. The constructor of  `ParameterizedType` set a local attribute with the same name by this input parameter. When the generated test passes this object to check if it is equal to the `UnionType` by calling method equals, it does not check if the local attribute of `ParameterizedType` is null or not, and it passes it to method `isUnionType` of the other target class (`JSType`). This method calls the [method `toMaybeUnionType`](projects/closure/src/com/google/javascript/rhino/jstype/ProxyObjectType.java#L202), which uses `referencedType` without checking if it is null or not. Hence, it throws `NullPointerException`.

__! New Update:__ This bug is fixed by developers with [this commit](https://github.com/google/closure-compiler/commit/842545ae3518d18a765b846a6c436ebbffbf4b72). The equality check (method equals) heavily relies on polymorphism; in our case, there is no consistent check within the inherithance tree that all attributes of ParameterizedType are not null. The fix includes a very large refactoring (including introducing helper functions for equality and equivalence checks). These changes remvore the error triggerer by Cling. As further confirmation, the error triggered by Cling can be thornw until [commit](https://github.com/google/closure-compiler/commit/842545ae3518d18a765b846a6c436ebbffbf4b72) which is the direct parent of the commit that fixed the bug.


## ST31

[Stack trace](stacktraces.md#st31-f11):

```
java.lang.NullPointerException
com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition.setItem(JSDocInfo.java:136)
com.google.javascript.rhino.JSDocInfoBuilder.markName(JSDocInfoBuilder.java:217)
```

Generated test ([test255](../../results/cling/closure-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-5/com/google/javascript/rhino/JSDocInfoBuilder_ESTest.java#L3197)):

```java
@Test(timeout = 4000)
public void test255()  throws Throwable  {
    JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
    jSDocInfoBuilder0.markAnnotation("m%B", 4, 1130);
    jSDocInfoBuilder0.recordBlockDescription("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
    SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile("Gwh)Sn!\"/32", true);
    // Undeclared exception!
    try { 
      jSDocInfoBuilder0.markName((String) null, (StaticSourceFile) simpleSourceFile0, 1130, 1048576);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition", e);
    }
}
```

The generated test instantiates caller class and calls the [method `markName(String name, StaticSourceFile file,int lineno, int charno)`](projects/closure/src/com/google/javascript/rhino/JSDocInfoBuilder.java#L205) with a null value as `name`. The `markName` method instantiates a new object from the callee class `TrimmedStringPosition` and passes the input parameter `name` to [one of its method (`setItem`)](projects/closure/src/com/google/javascript/rhino/JSDocInfo.java#L135). There is no limitation in the code or indication in the documentation, preventing passing a null value as `name`. The documentation of the [`setItem` method](projects/closure/src/com/google/javascript/rhino/JSDocInfo.java#L135) only mentions (and checks in the body of the method) that the string has no leading nor trailing space.

__! New update:__ The bug is still in the latest version of the library. The documentation has not been updated nor the code has been changed.

## ST32

[Stack trace](stacktraces.md#st32-f12):

```
java.lang.NullPointerException
com.google.javascript.rhino.JSTypeExpression.equals(JSTypeExpression.java:107)
java.util.ArrayList.indexOf(ArrayList.java:321)
java.util.ArrayList.contains(ArrayList.java:304)
com.google.javascript.rhino.JSDocInfo.addImplementedInterface(JSDocInfo.java:1233)
com.google.javascript.rhino.JSDocInfoBuilder.recordImplementedInterface(JSDocInfoBuilder.java:925)
```

Generated test ([test170](../../results/cling/closure-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-1/com/google/javascript/rhino/JSDocInfoBuilder_ESTest.java#L2110)):

```java
@Test(timeout = 4000)
public void test170()  throws Throwable  {
    JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(false);
    JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "^");
    jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
    jSDocInfoBuilder0.recordNoAlias();
    // Undeclared exception!
    try { 
      jSDocInfoBuilder0.recordImplementedInterface(jSTypeExpression0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.JSTypeExpression", e);
    }
}
```

The generated test initializes an object from [`JSTypeExpression` class](projects/closure/src/com/google/javascript/rhino/JSTypeExpression.java#L64) with a null `root` value. This object is passed to a method in the caller class. The called method invokes a method in the callee class and passes the `JSTypeExpression` object to it. The method in the callee class checks this object with a [customized `equal` method](projects/closure/src/com/google/javascript/rhino/JSTypeExpression.java#L106). The equal method tries to make use of the `root` attribute without checking if it is null or not. The documentation provides no indication about the validity to have a null `root` attribute, and no checks are done in the code.

## ST33

[Stack trace](stacktraces.md#st33-f13):

```
java.lang.NullPointerException
com.google.common.collect.ImmutableList.copyFromCollection(ImmutableList.java:291)
com.google.common.collect.ImmutableList.copyOf(ImmutableList.java:260)
com.google.javascript.rhino.JSDocInfo.declareTemplateTypeNames(JSDocInfo.java:915)
com.google.javascript.rhino.JSDocInfoBuilder.recordTemplateTypeNames(JSDocInfoBuilder.java:299)
```

Generated test ([test159](../../results/cling/closure-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-1/com/google/javascript/rhino/JSDocInfoBuilder_ESTest.java#L1972)):

```java
@Test(timeout = 4000)
public void test159()  throws Throwable  {
    JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
    JSTypeExpression jSTypeExpression0 = mock(JSTypeExpression.class, new ViolatedAssumptionAnswer());
    jSDocInfoBuilder0.recordDefineType(jSTypeExpression0);
    JSTypeExpression jSTypeExpression1 = new JSTypeExpression((Node) null, "In(");
    jSDocInfoBuilder0.recordParameter("U\"SL](s(eHCZM_pZj", jSTypeExpression1);
    // Undeclared exception!
    try { 
      jSDocInfoBuilder0.recordTemplateTypeNames((List<String>) null);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.common.collect.ImmutableList", e);
    }
}
```

The generated test passes null to the [`recordTemplateTypeNames` method](projects/closure/src/com/google/javascript/rhino/JSDocInfoBuilder.java#L298). This null value is used as parameter to call the [`declareTemplateTypeNames` method](projects/closure/src/com/google/javascript/rhino/JSDocInfo.java#L908) and triggers a `NullPointerException` in nested calls. No checks are done to prevent null values, and the documentation does not indicate if null values are permitted. 

## ST34

[Stack trace](stacktraces.md#st34-f14):

```
java.lang.NullPointerException
com.google.javascript.rhino.JSTypeExpression.hashCode(JSTypeExpression.java:113)
java.util.HashMap.hash(HashMap.java:339)
java.util.HashMap.containsKey(HashMap.java:596)
com.google.javascript.rhino.JSDocInfo.documentThrows(JSDocInfo.java:792)
com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(JSDocInfoBuilder.java:327)
```

Generated test ([test071](../../results/cling/closure-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-1/com/google/javascript/rhino/JSDocInfoBuilder_ESTest.java#L898)):

```java
@Test(timeout = 4000)
public void test071()  throws Throwable  {
    JSDocInfoBuilder jSDocInfoBuilder0 = new JSDocInfoBuilder(true);
    JSTypeExpression jSTypeExpression0 = new JSTypeExpression((Node) null, "In(");
    jSDocInfoBuilder0.recordEnumParameterType(jSTypeExpression0);
    jSDocInfoBuilder0.recordParameter("In(", jSTypeExpression0);
    // Undeclared exception!
    try { 
      jSDocInfoBuilder0.recordThrowDescription(jSTypeExpression0, ") must not be negative");
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.JSTypeExpression", e);
    }
}
```

The generated test initializes an object from [`JSTypeExpression` class](projects/closure/src/com/google/javascript/rhino/JSTypeExpression.java#L64) with a null `root` value.  The object of `JSTypeExpression` is passed to the caller by a method called `recordParameter` which passes this value to the callee class. Then, the test calls [method `recordThrowDescription`](projects/closure/src/com/google/javascript/rhino/JSDocInfoBuilder.java#L325), which calls [method `documentThrows`](projects/closure/src/com/google/javascript/rhino/JSDocInfo.java#L782) in callee. This method throws  `NullPointerException` because the `root` in the passed `JSTypeExpression` is null. The documentation provides no indication about the validity to have a null `root` attribute, and no checks are done in the code.


## ST35

[Stack trace](stacktraces.md#st35-f15):

```
com.google.javascript.rhino.head.EcmaError: TypeError: Cannot find default value for object.
com.google.javascript.rhino.head.ScriptRuntime.constructError(ScriptRuntime.java:3728)
com.google.javascript.rhino.head.ScriptRuntime.constructError(ScriptRuntime.java:3706)
com.google.javascript.rhino.head.ScriptRuntime.typeError(ScriptRuntime.java:3734)
com.google.javascript.rhino.head.ScriptRuntime.typeError1(ScriptRuntime.java:3746)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:1014)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:933)
com.google.javascript.rhino.head.ScriptRuntime.toNumber(ScriptRuntime.java:410)
com.google.javascript.rhino.head.FunctionObject.convertArg(FunctionObject.java:236)
```

Generated test ([test01](../../results/cling/closure-com.google.javascript.rhino.head.ScriptableObject-com.google.javascript.rhino.head.FunctionObject-18/com/google/javascript/rhino/head/FunctionObject_ESTest.java#L53)):

```java
@Test(timeout = 4000)
public void test01()  throws Throwable  {
    Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
    TopLevel topLevel0 = new TopLevel();
    // Undeclared exception!
    try { 
      FunctionObject.convertArg(context0, (Scriptable) topLevel0, (Object) topLevel0, 4);
      fail("Expecting exception: EcmaError");
    
    } catch(EcmaError e) {
        //
        // TypeError: Cannot find default value for object.
        //
        verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
    }
}
```

The test calls the [static method `FunctionObject.convertArg`](projects/closure/lib/rhino/src/org/mozilla/javascript/FunctionObject.java#L216) with random parameter values. The static methods tries to convert the third parameter (`topLevel0`) to a `Double` value (indicated by the value `4` as last parameter of the call) but fails to do so. The `convertArg` method does not make any check before [performing the conversion](projects/closure/lib/rhino/src/org/mozilla/javascript/FunctionObject.java#L233) and no documentation is provided for that method. The documentation of the callee (`ScriptRuntime.toNumber`) does not indicate that an exception is thrown in case of error during the conversion.

## ST36

[Stack trace](stacktraces.md#st36-f16):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope(ScriptableObject.java:2131)
com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype(ScriptableObject.java:2075)
com.google.javascript.rhino.head.IdFunctionObject.getPrototype(IdFunctionObject.java:119)
com.google.javascript.rhino.head.ScriptableObject.getProperty(ScriptableObject.java:2216)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:987)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:933)
com.google.javascript.rhino.head.ScriptRuntime.toString(ScriptRuntime.java:803)
com.google.javascript.rhino.head.ScriptRuntime.toStringIdOrIndex(ScriptRuntime.java:1448)
com.google.javascript.rhino.head.ScriptableObject.getSlot(ScriptableObject.java:3100)
com.google.javascript.rhino.head.ScriptableObject.getOwnPropertyDescriptor(ScriptableObject.java:3093)
com.google.javascript.rhino.head.IdScriptableObject.getOwnPropertyDescriptor(IdScriptableObject.java:778)
com.google.javascript.rhino.head.NativeArray.getOwnPropertyDescriptor(NativeArray.java:584)
```

Generated test ([test15](../../results/cling/closure-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-12/com/google/javascript/rhino/head/NativeArray_ESTest.java#L249)):

```java
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2060L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      context0.initStandardObjects();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, "Gup", (-15), 2);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor((Context) null, idFunctionObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
```

Here, the caller is a [class called `NativeArray`](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeArray.java).  The generated test passes a `IdFunctionObject` object to the caller class. Then, the caller class passes this object through intermediate calls to the callee class `ScriptRuntime`. This class is later used in the callee class. However, if we do not call  method `initFunction` in `IdFunctionObject`, the usage of `IdFunctionObject` by callee class would lead to NullPointerException. The existence of `parentScope` in the passed `IdFunctionObject` to the caller and callee is not checked by these two classes. Eventually, the callee class invoked a method, which needs the `parentScope`, and since it is not available, it throws the NullPointerException. Also, the [documentation of `IdFunctionObject`](projects/closure/lib/rhino/src/org/mozilla/javascript/IdFunctionObject.java#L77) does not mention that you need to call the init function.


## ST37

[Stack trace](stacktraces.md#st37-f17):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.NativeJavaClass.toString(NativeJavaClass.java:305)
com.google.javascript.rhino.head.NativeJavaClass.getDefaultValue(NativeJavaClass.java:155)
com.google.javascript.rhino.head.ScriptRuntime.toString(ScriptRuntime.java:803)
com.google.javascript.rhino.head.ScriptRuntime.toStringIdOrIndex(ScriptRuntime.java:1448)
com.google.javascript.rhino.head.ScriptableObject.getSlot(ScriptableObject.java:3100)
com.google.javascript.rhino.head.ScriptableObject.getOwnPropertyDescriptor(ScriptableObject.java:3093)
com.google.javascript.rhino.head.IdScriptableObject.getOwnPropertyDescriptor(IdScriptableObject.java:778)
com.google.javascript.rhino.head.NativeArray.getOwnPropertyDescriptor(NativeArray.java:584)
```

Generated test ([test12](../../results/cling/closure-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-11/com/google/javascript/rhino/head/NativeArray_ESTest.java)):

```java
@Test(timeout = 4000)
public void test12()  throws Throwable  {
    NativeArray.init((Scriptable) null, false);
    Object[] objectArray0 = new Object[1];
    NativeArray nativeArray0 = new NativeArray(objectArray0);
    ContextFactory contextFactory0 = ContextFactory.getGlobal();
    Context context0 = contextFactory0.makeContext();
    NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
    // Undeclared exception!
    try { 
      nativeArray0.getOwnPropertyDescriptor(context0, nativeJavaClass0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.head.NativeJavaClass", e);
    }
}
```

The biggest issue in this fault is the [constructor of `NativeJavaClass`](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeJavaClass.java#L74). This class is a [subclass of `NativeJavaObject`](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeJavaObject.java). Both of them have multiple constructors, which set multiple local variables (including a variable called `javaObject`). The problem here is that both of these classes have an empty constructor which does not accept any input parameter:

```java
public NativeJavaObject() { }
```
and
```java
public NativeJavaClass() { }
```

These two constructors do not set any value for `javaObject`.

The generated test initiate an object from `NativeJavaClass` and pass it as one of the input parameters of the caller class (`NativeArray`). This object is passed through multiple classes (indicated in stack trace). Eventually, [`ScriptRuntime.toString(ScriptRuntime.java:803)`](projects/closure/lib/rhino/src/org/mozilla/javascript/ScriptRuntime.java#L783) calls [method `NativeJavaClass.getDefaultValue` of class `NativeJavaClass`](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeJavaClass.java#L153). This method calls `toString`, which uses the `javaObject` variable without checking if it is null or noy, and it leads to a `NullPointerException`.


## ST38

[Stack trace](stacktraces.md#st38-f18):

```
com.google.javascript.rhino.head.EcmaError: TypeError: Cannot find default value for object.
com.google.javascript.rhino.head.ScriptRuntime.constructError(ScriptRuntime.java:3728)
com.google.javascript.rhino.head.ScriptRuntime.constructError(ScriptRuntime.java:3706)
com.google.javascript.rhino.head.ScriptRuntime.typeError(ScriptRuntime.java:3734)
com.google.javascript.rhino.head.ScriptRuntime.typeError1(ScriptRuntime.java:3746)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:1014)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:933)
com.google.javascript.rhino.head.ScriptRuntime.toString(ScriptRuntime.java:803)
com.google.javascript.rhino.head.ScriptRuntime.toStringIdOrIndex(ScriptRuntime.java:1448)
com.google.javascript.rhino.head.ScriptableObject.getSlot(ScriptableObject.java:3100)
com.google.javascript.rhino.head.ScriptableObject.getOwnPropertyDescriptor(ScriptableObject.java:3093)
com.google.javascript.rhino.head.IdScriptableObject.getOwnPropertyDescriptor(IdScriptableObject.java:778)
com.google.javascript.rhino.head.NativeArray.getOwnPropertyDescriptor(NativeArray.java:584)
```

Generated test ([test14](../../results/cling/closure-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-13/com/google/javascript/rhino/head/NativeArray_ESTest.java#L211)):

```java
@Test(timeout = 4000)
public void test14()  throws Throwable  {
    NativeObject nativeObject0 = new NativeObject();
    NativeArray.init(nativeObject0, true);
    NativeArray nativeArray0 = new NativeArray((-3061L));
    ContextFactory contextFactory0 = new ContextFactory();
    Context context0 = contextFactory0.enterContext((Context) null);
    // Undeclared exception!
    try { 
      nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0);
      fail("Expecting exception: EcmaError");
    
    } catch(EcmaError e) {
        //
        // TypeError: Cannot find default value for object.
        //
        verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
    }
}
```

[Caller (`NativeArray`)](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeArray.java) and [Callee (`IdScriptableObject`)](projects/closure/lib/rhino/src/org/mozilla/javascript/IdScriptableObject.java) are in the same hierarchy tree. The generated test uses null value for context to call [method `getOwnPropertyDescriptor`](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeArray.java#L584) in super class. The [method has no documentation](projects/closure/lib/rhino/src/org/mozilla/javascript/ScriptableObject.java#L3092) and the value of the context is not checked.

## ST40

[Stack trace](stacktraces.md#st40-f19):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.IdScriptableObject.initPrototypeMethod(IdScriptableObject.java:646)
com.google.javascript.rhino.head.NativeArray.initPrototypeId(NativeArray.java:243)
```

Generated test ([test03](../../results/cling/closure-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-2/com/google/javascript/rhino/head/NativeArray_ESTest.java#L90)):

```java
@Test(timeout = 4000)
public void test03()  throws Throwable  {
    NativeArray nativeArray0 = new NativeArray(84L);
    // Undeclared exception!
    try { 
      nativeArray0.initPrototypeId(13);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
    }
}
```

A method in [Caller class is called `NativeArray.initPrototypeId`](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeArray.java#L213). This method uses Callee class by calling a method called `initPrototypeMethod`. This method should be invoked after activating `PrototypeMap` in this method. It uses a local variable call `prototypeValues`. Since `PrototypeMap` is not activated, the `prototypeValues` is null. So, [calling `initPrototypeMethod`](projects/closure/lib/rhino/src/org/mozilla/javascript/IdScriptableObject.java#L646) without making sure of activation of `PrototypeMap` by caller class leads to NullPointerException. No checks of the internal state of the objects are done and the documentation does not described the proper initialization sequence.


## ST41

[Stack trace](stacktraces.md#st41-f20):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.Decompiler.appendString(Decompiler.java:226)
com.google.javascript.rhino.head.Decompiler.addName(Decompiler.java:156)
com.google.javascript.rhino.head.IRFactory.transformName(IRFactory.java:833)
com.google.javascript.rhino.head.IRFactory.transform(IRFactory.java:157)
```

Generated test ([test01](../../results/cling/closure-com.google.javascript.rhino.head.IRFactory-com.google.javascript.rhino.head.Decompiler-2/com/google/javascript/rhino/head/IRFactory_ESTest.java#L62)):

```java
@Test(timeout = 4000)
public void test01()  throws Throwable  {
    IRFactory iRFactory0 = new IRFactory();
    Name name0 = new Name(65536, 65536);
    ReturnStatement returnStatement0 = new ReturnStatement(10, 43);
    iRFactory0.transform(returnStatement0);
    // Undeclared exception!
    try { 
      iRFactory0.transform(name0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.head.Decompiler", e);
    }
}
```

A method in `IRFactory` (`transform`) needs an object from another class, called `Name`, which has multiple constructor. One of the constructors of this class is `Name(int pos, int len)`, which gets to integers and set to local variable with it. However, if we instantiate the `Name` object with this specific constructor, one of the `String` local variables, called `identifire`, in this class will remain `Null`. 

As we can see, the generated test instantiates the `Name` object with the aforementioned constructor (the `identifire` inside the `Name` object remained null). Then, it passes this object to a method `IRFactory.transform`. This class does not check the local variable inside the passed `Name` object and it eventually uses `identifire` in the this object as an input parameter for calling [method `Decompiler.addName`](projects/closure/lib/rhino/src/org/mozilla/javascript/Decompiler.java#L153). This method again does not check the passed input parameter value and passes it to [another method called `appendString`](projects/closure/lib/rhino/src/org/mozilla/javascript/Decompiler.java#L224), which calls a method of this Null String. 


## ST43

[Stack trace](stacktraces.md#st43-f21):

```
java.lang.ClassCastException: java.lang.String cannot be cast to com.google.javascript.rhino.jstype.StaticSourceFile
com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1110)
com.google.javascript.rhino.Node.getSourceFileName(Node.java:1104)
com.google.javascript.rhino.Node.getProp(Node.java:811)
com.google.javascript.rhino.Node.copyInformationFrom(Node.java:1739)
com.google.javascript.rhino.Node.copyInformationFromForTree(Node.java:1754)
com.google.javascript.jscomp.NodeUtil.setDebugInformation(NodeUtil.java:2345)
```

Generated test ([test083](../../results/cling/closure-com.google.javascript.jscomp.NodeUtil-com.google.javascript.rhino.Node-10/com/google/javascript/jscomp/NodeUtil_ESTest.java#L1005)):

```java
@Test(timeout = 4000)
public void test083()  throws Throwable  {
    CodingConvention codingConvention0 = mock(CodingConvention.class, new ViolatedAssumptionAnswer());
    doReturn(false).when(codingConvention0).isConstant(anyString());
    Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
    doReturn("", "").when(node0).getProp(anyInt());
    Node node1 = NodeUtil.newName(codingConvention0, "", node0);
    // Undeclared exception!
    try { 
      NodeUtil.setDebugInformation(node1, node1, "m<,g&!T^UYBGU\"(%4");
      fail("Expecting exception: ClassCastException");
    
    } catch(ClassCastException e) {
        //
        // no message in exception (getMessage() returned null)
        //
    }
}
```

The [`NodeUtil.setDebugInformation` static method](projects/closure/src/com/google/javascript/jscomp/NodeUtil.java#L2343) calls the [`copyInformationFromForTree` method](projects/closure/src/com/google/javascript/rhino/Node.java#L1553) on the first node object provided as parameter in the test. A [`TODO` note](projects/closure/src/com/google/javascript/rhino/Node.java#L1552) indicates that the `copyInformationFromForTree` method should be deleted as the _semantics of this method are ill-defined_. 

The `Node` class encapsulates the different setters and getters for the different properties using dedicated setters and getters. But at the same time, it allows one to set and get arbitrary properties (or replace existing ones) using the [`putProp` method](projects/closure/src/com/google/javascript/rhino/Node.java#L845) without additional checks and potentially breaking the class invariants. This it this behavior that is shown in the test with the mocking of the `getProp` method calls. 

## ST44

[Stack trace](stacktraces.md#st44-f22):

```
java.lang.NullPointerException
com.google.javascript.rhino.Node.addChildToBack(Node.java:609)
com.google.javascript.jscomp.NodeUtil.newCallNode(NodeUtil.java:2883)
```

Generated test ([test65](../../results/cling/closure-com.google.javascript.jscomp.NodeUtil-com.google.javascript.rhino.Node-14/com/google/javascript/jscomp/NodeUtil_ESTest.java#L805)):

```java
@Test(timeout = 4000)
public void test65()  throws Throwable  {
    Node node0 = new Node(2120, (-1527), (-1527));
    Node[] nodeArray0 = new Node[5];
    // Undeclared exception!
    try { 
      NodeUtil.newCallNode(node0, nodeArray0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.Node", e);
    }
}
```

The [method in the caller class (method `newCallNode`)](projects/closure/src/com/google/javascript/jscomp/NodeUtil.java#L2878) is not used internally in the project, which tends to indicate that it should be called by external classes. However, there is no specific documentation or comments about input parameters. If one passes a null value as a parameter to this method, the method passes this null value to [one of the methods of the callee (`addChildToBack`)](projects/closure/src/com/google/javascript/rhino/Node.java#L608). The callee method throws `NullPointerException` with that null value.

Note: the caller class contains more than 150 public/protected method calls. Each of them has multiple input parameters and multiple branches to call. Unlike EvoSuite, Cling only focuses on the methods which interact with the callee class.


## ST45

[Stack trace](stacktraces.md#st45-f23):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.NativeJavaObject.put(NativeJavaObject.java:130)
com.google.javascript.rhino.head.ScriptableObject.putProperty(ScriptableObject.java:2423)
com.google.javascript.rhino.head.ScriptRuntime.setObjectIndex(ScriptRuntime.java:1668)
com.google.javascript.rhino.head.ScriptRuntime.setObjectIndex(ScriptRuntime.java:1658)
```

Generated test ([test05](../../results/cling/closure-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-1/com/google/javascript/rhino/head/ScriptRuntime_ESTest.java#L100)):

```java
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectIndex((Object) nativeJavaClass0, 0.0, (Object) nativeJavaClass0, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
      }
  }
```

Same issue as [ST38](#ST38).


## ST46

[Stack trace](stacktraces.md#st46-f24):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.NativeJavaObject.has(NativeJavaObject.java:96)
com.google.javascript.rhino.head.ScriptableObject.getBase(ScriptableObject.java:2560)
com.google.javascript.rhino.head.ScriptableObject.putProperty(ScriptableObject.java:2373)
com.google.javascript.rhino.head.ScriptRuntime.setObjectProp(ScriptRuntime.java:1640)
com.google.javascript.rhino.head.ScriptRuntime.setObjectIndex(ScriptRuntime.java:1661)
```

Generated test ([test06](../../results/cling/closure-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-1/com/google/javascript/rhino/head/ScriptRuntime_ESTest.java#L117)):

```java
@Test(timeout = 4000)
public void test06()  throws Throwable  {
    NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
    Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
    // Undeclared exception!
    try { 
      ScriptRuntime.setObjectIndex((Object) nativeJavaObject0, (-69.51242), (Object) nativeJavaObject0, context0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
    }
}
```

Same issue as [ST38](#ST38).

## ST48
[Stack trace](stacktraces.md#st48-f25):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.ScriptableObject.getBase(ScriptableObject.java:2560)
com.google.javascript.rhino.head.ScriptableObject.putProperty(ScriptableObject.java:2373)
com.google.javascript.rhino.head.ScriptRuntime.setObjectElem(ScriptRuntime.java:1617)
```

Generated test ([test03](../../results/cling/closure-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-7/com/google/javascript/rhino/head/ScriptRuntime_ESTest.java#L78)):

```java
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectElem((Scriptable) null, (Object) null, (Object) boolean0, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
```

This test passes `null` for the first input parameter of the method `setObjectElem`. 
The [documentation](projects/closure/lib/rhino/src/org/mozilla/javascript/ScriptRuntime.java#L1606) of this method does not indicate any restriction for this argument. This method also passes this null object to class `ScriptableObject` by calling method `putProperty`. Again, there is no limitations in the [documentations](projects/closure/lib/rhino/src/org/mozilla/javascript/ScriptableObject.java#L2371). Eventually, method `getBase` in `ScriptableObject` uses this object without checking if it is `null`, and thereby it throws `NullPointerException`.

## ST 49


[Stack trace](stacktraces.md#st49-f26):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.NativeJavaObject.get(NativeJavaObject.java:116)
com.google.javascript.rhino.head.ScriptableObject.getProperty(ScriptableObject.java:2268)
com.google.javascript.rhino.head.ScriptRuntime.getObjectIndex(ScriptRuntime.java:1585)
com.google.javascript.rhino.head.ScriptRuntime.getObjectIndex(ScriptRuntime.java:1574)
```

Generated test ([test00](../../results/cling/closure-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-13/com/google/javascript/rhino/head/ScriptRuntime_ESTest.java#L40)):

```java
@Test(timeout = 4000)
public void test00()  throws Throwable  {
    NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
    Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
    // Undeclared exception!
    try { 
      ScriptRuntime.getObjectIndex((Object) nativeJavaClass0, 0.0, context0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
    }
}
```

Same issue as [ST38](#ST38).


## ST50

[Stack trace](stacktraces.md#st50-f27):

```
java.lang.NullPointerException
com.google.javascript.rhino.head.ScriptRuntime.storeIndexResult(ScriptRuntime.java:3943)
com.google.javascript.rhino.head.ScriptRuntime.toStringIdOrIndex(ScriptRuntime.java:1439)
com.google.javascript.rhino.head.ScriptableObject.getSlot(ScriptableObject.java:3100)
com.google.javascript.rhino.head.ScriptableObject.getOwnPropertyDescriptor(ScriptableObject.java:3093)
com.google.javascript.rhino.head.IdScriptableObject.getOwnPropertyDescriptor(IdScriptableObject.java:778)
com.google.javascript.rhino.head.NativeArray.getOwnPropertyDescriptor(NativeArray.java:584)
```

Generated test ([test18](../../results/cling/closure-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.ScriptRuntime-18/com/google/javascript/rhino/head/NativeArray_ESTest.java#L268)):

```java
@Test(timeout = 4000)
public void test18()  throws Throwable  {
    NativeArray nativeArray0 = new NativeArray(1431655764L);
    Short short0 = new Short((short)588);
    // Undeclared exception!
    try { 
      nativeArray0.getOwnPropertyDescriptor((Context) null, short0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
    }
}
```

[Caller (`NativeArray`)](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeArray.java) and [Callee (`IdScriptableObject`)](projects/closure/lib/rhino/src/org/mozilla/javascript/IdScriptableObject.java) are in the same hierarchy tree. The test generated by Cling uses a null value for context to call [method `getOwnPropertyDescriptor`](projects/closure/lib/rhino/src/org/mozilla/javascript/NativeArray.java#L576) in the superclass. The documentation of the method does not describe restrictions on the inputs, and no checks are performed. 




  

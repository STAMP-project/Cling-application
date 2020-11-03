
# Time

## ST10

[Stack trace](stacktraces.md#st10-f2):

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


## ST11

[Stack trace](stacktraces.md#st11-f3):

```
org.joda.time.IllegalFieldValueException: Value 14 for dayOfMonth is not supported
org.joda.time.chrono.GJChronology$CutoverField.set(GJChronology.java:719)
org.joda.time.chrono.ZonedChronology$ZonedDateTimeField.set(ZonedChronology.java:466)
org.joda.time.chrono.BaseChronology.set(BaseChronology.java:240)
```

Generated test ([test6](../../results/cling/time-org.joda.time.chrono.GJChronology-org.joda.time.chrono.GJChronology$CutoverField-14/org/joda/time/chrono/GJChronology_ESTest.java#L95)):

```java
@Test(timeout = 4000)
public void test6()  throws Throwable  {
    DateTime dateTime0 = new DateTime();
    GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
    LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
    // Undeclared exception!
    try { 
      gJChronology0.set(localDateTime0, (-748L));
      fail("Expecting exception: IllegalFieldValueException");
    
    } catch(IllegalFieldValueException e) {
        //
        // Value 13 for dayOfMonth is not supported
        //
        verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
    }
}
```

Caller method [calls a method `set` in `ZonedChronology$ZonedDateTime`](projects/time/src/main/java/org/joda/time/chrono/BaseChronology.java#L240). This method changes one of the inputs and passes them to the set method in callee. Callee throws and exception because the returned value from one of the passed objects is not equal to the other passed value. There is no pre-checking before calling the callee.

# Mockito

## ST16

[Stack trace](stacktraces.md#st16-f4):

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

## ST17

[Stack trace](stacktraces.md#st17-f5):

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


## ST18

[Stack trace](stacktraces.md#st18-f6):

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


# Math

## ST23

[Stack trace](stacktraces.md#st23-f11):

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


# ST24

## math-100-org.apache.commons.math.ode.GraggBulirschStoerIntegrator-org.apache.commons.math.ode.SwitchingFunctionsHandler-4

test03
```
java.lang.NullPointerException
org.apache.commons.math.ode.SwitchState.reinitializeBegin(SwitchState.java:124)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:98)
org.apache.commons.math.ode.GraggBulirschStoerIntegrator.integrate(GraggBulirschStoerIntegrator.java:848)
```

The generated test calls e method from Caller class called `addSwitchingFunction()`. This method does not called by any other class in the project. So, this method should be called from outside. One of the input parameters of this method is an object from `SwitchingFunction` class. When we read the comments of this method, there it is not indicated that this input cannot be null. The generated test passes null as this input parameter. The called method uses this object for initilize an object from callee class without any checking (for instance, null checking).

 Next, the test calls another method which uses that initialized object of Callee (`GraggBulirschStoerIntegrator.integrate()`). comments and documentation of this method does not indicate that this method may throw NullPointerException. However, by calling this method we trigger a NullPointerException because of the null value that we used in initializing of Callee.



# ST25

## math-100-org.apache.commons.math.ode.GraggBulirschStoerIntegrator-org.apache.commons.math.ode.AdaptiveStepsizeIntegrator-2

test01
```
java.lang.NullPointerException
org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:184)
org.apache.commons.math.ode.GraggBulirschStoerIntegrator.integrate(GraggBulirschStoerIntegrator.java:527)
```

In this case, Caller is the sub-class and Callee is the super-class. The called method in Caller is `integrate()` which is not called by any other class in the project. If we pass Null as one of the inputs of this method (last input which is ` double[] y`) it uses this method in one of the inherited methods from super-class (`sanity()`). There is no null checking in any of these methods. Also, there is not specific information about the forbidden values for the inputs in the comments and documentations.


# ST29

## closure-16-com.google.javascript.rhino.jstype.JSType-com.google.javascript.rhino.jstype.UnionType-3


test04
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


The generated test is:

```java
      ...
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
```

In this case, `UnionType` (callee class) is the sub-class and `JSType` (callee class) is the super class. The genrated test instantiate a `UnionType` object with the following constructor ` UnionType(JSTypeRegistry registry, Collection<JSType> alternates)`. Also, it passes `NULL` for the first parameter. According to the documentation of this class there is no limitation for the input. This constructor sets the value of a local variable (`registry`) to the passed value (here, it is `NULL`). Then, the genrated test calls method `getTypesUnderInequality` of the instantiated object. This method invokes method `isEmptyType` in the super class, indirectly. `isEmptyType` method tries to use local variable  `registry`. since this variable is set to `NULL` during the invocation of constructor of `UnionType`, it throws a `NullPointerException`.


# ST30


## closure-16-com.google.javascript.rhino.jstype.JSType-com.google.javascript.rhino.jstype.UnionType-1

test22
```
java.lang.NullPointerException
com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeUnionType(ProxyObjectType.java:203)
com.google.javascript.rhino.jstype.ParameterizedType.toMaybeUnionType(ParameterizedType.java:50)
com.google.javascript.rhino.jstype.JSType.isUnionType(JSType.java:248)
com.google.javascript.rhino.jstype.UnionType.isEquivalentTo(UnionType.java:318)
com.google.javascript.rhino.jstype.JSType.equals(JSType.java:478)
```


The generated test is:

```java
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
```
In this case, `UnionType` (callee class) is the sub-class and `JSType` (callee class) is the super class. in this test calls equals of `UnionType` by input parameter of an object instantiated from class `ParameterizedType`. The constructor of `ParameterizedType` accepts multiple input parameters. The second one is `JSType referencedType`. The generated test passes `NULL` for this value. the constructor of  `ParameterizedType` set a local variable with the same name by this input parameter. When the generated test passes this object to check if it is equal to the `UnionType` by calling method equals in `UnionType`, it does not check if the local variable of objec `ParameterizedType` is null or not, and it passes it to method `isUnionType` of the other target class (`JSType`). This method calls method `toMaybeUnionType` of the passed `ParameterizedType` object. the called method uses `referencedType` without checking if it is null or not. Hence, it throws `NullPointerException`.


# ST32

## closure-16-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-5

test255
```
java.lang.NullPointerException
com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition.setItem(JSDocInfo.java:136)
com.google.javascript.rhino.JSDocInfoBuilder.markName(JSDocInfoBuilder.java:217)
```

The genrated test instantiate caller class and calls method `markName(String name, StaticSourceFile file,int lineno, int charno)` in it. This method instantiate a new object from the callee class and passes input parameter `name` to one of its methods (`setItem`) as an input parameter. The called method in the callee class uses this input. The generated test passes `NULL` value as input parameter `name`. there is no limitation for the inputs of the caller class in the documentation. However, the documentation of the method in callee class mentioned that the passed string should have no leading or trailing whitespace. The caller class passes the `name` value without checking if it is following the requirements of string in the callee class.

# ST33

## closure-16-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-1

test170
```
java.lang.NullPointerException
com.google.javascript.rhino.JSTypeExpression.equals(JSTypeExpression.java:107)
java.util.ArrayList.indexOf(ArrayList.java:321)
java.util.ArrayList.contains(ArrayList.java:304)
com.google.javascript.rhino.JSDocInfo.addImplementedInterface(JSDocInfo.java:1233)
com.google.javascript.rhino.JSDocInfoBuilder.recordImplementedInterface(JSDocInfoBuilder.java:925)
```


The generated test initializes an object from `JSTypeExpression` with null inputs. This object is passed to a method in the caller class. The called method invokes a method in the callee class and passes the `JSTypeExpression` object to it. The method in the callee class check this object with a customized `equal` method. this method gets a value in the `JSTypeExpression`, which is null because of the first initialization with null values, and try to use it without checking if it is null or not. Hence, it throws NullPointerException.

* Cling captured this exception because, opposite to evosuite, it tries to cover all of the combination of branches in the method in the caller and method in the callee.


# ST34

## closure-16-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-1
test159
```
java.lang.NullPointerException
com.google.common.collect.ImmutableList.copyFromCollection(ImmutableList.java:291)
com.google.common.collect.ImmutableList.copyOf(ImmutableList.java:260)
com.google.javascript.rhino.JSDocInfo.declareTemplateTypeNames(JSDocInfo.java:915)
com.google.javascript.rhino.JSDocInfoBuilder.recordTemplateTypeNames(JSDocInfoBuilder.java:299)
```

The generated test passes null value for one of the input parameteres of a method in the caller class. This method passes this null value to a method in the callee class without any checking. The passed null input parameter leads to a NullPointerException in the callee class. The only information about this input parameter in the comments is: `a JavaScript object`. There is nothing about the situation that we pass a null value.


# ST35

## closure-16-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-1
test071
```
java.lang.NullPointerException
com.google.javascript.rhino.JSTypeExpression.hashCode(JSTypeExpression.java:113)
java.util.HashMap.hash(HashMap.java:339)
java.util.HashMap.containsKey(HashMap.java:596)
com.google.javascript.rhino.JSDocInfo.documentThrows(JSDocInfo.java:792)
com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(JSDocInfoBuilder.java:327)
```

The generated test is:

```java
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
```

This test instantiates `JSTypeExpression` by a null value for the first input parameter of its constructor (`(Node root`). There is no documentation about the limitatiopn of the inputs in the documentations. The object of `JSTypeExpression` is passed to the caller by a method called `recordParameter` which passes this value to the callee class. Then, it calls method `recordThrowDescription` in caller, which calls method `documentThrows` in callee. This method throws  `NullPointerException` because the `root` in the passed `JSTypeExpression` is null.


# ST36

## closure-16-com.google.javascript.rhino.head.ScriptableObject-com.google.javascript.rhino.head.FunctionObject-18
test01
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
Caller and Callee are in the same hierarchy tree. The generated test by Cling used null value for context to call method `getOwnPropertyDescriptor` in super class. the documentaion of the method does not discribe about the forbidden inputs. Also, you can see that some methods in the super class check if contect is null or not. However, other methods does not check that while they can be called directly.



# ST37

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-12

test15
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

Here, the caller is a class called `NativeArray`.  The generated test passes a `IdFunctionObject` object to the caller class Then, the caller class passes this object to the callee class `ScriptRuntime`. This class is later used in the callee class. However, if we do not call  method `initFunction` in `IdFunctionObject`, the usage of `IdFunctionObject` by callee class would lead to NullPointerException. The existance of `parentScope` in the passed `IdFunctionObject` to the caller and callee is not checked by these two classes. Eventually, the callee class inkoed a method, which needs the `parentScope`, and since it is not available, it throws the NullPointerException. Also, the documentation of `IdFunctionObject` did not mention that you need to call the init function.


# ST38

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-11

test12
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

The biggest issue in this fault is the constructor of `NativeJavaClass`. This class is a subclass of `NativeJavaObject`. both of them have multiple constructors, which set multiple local variables (including a variable called `javaObject`). the problem here is that both of these classes have an empty constructor which does not accept any inptu parameter:

```java
    public NativeJavaObject() { }
```
and
```java
    public NativeJavaClass() { }
```

these two constructors does not set any value for `javaObject`.


The generated test is:

```java
   NativeArray.init((Scriptable) null, false);
      ...
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
```

the generated test initiate an object from `NativeJavaClass` and pass it as one of the input parameters of the caller class (`NativeArray`). This object is passed through multiple classes (indicated in stack trace). Eventually, `ScriptRuntime.toString(ScriptRuntime.java:803)` calls method `NativeJavaClass.getDefaultValue` of class `NativeJavaClass`. This method calls `toString`, which uses the `javaObject` variable without checking if it is null or noy, and it leads to a `NullPointerException`.


# ST39
## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-13

test14
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


Caller and Callee are in the same hierarchy tree. The generated test by Cling used null value for context to call method `getOwnPropertyDescriptor` in super class. the documentaion of the method does not discribe about the forbidden inputs. Also, you can see that some methods in the super class check if contect is null or not. However, other methods does not check that while they can be called directly.

# ST41

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-2

test03
```
java.lang.NullPointerException
com.google.javascript.rhino.head.IdScriptableObject.initPrototypeMethod(IdScriptableObject.java:646)
com.google.javascript.rhino.head.NativeArray.initPrototypeId(NativeArray.java:243)
```

A method in Caller class is called `NativeArray.initPrototypeId`. This method uses Callee class by calling a method called `initPrototypeMethod`. This method should be invoked after activating `PrototypeMap` in this method. It uses a local variable call `prototypeValues`. Since `PrototypeMap` is not activated, the `prototypeValues` is null. So, calling `initPrototypeMethod` without making sure of acvtivation of `PrototypeMap` by caller class leads to NullPointerException.


# ST42

## closure-16-com.google.javascript.rhino.head.IRFactory-com.google.javascript.rhino.head.Decompiler-2

test01
```
java.lang.NullPointerException
com.google.javascript.rhino.head.Decompiler.appendString(Decompiler.java:226)
com.google.javascript.rhino.head.Decompiler.addName(Decompiler.java:156)
com.google.javascript.rhino.head.IRFactory.transformName(IRFactory.java:833)
com.google.javascript.rhino.head.IRFactory.transform(IRFactory.java:157)
```
A method in `IRFactory` (`transform`) needs an object from another class, called `Name`, which has multiple constructor. One of the constructors of this class is `Name(int pos, int len)`, which gets to integers and set to local variable twith it. However, if we instantiate the `Name` object with this specific constructor, one of the `String` local variables, called `identifire`, in this class will remain `Null`. The generated test case by Cling is:

```java
     IRFactory iRFactory0 = new IRFactory();
      Name name0 = new Name(65536, 65536);
      ReturnStatement returnStatement0 = new ReturnStatement(10, 43);
      iRFactory0.transform(returnStatement0);
      // Undeclared exception!
      iRFactory0.transform(name0);
      fail("Expecting exception: NullPointerException");
```

As we can see, this test instantiates the `Name` object with the aforementioned constructor (the `identifire` inside the `Name` object remained null). Then, it passes this object to a method `IRFactory.transform`. This class does not check the local variable inside the passed `Name` object and it eventually uses `identifire` in the this object as an input parameter for calling method `Decompiler.addName`. This method again does not check the passed input parameter value and passes it to another method called `appendString`, which calls a method of this Null String. 


# ST44

## closure-16-com.google.javascript.jscomp.NodeUtil-com.google.javascript.rhino.Node-10

test003
```
java.lang.ClassCastException: java.lang.String cannot be cast to com.google.javascript.rhino.jstype.StaticSourceFile
com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1110)
com.google.javascript.rhino.Node.getSourceFileName(Node.java:1104)
com.google.javascript.rhino.Node.getProp(Node.java:811)
com.google.javascript.rhino.Node.copyInformationFrom(Node.java:1739)
com.google.javascript.rhino.Node.copyInformationFromForTree(Node.java:1754)
com.google.javascript.jscomp.NodeUtil.setDebugInformation(NodeUtil.java:2345)
```


The generated test calls a method in the caller class (`newQualifiedNameNode`) to generate a `Node` object. Then, it uses that object as an input parameter to another method of the caller class (`NodeUtil.setDebugInformation`). This method call leads to a class cast exception later. In this case, the generated test laverages the existing usages of callee class in the caller class to throw this exception.


# ST45

## closure-16-com.google.javascript.jscomp.NodeUtil-com.google.javascript.rhino.Node-14

test65
```
java.lang.NullPointerException
com.google.javascript.rhino.Node.addChildToBack(Node.java:609)
com.google.javascript.jscomp.NodeUtil.newCallNode(NodeUtil.java:2883)
```

The method in the caller class (method `newCallNode`) is not used intenally in the project. Also, there is no specific documentations or comments about input parameters. If you pass null as a parameter to this method, The method passes this null value to one of the methods of Callee (`addChildToBack`). The Callee method throws NullPointerException with that null value.

 ** Why EvoSuite on caller did not find this? ** Because the caller class contains more than 150 public/protected method calls. Each of them has multiple input parameters and multiple branches to call. However, Cling only focus on the methods which interact with the callee class.


 # ST46 & 47 & 50


 ## closure-16-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-1
## closure-16-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-13

 Same as __ST38__



 # ST51
## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.ScriptRuntime-18
  Same as __ST36__
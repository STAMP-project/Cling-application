# ST1

The called method expects this type of exception according to the comments and documentations.

# ST2

The called method expects this type of exception according to the comments and documentations.


# ST 3

here, the mocked value returns null for getChronology. However this value cannot be null according to documents

# ST4

The called method expects this type of exception according to the comments and documentations.


# ST5 & 6
 The called method in caller is `parse`. The documentation of this method clearl says that the passed string cannot be null, while Cling passed null.


 # ST7
 Same as __ST3__


  # ST9
 Same as __ST5 & 6__



  # ST12
 Same as __ST1__


   # ST13
The generated test mocked a Chronology object to return `null` after calling method `get(Partial, double)`. However, this method never returns null. The only `get` method is:

```java
public int[] get(ReadablePartial partial, long instant) {
        int size = partial.size();
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = partial.getFieldType(i).getField(this).get(instant);
        }
        return values;
    }
```

 # ST14
 Same as __ST3__

  # ST15
 Same as __ST3__



  # ST26
The captured exception is not about the integration of caller and callee


  # ST27
One of the objects are mocked to return a null value. It is impossible for the mocked object to return null.


  # ST28
  Same as __ST27__

  # ST31

The called method in caller class is Deprecated.




# ST40

For activating `PrototypeMap`, we ned to call `activatePrototypeMap(id)`. The passed `id` should be a value lower than 24. The generated test directly called this method with higher number and it throws the exception. However, when we check all of the invokation of this method in the project, we can see that this method is always called with a static int.


# ST43
 
The called method of caller class does not accept null value according to the comments and documentations.


# ST48

The Delegator class is instantiated by a constructor, which is indicated to be used only for portotype object.
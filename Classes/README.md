### Classes

A class without any content can be declared as follows

```kotlin
    class Student(name: String, grade: Int)
```

A class 
1. has a default constructor
2. is final by default and cannot be extended, so to be able to extend a class, it must be declared as open or abstract
3. extends from *Any* by default, like how by default a class in Java extends from *Object*.
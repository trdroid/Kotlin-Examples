### Properties

Properties are similar to data member fields of Java plus a getter and a setter.

The following class in Java

```java
    public class Student {
        private String name;
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
    }
```

 is equivalent to the following class in Kotlin, which provides a default getter and setter
 
```kotlin
    public class Student {
        var name: String = ""
    }
    
    val student = Stundent()
    student.name = "Keith"
    val studentName = student.name
```

Custom getter and setter can be provided as

```kotlin
    public class Student {
        var name: String = ""
            get() = field
    }
```

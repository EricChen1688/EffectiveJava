# 第二章-创建和销毁对象

------

## 第1条：考虑用静态工厂方法代替构造器

类可以提供一个共有的静态工厂方法（static factory method），它返回类的实例

例如：将boolean类型的类型值转化为Boolean对象的引用：

```java
    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
```

优势：

1. 它有名称所以可以更好的描述该实例（当一个类需要多个相同名称的构造器时，用静态方法可以突出他们的不同）
2. 不必在每次调用它们时候都创建一个新对象（可以构造一个实例，缓存起来重复使用）
3. 静态方法可以返回原返回类型的任何子类型对象 ，EnumSet中的一个方法：

```java
    public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType) {
        Enum<?>[] universe = getUniverse(elementType);
        if (universe == null)
            throw new ClassCastException(elementType + " not an enum");

        if (universe.length <= 64)
            //RegularEnumSet构造方法包内可见，所以返回的是一个父类型包裹的子类型，更灵活【 里氏替换原则】
            return new RegularEnumSet<>(elementType, universe);  
        else
            return new JumboEnumSet<>(elementType, universe);
    }
```


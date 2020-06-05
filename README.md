# feat-ViewBinding
ViewBinding 使用

### 使用条件
- studio版本3.6+
- build.gradle 配置
~~~
android {
   ...
    viewBinding {
        enabled = true
    }
}
~~~
- studio版本4.0+
- gradle tools
~~~
dependencies {
        classpath 'com.android.tools.build:gradle:4.0.0'
    }
~~~
- build.gradle 配置
~~~
android{
       ...
       buildFeatures {
        viewBinding = true
    }
}
~~~
- JDK 在1.8
![JDK](https://github.com/0119zp/feat-ViewBinding/blob/master/JDK%E8%AE%BE%E7%BD%AE.png)

### 流程
- 创建XML文件
- 编译器为该XML文件产生一个对应的绑定类（名称由XML文件名称确定）。生成绑定类位置如下：
![绑定类位置](https://github.com/0119zp/feat-ViewBinding/blob/master/%E7%BB%91%E5%AE%9A%E7%B1%BB%E4%BD%8D%E7%BD%AE.png)
- 不想为某个XML文件生成绑定类，则可以使用如下属性添加到布局的根视图中即可：
~~~
tools:viewBindingIgnore="true"
~~~

### 视图绑定
[视图绑定](https://developer.android.google.cn/topic/libraries/view-binding)


## markdown

### 自我介绍

全民制作人们大家好，我是练习时长两个星期半的个人练习生...啊，不好意思，拿错了😦

学长好，我是软工互+的一名大一新生。

初来成电，见工作室之繁多，本无进室之愿，见吾之舍友甚卷，遂生此念。望吾自身，虽无长技，但吾善习。初，吾不知未来之方向，遂问吾字节之长兄，道后端之优，吾甚喜，遂来报汝之后端方向，但招新时已过三分之一，遂吾倍加努力，只望入室以交流经验，提升技术。

## Linux

### 认识linux

1. [了解linux历史](https://linux.cn/article-6469-1.html)

Ken Thompson 和 Dennis Ritchie在 1969-1970 创造了 Unix 操作系统。之后发布了新的 C 编程语言，它是一种高级的、可移植的编程语言。 Linux 内核用 C 和一些汇编代码写成。

Richard Matthew Stallman在 1984 年启动了 GNU 项目。最大的一个目标 - 完全自由的类-Unix 操作系统。

1991-元年 Linus Torvalds在芬兰赫尔辛基开始了 Linux 内核开发，他是为他的硬件 - Intel 30386 CPU 编写的程序。他也使用 Minix 和 GNU C 编译器。从此之后，Linux 开始得到了世界范围志愿者和专业专家的支持。Linus 的同事 Ari Lemmke 把它命名为 “Linux” - 这其实是他们的大学 ftp 服务器上的项目目录名称。Debian – 最大的 Linux 社区之一也创立于 1991 年。

1992 在 GPLv2 协议下发布了 0.12 版 Linux 内核。

1993 Slackware 首次发布（LCTT 译注：Slackware Linux 是一个高度技术性的、干净的发行版，只有少量非常有限的个人设置） – 最早的 Linux 发行版，其领导者 Patrick Volkerding 也是最早的。其时，Linux 内核有 100 多个开发者。

1994 Linux 1.0 发布了，多亏了 XFree 86 项目，第一次有了 GUI。发布了 Red Hat Linux 1.0和 S.u.S.E. Linux 1.0。

1995 Bob Young 和 Marc Ewing 合并他们的本地业务为 Red Hat Software。Linux 移植到了很多硬件平台。

1996 企鹅 Tux 是 Linux 官方吉祥物，Linus Torvalds 参观了堪培拉国家动物园和水族馆之后有了这个想法。发布了 Linux 2.0，支持对称多处理器。开始开发 KDE。

......

2. linux发行版有哪些

![Linux发行版](https://pic2.zhimg.com/80/v2-96412a201d1b437bd977673c3e4ea3a9_1440w.webp)

3. 发行版有什么不同

[主要有这5个方面的不同](https://blog.csdn.net/u010632165/article/details/106930586)：

- Desktop Environments（桌面环境）
- Package managers（软件包管理器）
- Display servers（显示服务器）
- Goals and aims（目标和宗旨）
- Open source philosophy（开源哲学）

4. 为什么绝大多数服务器部署在linux上，而不是其他操作系统

[原因有：](https://blog.csdn.net/qq_45172832/article/details/124396797)

- 开源
- 低风险性
- 稳定性
- 多用户

### 安装linux

1. 安装linux (vmware , virtualbox, wsl , 物理机都可 发行版选择自己喜欢的

![Ubuntu](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f6ksoxtoj310h0u0dih.jpg)

2. 了解包管理器,[包管理器的工作原理](https://linux.cn/article-12713-1.html)

简单来说，“包管理器package manager”（或“软件包管理器”）是一种工具，它允许用户在操作系统上安装、删除、升级、配置和管理软件包。软件包管理器可以是像“软件中心”这样的图形化应用，也可以是像 [apt-get](https://itsfoss.com/apt-vs-apt-get-difference/) 或 [pacman](https://itsfoss.com/pacman-command/) 这样的命令行工具。

一个“包package”（或“软件包”）通常指的是一个应用程序，它可以是一个 GUI 应用程序、命令行工具或（其他软件程序需要的）软件库。包本质上是一个存档文件，包含二进制可执行文件、配置文件，有时还包含依赖关系的信息。

工作原理：

几乎所有的 Linux 发行版都有“软件仓库software repository”，它基本上是软件包的集合。是的，可以有不止一个软件库。软件库包含不同种类的软件包。

软件仓库也有元数据文件，其中包含了软件包的信息，如软件包的名称、版本号、软件包的描述和软件仓库名称等。这就是你在 Ubuntu/Debian 中使用 [apt show 命令](https://itsfoss.com/apt-search-command/)所看到的。

你的系统上的包管理器首先会与元数据进行交互。包管理器在你的系统上创建了一个元数据的本地缓存。当你运行包管理器的更新选项（例如 `apt update`）时，它会通过引用仓库中的元数据来更新本地元数据缓存。

当你运行软件包管理器的安装命令（例如 `apt install package_name`）时，软件包管理器会引用这个缓存。如果它在缓存中找到了包的信息，它就会使用互联网连接到相应的仓库，并在你的系统上安装之前先下载包。

一个包可能有依赖关系。意思是说，它可能需要安装其他软件包。软件包管理器通常会处理这些依赖关系，并将其与你正在安装的软件包一起自动安装。

3. 换源更新

![image-20221123174613288](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f7du8t6mj317004kab6.jpg)

![image-20221123174455614](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f7ciwbw2j31e00u0wng.jpg)

![image-20221123174715592](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f7f3kq7hj31e00u0gxl.jpg)

![image-20221123175139572](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f7jibm2hj30lm04yt9f.jpg)

![image-20221123175627333](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f7onlnhkj314f0u0tep.jpg)

### 使用linux

1. 安装gcc

![image-20221123180340346](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f7w0lptgj31mp0u0nbb.jpg)

2. 学习使用vim

![image-20221123181259369](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f85pndu1j30pi04ugm7.jpg)

![image-20221123183029662](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f8nxe0kcj31540qydhc.jpg)

![image-20221123183056358](https://tva1.sinaimg.cn/large/008vxvgGgy1h8f8ofqw8lj30rg05s0th.jpg)

3. 在shell中将此次的C 语言题目完成

   如下

4. 下载vscode，配置vscode环境，并完成（3）

   如下

5. 下载oh my zsh ,为自己shell选择一个好看的主题

`$ sudo apt install zsh `      安装zsh

`$ chsh -s /bin/zsh `            将zsh设置为默认shell

安装oh my zsh(梯子配置了半天😭)

![image-20221125183352751](https://tva1.sinaimg.cn/large/008vxvgGgy1h8hk0232zuj31c40u0gs0.jpg)

安装主题（Powerlevel10k）

配置......

应用：

![image-20221125192056781](https://tva1.sinaimg.cn/large/008vxvgGly1h8hld2pgd5j31c40u0n2r.jpg)



## 配置vscode

### *环境变量：*

![image-20221125193059280](https://tva1.sinaimg.cn/large/008vxvgGgy1h8hlngfo65j31bn0u046q.jpg)

![image-20221125193356266](https://tva1.sinaimg.cn/large/008vxvgGgy1h8hlqizge3j31fe0u0gyw.jpg)

### *launch.json*

啊啊啊，这里按Windows配置教程配置的话运行不了😭，查到的资料也少的可怜，自己摸索着配了一下，可能有的地方不是很准确，呜呜呜

![image-20221125193746866](https://tva1.sinaimg.cn/large/008vxvgGgy1h8hlujhah9j319h0u0n1x.jpg)

### *task.json*

![image-20221125193715099](https://tva1.sinaimg.cn/large/008vxvgGgy1h8hlu3s7tdj319h0u0tcz.jpg)





## C语言

### C-0001
*字符串游戏*

- 先直接运行一下看看：

![image-20221125193944478](https://tva1.sinaimg.cn/large/008vxvgGgy1h8hlwkbcmyj319h0u0tff.jpg)

像极了我写的程序的运行效果😄

真的猛士，敢于直面惨淡的warning(s)，敢于正视淋漓的error(s)😭

- 修改过后的程序

```C
#include<stdio.h>
#include<string.h>
#include<stdlib.h> // 1. malloc()函数包含在<stdlib.h>标准库里面
int main()
{
    char *A = "I LOVE YOU";
    char *B = NULL;
    int length = strlen(A);
    
    B= (char*)malloc(length);

    char* dest=B;

    char* src=&A[length-1]; // 2. src是指针，不能将字符（即整数）直接赋给指针，应加上取址号&    3. A的第length个数的下标为length-1

    while(length--!=0)
        *dest++ = *src--; // 4. 应该改变dest指针指向的内容

    printf("%s\n" ,B);
    return 0;
}
```
- 输出：

![image-20221125194441680](https://tva1.sinaimg.cn/large/008vxvgGgy1h8hm1qrzgkj31hi06w0u1.jpg)

好简单😄



### C-0010
*命令行和重定向输入*

- 知识补充：

  输入重定向即用文本文件代替键盘当作程序的输入。 ‘ < ‘ 符号是Unix、Linux和DOS的重定向运算符。该运算把文件和stdin流关联起来，将该文件的内容引导至程序。

  输出重定向就是用文本文件代替屏幕当作程序的输出。’ > ’运算符是另一个重定向运算符。

- 实现代码：

```c
#include <stdio.h>
#include <stdlib.h>

int main(){

    char ch;

    while ((ch = getchar()) != EOF)
        printf("%c", ch);

}
```

- 命令行截图：

![image-20221125195656277](https://tva1.sinaimg.cn/large/008vxvgGgy1h8hmehv4f6j315a0rctd9.jpg)

### C-0011

- 芝士

  指向非法的内存地址指针叫作野指针（Wild Pointer），也叫悬挂指针（Dangling Pointer），意为无法正常使用的指针。

  常见产生原因：

  1. 使用未初始化的指针
  2. 指针所指的对象已经消亡
  3. 指针释放后未置空

- 改正代码：

此程序是产生野指针的第三种情况

```c
#include <string.h>
#include <stdio.h>
#include <stdlib.h>
int main()
{
    char *p = (char *)malloc(100);
    strcpy(p, "nihao");
    free(p);          // free(p)后p变成野指针，其值不变，所以不为NULL
    p = NULL;         // 解决方法：指针释放后置空，这样运行的时候就会提示你segmentation fault（存储器区块错误）
    if (p != NULL)         
        strcpy(p, "shijie"); // 将字符串放到p指向的内存（没有经过系统指定的内存）中去，可能造成非法访问
    for (int i = 0; i < 6; i++)
        printf("%c", *(p + i));
    printf("\n");
    return 0;
}
```

此时再运行程序会提示segmentation fault，表示错误使用了指针。所以free指针后记得要把指针置空，不然的话虽然程序能运行，但可能造成非法访问

- 第二个程序：

  这样下面这个程序的错误就很明显啦，对应第一种情况：

```c
#include<stdio.h>
#include<stdlib.h>
void swap(int *a,int *b){
    int *mid = (int*)malloc(sizeof(int));  // mid指针没有被初始化（野指针）就直接被使用,应该给mid分配内存
    *mid = *b;
    *b = *a;
    *a = *mid;
}
int main(){
    int num1, num2;
    printf("please input the two nums:\n");
    scanf("%d %d", &num1, &num2);
    printf("num1 is %d,num2 is %d\n", num1, num2);
    swap(&num1, &num2);
    printf("num1 is %d,num2 is %d\n", num1, num2);
    return 0;
}
```

幸好程算老师刚好最近教过野指针，刚好有这个例子哈哈哈

### C-0100

- 预备知识：

函数指针：函数存放在内存的代码区域内，它们同样有地址。函数指针是指向函数的指针变量。函数指针可以像一般函数一样，用于调用函数、传递参数。

指向指针的指针：指向指针的指针是一种多级间接寻址的形式，或者说是一个指针链。通常，一个指针包含一个变量的地址。当我们定义一个指向指针的指针时，第一个指针包含了第二个指针的地址，第二个指针指向包含实际值的位置。

栈区Stack：编译器自动分配和释放的，主要存储的是函数的参数值，局部变量等值。相对较高的地址，地址值从高往低分配。每次函数调用结束后，局部变量先出栈，然后是参数，最后栈顶指针指向最开始存的地址

堆区Heap：由程序员编写代码去控制分配和释放，一般放的指针。从低往高分配。堆的具体行为,整个生命周期由程序员控制释放free

函数参数传递：

值传递：就是把你的变量的值传递给函数的形式参数，实际就是用变量的值来新生成一个形式参数，因而在函数里对形参的改变不会影响到函数外的变量的值。

地址传递：就是把变量的地址赋给函数里形式参数的指针，使指针指向真实的变量的地址，因为对指针所指地址的内容的改变能反映到函数外，能改变函数外的变量的值。

被调函数开辟的栈内存：当调用一个函数时，程序在内存中开辟这个函数的栈，然后在此栈中存放此函数中的变量，函数执行完以后，立刻返回调用该函数的位置，然后这个栈被销毁了

![栈](https://img-blog.csdnimg.cn/20200531101702396.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxOTY1MzE0NDEx,size_16,color_FFFFFF,t_70)

开辟的堆内存：由程序员编写代码去控制分配和释放，不会自动释放。

区别：

main函数在栈区开辟的内存，所有子函数均可以使用；
main函数在堆区开辟的内存，所有子函数均可以使用；
子函数在栈区开辟的内存，子函数1和2均可以使用，但main不可以；
子函数1在堆区开辟的内存，main、子函数1和2都可以使用；

内存泄露：

堆内存是由程序员进行管理的，内存管理器不会自动回收不再使用的内存。如果忘记回收不再使用的内存，内存得不到复用，就会导致内存泄露。

内存泄漏的常见场景：

1. 指针重新赋值

   ![img](http://c.biancheng.net/uploads/allimg/180910/2-1P910133056457.jpg)

2. 错误的内存释放

   ![img](http://c.biancheng.net/uploads/allimg/180910/2-1P910133120920.jpg)

3. 返回值的不正确处理

4. 分配内存后忘记使用free释放

   

*Talking is cheap, show me the code !*

- 第一个程序的修改：

第一次修改死活运行不出来！然后重启了一下code就好了，浪费了我宝贵的一个小时😭

```c
#include <stdio.h>
#include <string.h>
#include<stdlib.h>
void Tell(char **U) // 如果把指针作为参数传入函数，在函数内给形参分配空间，出了函数之后，实参并没有被分配空间，所以要把指向指针的指针传入函数
{
    *U = (char *)malloc(100);
}
int main()
{
    char *I = NULL;
    Tell(&I);
    strcpy(I, "I LOVE YOU");
    printf(I);
    return 0;
}
```

- 第二个程序的修改：

```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char *Tell(void)
{
    static char u[] = "I LOVE YOU";
    // 这里的u是局部数组变量，存储在栈区内，函数结束后，局部变量的内存被释放，这个地址的数据失去意义
    // 解决方法有两种，一是可以把该局部变量声明为static类型，即静态局部变量，是在静态存储区内分配存储单元
    // 第二可以在返回指向字符串常量的指针 即char *u = "I LOVE YOU"
    return u;
}

int main()
{
    char *I = NULL;
    I = Tell();
    printf(I);
    return 0;
}
```

哈哈😄,对内存分配有了一个新的了解了呢



### C-0101

大的要来辣！😱

```c
#include <stdio.h>
#include <string.h>
#include <malloc.h>
 
struct BOOK
{
   char* name;
   int number;
};
char* func()
{
    char p[] = "C primier plus";   
    return p;  // 2. 不能直接返回局部变量
}
void del(char* p)
{
    printf("%s\n",p);
    free(p);    
}
 
int main()
{
    struct BOOK s; 
    char* p = func();  
    
    int* p1 = (int*)malloc(10*sizeof(int)); // 3. 给p1分配了10个int大小，却访问了40个int大小的内存
    for(int i = 0;i < 40;i++)      
    {
        *(p1 + i) = 40 - i;   
    }
    free(p1); 

    int* p2 = (int*)12345678;  // 4. 给p2赋任意地址，也可能导致非法访问
    for(i = 0;i < 40;i++)  // 1. 上面的i是定义在循环中的局部变量，此处需要再次声明
    {
        p1[i] = p2[i];        // 6. p1被释放后变成了野指针，直接使用野指针可能会导致非法访问
    }   
    
    strcpy(s.name,p);   
    s.number = 99;
    
    p = (char*)malloc(20);   
    strcpy(p,"C and pointer"); 
    del(p);  // 5. 如果把指针作为参数传入函数，在函数内释放形参的内存，而p的内存没有被释放
 
    return 0;
}
```

以上只是我的拙见🤤，可能不太准确🖐，还请多多谅解！

## 后端

哈哈，终于开始激动人心的Java学习啦😁

### 后端-0001

- 前置知识

[基本数据类型](https://www.runoob.com/java/java-basic-datatypes.html)：byte, short, int, long, float, double, boolean, char

[数组](https://www.runoob.com/java/java-array.html)：

创建：

```java
dataType[] arrayRefVar = new dataType[arraySize];
```

java数组引入了for-each循环

```java
for(type element: array)
{
    System.out.println(element);
}
```

而且java数组可以作为函数的参数或者返回值

还有与C不一样的一点，在Java中，数组都是引用实体变量，呈树形结构，每一个叶子节点之间毫无关系，只有引用关系，每一个引用变量只引用一个实体。

![java数组](https://img-blog.csdnimg.cn/20190407233823656.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQyOTEzNzk0,size_16,color_FFFFFF,t_70)

循环：这个基本和C相同

呼！开始做题！

- 题目

编写一个程序实现多个班级的平均分统计功能:用一个二维数组保存多个班级的成绩，每个班的人数不同;先提示用户输入班级数，然后对每个班提示用户输入班级人数，然后提示用户一次输入班级的所有人的成绩。每项成绩间用空格分割;读入输入的成绩。分析出每项成绩保存到数组中。然后从数组中计算出总成绩。并显示出班级的平均成绩。最后计算出所有班级的总成绩，然后显示出平均成绩。

- 分析

要先获得应该定义的数组长度，先获得班级数，然后定义一个记录每个班人数的一维数组，获取每班人数，然后以班级总数和班级人数最大值定义记录成绩的二维数组，获取每个学生成绩后，计算出班级平均成绩和年级平均成绩再输出即可。



- 代码展示

```java
package com.why.backend0001;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入班级数：");
        int number_class = scanner.nextInt();

        int[] number_each_class = new int[number_class];
        int number_max_student = 0;
        int number_all_student = 0;

        for (int i = 0; i < number_class; i++) {
            System.out.println("请输入" + (i + 1) + "班人数");
            number_each_class[i] = scanner.nextInt();
            number_max_student = Math.max(number_max_student, number_each_class[i]);
            number_all_student += number_each_class[i];
        }

        int[][] score = new int[number_class][number_max_student];

        for (int i = 0; i < number_class; i++) {
            System.out.println("一次输入" + (i + 1) + "班的所有人的成绩,每项成绩间用空格分割");
            for (int j = 0; j < number_each_class[i]; j++) {
                score[i][j] = scanner.nextInt();
            }
        }

        double total_score_all = 0.0;
        for (int i = 0; i < number_class; i++) {
            double total_score_class = 0.0;
            for (int j = 0; j < number_each_class[i]; j++) {
                total_score_class += score[i][j];
            }
            System.out.println((i + 1) + "班的平均成绩是：" + String.format("%.1f",total_score_class / number_each_class[i]));
            total_score_all += total_score_class;
        }

        System.out.println("所有班级的平均成绩是：" + String.format("%.1f", total_score_all / number_all_student));

        scanner.close();

    }
}
```

### 后端-0010

- 前置知识：

[异常处理](https://www.runoob.com/java/java-exceptions.html)：

![img](https://www.runoob.com/wp-content/uploads/2013/12/exception-hierarchy.png)



捕获异常：

有五个关键字：try, catch, throw, throws, finally

使用 try 和 catch 关键字可以捕获异常。try/catch 代码块放在异常可能发生的地方。Catch 语句包含要捕获异常类型的声明。当保护代码块中发生一个异常时，try 后面的 catch 块就会被检查。如果发生的异常包含在 catch 块中，异常会被传递到该 catch 块，这和传递一个参数到方法是一样。

如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。

finally 关键字用来创建在 try 代码块后面执行的代码块。无论是否发生异常，finally 代码块中的代码总会被执行。在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。

自定义异常：

在 Java 中你可以自定义异常。编写自己的异常类时需要记住下面的几点。

1. 所有异常都必须是 Throwable 的子类。
2. 如果希望写一个检查性异常类，则需要继承 Exception 类。
3. 如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。



- 题目

1. （1）定义一个游戏中Hero 英雄的类，在该类中定义英雄的名字， 生命值和等级3 个属性，定义一个构造函数完成对生命值和等级的初始化，分别赋初值为100，1。同时实现名字的输入和英雄信息的输出。

（2）在上一题的基础上，为英雄再定义拥有一个参数的构造方法，传入一个英雄类型的值，如果为1，则为普通英雄，生命值为100，如果该值为2，则为高级英雄，生命值初始化为200。

（3）在上两英雄类型的基础上，为英雄添加一个基本战斗的方法， 该方法拥有一个英雄类型的参数，当传入另一个英雄时，能降低对方100 点血。 再增加一个绝招的重载方法，加入一个战斗类型参数，通过输入不同绝招参数，降低对方不同的血量。

So easy！话不多说，直接上code

```java
package com.why.backend0010;

public class Hero {
    String name;
    int health;
    int level;

    public Hero() {
        this.health = 100;
        this.level = 1;
    }

    public Hero(int heroType) {
        if (heroType == 1) {
            this.health = 100;
        } else if (heroType == 2) {
            this.health = 200;
        }
        this.level = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fight(int heroType, Hero attackedHero) {
        if (heroType == 1) {
            attackedHero.health -= 50;
        } else if (heroType == 2) {
            attackedHero.health -= 100;
        }
    }

    public void fight(int heroType, Hero attackedHero, int ultHurt) {
        if (heroType == 1) {
            attackedHero.health -= ultHurt;
        } else if (heroType == 2) {
            attackedHero.health -= ultHurt * 2;
        }
    }

}
```

2. 创建一个名称为Vehicle的接口 在接口中添加两个带有一个参数的方法start()和stop()。在两个名称分别为Bike和Bus的类中实现Vehicle接口。创建一个名称为interfaceDemo的类 在interfaceDemo的main()方法中创建Bike和Bus对象 并访问start()和stop()方法。

Vehicle接口：

```java
package com.why.backend0010;

public interface Vehicle {
    void start(int speed);
    void stop(int time);
}
```

Bike类：

```java
package com.why.backend0010;

public class Bike implements Vehicle {
    @Override
    public void start(int speed) {
        System.out.println("自行车正在以" + speed + "km/h的速度向前走");
    }

    @Override
    public void stop(int time) {
        System.out.println("自行车在" + time + "s后停了下来");
    }
}
```

Bus类：

```java
package com.why.backend0010;

public class Bus implements Vehicle{

    @Override
    public void start(int speed) {
        System.out.println("公交车正在以" + speed + "km/h的速度向前行驶");
    }

    @Override
    public void stop(int time) {
        System.out.println("公交车在" + time + "s后停了下来");
    }
}
```

interfaceDemo类：

```java
package com.why.backend0010;

public class interfaceDemo {
    public static void main(String[] args){
        Bike bike = new Bike();
        Bus bus = new Bus();

        bike.start(10);
        bike.stop(3);

        bus.start(50);
        bus.stop(1);
    }
}
```

3. 定义一个抽象的”Role”类 有姓名 年龄 性别等成员变量

（1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有) 再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法 该方法不返回任何值 同时至少定义两个构造方法。Role类中要体现出this的几种用法。

知识补充：

`this`用法：

`this`关键字可用来引用当前类的实例变量。

`this`关键字可用于调用当前类方法(隐式)。

`this()`可以用来调用当前类的构造函数。

`this`关键字可作为调用方法中的参数传递。

`this`关键字可作为参数在构造函数调用中传递。

`this`关键字可用于从方法返回当前类的实例。

Role类：
```java
package com.why.backend0010;

public abstract class Role {
    private int age;
    private String name;
    private double weight;

    public Role(){
        this(18,"王五", 73.5); // 调用当前类的构造函数。
    }

    public Role(int age, double weight){
        this(age, "王五", weight);
    }

    public Role(int age, String name, double weight) {
        this.age = age;   // 引用当前类的实例变量。
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void play();

    public void replay(){
        this.play(); // 调用当前类方法(隐式)。
    }

    public Role getRole(){
        return this; // 从方法返回当前类的实例。
    }
}
```



（2）从Role类派生出一个”Employee”类 该类具有Role类的所有成员 构造方法除外 并扩展 salary成员变量 同时增加一个静态成员变量“职工编号 ID ”。同样要有至少两个构造方法 要体现出this和super的几种用法 还要求覆盖play()方法 并提供一个final sing()方法。

知识补充：

`super` 用法

`super`可以用来引用直接父类的实例变量。

`super`可以用来调用直接父类方法。

`super()`可以用于调用直接父类构造函数。

Employee类：

```java
package com.why.backend0010;

public class Employee extends Role {
    private double salary;
    private static int ID;

    public Employee(int age, String name, double weight, double salary, int ID) {
        super(age, name, weight); // 调用直接父类构造函数。
        this.salary = salary;
        Employee.ID = ID;
    }

    public Employee(double salary, int ID) {
        this(18, "王五", 73.5, salary, ID);
    }

    @Override
    public void play() {
        System.out.println(getName() + "摸鱼ing");
    }

    @Override
    public void replay() {
        super.replay(); // 用来调用直接父类方法,(虽然这里显得多余
    }

    public final void sing() {
        System.out.println(getName() + "singing");
    }
}
```



（3）”Manager”类继承”Employee”类 有一个final成员变量”vehicle”

Manager类：

```java
package com.why.backend0010;

public class Manager extends Employee {
    private final Vehicle vehicle;

    public Manager(int age, String name, double weight, double salary, int ID, Vehicle vehicle) {
        super(age, name, weight, salary, ID);
        this.vehicle = vehicle;
    }

    public void work() {
        System.out.println(getName() + "开着车来公司了");
        vehicle.start(30);
    }
}
```

（4）在main()方法中制造Manager和Employee对象,并测试这些对象的方法

```java
public class Work {
    public static void main(String[] args){
        Employee employee = new Employee(4000,202209);
        Manager manager = new Manager(50, "张三",90,13000.23,200109,new Bike());

        employee.play();
        employee.sing();

        manager.work();
        manager.play();
    }
}
```

运行结果：

![image-20221204111153358](https://tva1.sinaimg.cn/large/008vxvgGgy1h8rlsxpf8hj30n80a20t5.jpg)

呼！只能说IDEA太智能了，Generate真的太方便了

### 后端-0011

- 前置知识

泛型类：泛型类型用于类的定义中，被称为泛型类。通过泛型可以完成对一组类的操作对外开放相同的接口。最典型的就是各种容器类

泛型接口：泛型接口与泛型类的定义及使用基本相同。泛型接口常被用在各种类的生产器中。当实现泛型接口的类，未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中。在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型

泛型通配符：类型通配符一般是使用？代替具体的类型实参，注意了，此处’？’是类型实参，而不是类型形参。此处的？和Number、String、Integer一样都是一种实际的类型，可以把？看成所有类型的父类。是一种真实的类型。

泛型方法：

public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。

<? extends T> 与 <? super T>

根据字面意思，`<? extends T>` 表示 *任何继承自类型 `T` 的类型*，`<? super T>` 表示 *任何是类型 `T` 的超类的类型*。

`? extend/super Xx` 不能用于声明处。

1. <? extends T> 不能往里存，只能往外取（被称作*协变*）

- 往里存的意思就是，不能调用 `<? extends T>` 泛型类的以 `T` 为形参的方法。
- 往外取的意思就是，可以调用 `<? extends T>` 泛型类的以 `T` 为返回值的方法。

2. 下界 <? super Fruit> 不影响往里存，但是往外取只能放在 `Object`（被称作*逆变*）

[容器](https://www.runoob.com/java/java-collections.html)：

![img](https://www.runoob.com/wp-content/uploads/2014/01/2243690-9cd9c896e0d512ed.gif)

😓怎么这么复杂啊啊啊

Java 集合框架主要包括两种类型的容器，一种是集合（Collection），存储一个元素集合，另一种是图（Map），存储键/值对映射。Collection 接口又有 3 种子类型，List、Set 和 Queue，再下面是一些抽象类，最后是具体实现类，常用的有 ArrayList、LinkedList、HashSet、LinkedHashSet、HashMap、LinkedHashMap 等等。

常用子类：
[ArrayList](https://www.runoob.com/java/java-arraylist.html)是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。

`ArrayList<E> objectName =new ArrayList<>();`

	- 添加元素到 ArrayList 可以使用 add() 方法
	- 访问 ArrayList 中的元素可以使用 get() 方法
	- 修改 ArrayList 中的元素可以使用 set() 方法
	- 删除 ArrayList 中的元素可以使用 remove() 方法
	- 计算 ArrayList 中的元素数量可以使用 size() 方法
	- 使用 for 或者 for-each 来迭代数组列表中的元素

注： <E> 只能为引用数据类型，这时我们就需要使用到基本类型的包装类

[LinkedList](https://www.runoob.com/java/java-linkedlist.html)是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的地址。与 ArrayList 相比，LinkedList 的增加和删除的操作效率更高，而查找和修改的操作效率较低。

`LinkedList<E> list = new LinkedList<E>(); `

- 使用 addFirst() 在头部添加元素
- 使用 addLast() 在尾部添加元素
- 使用 removeFirst() 移除头部元素
- 使用 removeLast() 移除尾部元素
- 使用 getFirst() 获取头部元素
- 使用 getLast() 获取尾部元素

[HashSet](https://www.runoob.com/java/java-hashset.html)

- 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
- 允许有 null 值。
- 是无序的，即不会记录插入的顺序。
- 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
- 实现了 Set 接口。

- 可以使用 contains() 方法来判断元素是否存在于集合当中
- 删除集合中所有元素可以使用 clear 方法



[HashMap](https://www.runoob.com/java/java-hashmap.html)

- 是一个散列表，它存储的内容是键值对(key-value)映射。
- 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
- 是无序的，即不会记录插入的顺序。
- 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。

- 添加键值对(key-value)可以使用 put() 方法
- 可以使用 get(key) 方法来获取 key 对应的 value
- 可以使用 remove(key) 方法来删除 key 对应的键值对(key-value)
- 删除所有键值对(key-value)可以使用 clear 方法

[Iterator 迭代器](https://www.runoob.com/java/java-iterator.html)不是一个集合，它是一种用于访问集合的方法，可用于迭代 [ArrayList](https://www.runoob.com/java/java-arraylist.html) 和 [HashSet](https://www.runoob.com/java/java-hashset.html) 等集合。

迭代器 it 的两个基本操作是 next 、hasNext 和 remove。

- 调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
- 调用 it.hasNext() 用于检测集合中是否还有元素。
- 调用 it.remove() 将迭代器返回的元素删除。

[多线程编程](https://www.runoob.com/java/java-multithreading.html)

创建：使用 **new** 关键字和 **Thread** 类或其子类建立一个线程对象后，该线程对象就处于新建状态。它保持这个状态直到程序 **start()** 这个线程。

休眠：sleep() 让当前线程休眠，即当前线程会从“运行状态”进入到“休眠(阻塞)状态”。sleep()不会释放锁（抱着锁睡觉）

完蛋！没时间啦呜呜呜，只能学到这里了，呜呜呜尽力了。


















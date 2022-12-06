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
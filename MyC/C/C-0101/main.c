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
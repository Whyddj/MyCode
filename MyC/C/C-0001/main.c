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
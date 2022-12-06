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
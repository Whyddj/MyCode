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

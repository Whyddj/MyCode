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
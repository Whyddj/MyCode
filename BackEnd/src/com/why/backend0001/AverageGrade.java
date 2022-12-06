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

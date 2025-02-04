package My_Practice;
import java.util.Scanner;

public class StudentGrades2 {




        public static class Student {

            String name;
            double[] grades;
            int size;
            int gradeCount;


            public Student(String name, int size) {
                this.name = name;
                this.size = size;
                this.grades = new double[size];
                this.gradeCount = 0;
            }


            public void addGrade(double gradeValue, String date) {
                if (gradeCount < size) {
                    grades[gradeCount] = gradeValue;
                    gradeCount++;
                } else {
                    System.out.println("Grade list is full!");
                }
            }


            public double getHighestGrade() {
                if (gradeCount == 0) return 0;
                double highest = grades[0];
                for (int i = 1; i < gradeCount; i++) {
                    if (grades[i] > highest) {
                        highest = grades[i];
                    }
                }
                return highest;
            }


            public double getLowestGrade() {
                if (gradeCount == 0) return 0;
                double lowest = grades[0];
                for (int i = 1; i < gradeCount; i++) {
                    if (grades[i] < lowest) {
                        lowest = grades[i];
                    }
                }
                return lowest;
            }


            public class Grade {
                double value;
                String date;

                public Grade(double value, String date) {
                    this.value = value;
                    this.date = date;
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Student[] students = new Student[10];


            for (int i = 0; i < students.length; i++) {
                System.out.println("Enter the name of student " + (i + 1) + ": ");
                String name = scanner.nextLine();
                students[i] = new Student(name, 5);


                for (int j = 0; j < 5; j++) {
                    System.out.println("Enter grade #" + (j + 1) + " for " + name + ": ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter the date for grade #" + (j + 1) + ": ");
                    String date = scanner.nextLine();
                    students[i].addGrade(grade, date);
                }
            }


            System.out.println("\nStudent Grade Summary:");
            for (Student student : students) {
                System.out.println(student.name + "'s highest grade: " + student.getHighestGrade());
                System.out.println(student.name + "'s lowest grade: " + student.getLowestGrade());
            }

            scanner.close();
        }
    }


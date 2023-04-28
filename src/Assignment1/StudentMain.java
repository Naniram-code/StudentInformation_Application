package Assignment1;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args)
{
    Student[] addStudent=new Student[10];
    addStudent[0] = new Student("11", "Nani","NYC","abcd@gmail.com");
    addStudent[1] = new Student("12", "Ria","DC","abccd@gmail.com");
    addStudent[2] = new Student("13", "Ajim","NC","abcrd@gmail.com");
    addStudent[3] = new Student("14", "Rash","Canada","abrcd@gmail.com");
    addStudent[4] = new Student("15", "Mina","India","abscd@gmail.com");
    addStudent[5] = new Student("16", "Ram Kumar","Canada","abchd@gmail.com");
    addStudent[6] = new Student("17", "Ram Kumar","Canada","abchd@gmail.com");
    addStudent[7] = new Student("18", "Maheshwari","Nepal","asbcd@gmail.com");
    addStudent[8] = new Student("19", "Lokesh","NYC","abchd@gmail.com");
    addStudent[9] = new Student("20", "Sujata","New York","abxcd@gmail.com");

    System.out.println("*********************Student information**********************");
    for(Student sobj:addStudent)
	{
        System.out.println(sobj);
	}
    //"*********************Student information update ***************"
    addStudent[0].setSname("Nani Ram");
    addStudent[8].setSaddress("NC");
    addStudent[5].setSemail("xsjfh@gmail.com");
    System.out.println("check updated email="+(addStudent[5].getSemail().equals("xsjfh@gmail.com")));

    System.out.println("*********************After update Student information**********");
    for(Student sobj:addStudent)
    {
        System.out.println(sobj);
    }

    System.out.println("*************************Delete Array Element*******************");
    Scanner ss=new Scanner(System.in);
    System.out.print("Enter array element for delete=");
    int deleteIndex=ss.nextInt();
    System.out.println("*************************after DeleteStudent information *********");
    for(int i=0;i<addStudent.length-1;i++)
    {   if(i==deleteIndex)
        System.out.println(addStudent[i+1]);//delete Array concept
        else
        System.out.println(addStudent[i]);
    }
    System.out.println("*************************add new Student information *********");
    System.out.print("Enter array index position to add new student=");
    int addStudentNew=ss.nextInt();

    for(int i=0;i<addStudent.length;i++) { //add array size
        if (i == addStudentNew)
            addStudent[i] = addStudent[i + 1];
            addStudent[addStudentNew] = new Student("33", "Santosh", "Delhi", "Aabxcd@gmail.com");
          }
    System.out.println("*************************After adding Student information *********");
            for(Student sobj:addStudent)
             {
                 System.out.println(sobj);}
         }}







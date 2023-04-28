package Assignment1;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args)
{
    Student[] addStudent=new Student[10];
    addStudent[0] = new Student("1", "Nani","NYC","abcd@gmail.com");
    addStudent[1] = new Student("2", "Ria","DC","abccd@gmail.com");
    addStudent[2] = new Student("3", "Ajim","NC","abcrd@gmail.com");
    addStudent[3] = new Student("4", "Rash","Canada","abrcd@gmail.com");
    addStudent[4] = new Student("5", "Mina","India","abscd@gmail.com");
    addStudent[5] = new Student("6", "Ram Kumar","Canada","abchd@gmail.com");
    addStudent[6] = new Student("6", "Ram Kumar","Canada","abchd@gmail.com");
    addStudent[7] = new Student("7", "Maheshwari","Nepal","asbcd@gmail.com");
    addStudent[8] = new Student("8", "Lokesh","NYC","abchd@gmail.com");
    addStudent[9] = new Student("9", "Sujata","New York","abxcd@gmail.com");

    System.out.println("*********************Student information**********************");
    for(Student sobj:addStudent)
	{
        System.out.println(sobj);
	}
    addStudent[0].setSname("Nani Ram");
    addStudent[8].setSaddress("NC");

    System.out.println("*********************After update Student information**********************");
    for(Student sobj:addStudent)
    {
        System.out.println(sobj);
    }
    System.out.println("*************************Delete Array Element************************");
    Scanner ss=new Scanner(System.in);
    System.out.print("Enter array element for delete=");
    int deleteIndex=ss.nextInt();

    for(int i=0;i<addStudent.length-1;i++)
    {   if(i==deleteIndex)
        System.out.println(addStudent[i+1]);
        else
        System.out.println(addStudent[i]);
    }}}




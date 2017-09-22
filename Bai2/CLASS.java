/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5.Bai2;

/**
 *
 * @author MINH HIEU
 */
public class CLASS {
   
    TEACHER teacher;
    String Name;
    int numOfStudents;
    String advisor;
    STUDENT[] studentList;
    void setName(String n)
    {
        this.Name=n;
    }
    void setTeacher(TEACHER t)
    {
        this.teacher=t;
    }
    TEACHER getTeacher()
    {
        return this.teacher;
    }
    String getName()
    {
        return this.Name;
    }
    void setnumOfStudent(int n)
    {
        this.numOfStudents=n;
    }
    int getnumOfStudent()
    {
         return this.numOfStudents;
    }
    void setStudent(int i, STUDENT std)
    {
        this.studentList[i]=std;
    }
    void printList()
    {
        for(Integer i=0;i<studentList.length;i++ )
        {
            System.out.println(studentList[i]);
        }
    }
}

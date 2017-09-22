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
public class Test {
    public static void main(String[] args) {
        STUDENT std1=new STUDENT();
        std1.setName("Nguyen Van A");
        std1.setAddress("Ha Noi");
        std1.setDepartment("Lop truong");
        STUDENT std2=new STUDENT();
        std2.setName("Nguyen Van B");
        std2.setAddress("Ha Noi");
        std2.setDepartment("Lop pho");
        TEACHER t=new TEACHER();
        t.setName("Tran Thi A");
        t.setAddress("Quang Nam");
        t.setDepartment("hieu truong");
        t.setRank("ThS");
        CLASS cl1=new CLASS();
        cl1.setName("K61-N");  
        cl1.setTeacher(t);
        
        
        //
    }
  
}

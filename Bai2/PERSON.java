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
public class PERSON {
    String Name,Address,Department;
    void print()
    {
        System.out.println("Name"+this.Name+"\n"+"Address"+this.Address+"\n"+"Department"+this.Department);
    }
    void setName(String n)
    {
        this.Name=n;
    }
    void setAddress(String n)
    {
        this.Address=n;
    }
    void setDepartment(String n)
    {
        this.Department=n;
    }
    String getName()
    {
        return this.Name;
    }
    String getAddress()
    {
        return this.Address;
    }
    String getDepartment()
    {
        return this.Department;
    }
}

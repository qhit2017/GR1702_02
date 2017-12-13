package com.wyk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IEmployeeSystem {

   //新增商品
   void addEmployee(ArrayList<Employee>arrayList,Scanner sc);
   //进货
   void getEmployee(ArrayList<Employee>arrayList,Scanner sc);
   //销售
   void sellEmployee(ArrayList<Employee>arrayList,Scanner sc);
   //参看库存
   void infoEmployee(ArrayList<Employee>arrayList,Scanner sc);
  
   
}

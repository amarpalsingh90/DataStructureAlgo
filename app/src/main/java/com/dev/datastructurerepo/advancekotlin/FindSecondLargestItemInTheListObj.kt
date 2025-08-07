package com.dev.datastructurerepo.advancekotlin


fun main(){
    val employeeList: List<Employee> = listOf(
        Employee("Amar", 10000),
        Employee("Suraj", 25000),
        Employee("Ram", 35000),
        Employee("Rahul", 60000),
        Employee("Vishal", 66000),
        Employee("Sudhir", 75000),
        Employee("Deepak", 15000),
    )
   val employeeWithSecondHighestSalary= employeeList.sortedByDescending {it.salary}.stream()
        .skip(1)
        .findFirst()
        .get()
    val employeeWithSecondLowestSalary= employeeList.sortedBy {it.salary}.stream()
        .skip(1)
        .findFirst()
        .get()
    println(employeeWithSecondHighestSalary.toString())
    println(employeeWithSecondLowestSalary.toString())
}


data class Employee(val name:String, val salary: Int)
/* Name			        		: Md. Maruf Sarker
 * Program			       	: BSC in CSE
 * Section			      	: 221 D4
 * Instructor		      	: Humayun Kabir Rana
 * Date					        : 11-6-22
 * problem name			    : Write a program in java using parametric constructor
 * problem description	: Write a program in java using parametric constructor
 */


class Student3{
    int id;
    String name;
    //method to display the value of id and name
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        //creating objects
        Student3 s1=new Student3();
        Student3 s2=new Student3();
        //displaying values of the object
        s1.display();
        s2.display();
    }
}
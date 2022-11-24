class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome india");}  
}  
class C extends A{
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();
}  
}  
import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

class OfficeWork  {

	
	
	
	/*public static void main(String...sss) {
		
		 * HashSet myMap = new HashSet(); String s1 = new String("das"); String s2= new
		 * String("das"); NameBean s3 = new NameBean("abcdef"); NameBean s4 = new
		 * NameBean("abcdef"); myMap.add(s1); myMap.add(s2); myMap.add(s3);
		 * myMap.add(s4); System.out.println(myMap);
		 	
		LocalDate a= LocalDate.of(2022, 06, 01);
		a.plusDays(-1);
		System.out.println(a.getDayOfMonth());
	//}
		
}*/
/*
 * class NameBean { private String str; public NameBean (String str) {
 * this.str=str; } public String toString() { return str; } }
 */
	
	
	
	
	
	/*
	 * int x= 1; int y =2;
	 * 
	 * OfficeWork display (OfficeWork demoParm) { OfficeWork dd = new OfficeWork();
	 * dd= demoParm; dd.x=demoParm.x++ + ++demoParm.y; demoParm.y=demoParm.y; return
	 * dd; } public static void main(String[] args) { // TODO Auto-generated method
	 * stub
	 * 
	 * OfficeWork obj1 = new OfficeWork(); OfficeWork obj2 = obj1.display(obj1);
	 * System.out.println("obj1.x = "+obj1.x + "obj1.y = " +obj1.y );
	 * System.out.println("obj2.x = "+obj2.x + "obj2.y = " +obj2.y );
	 * 
	 * CalculatorDemo c= new CalculatorDemo(); CalculatorDemo c2= c; c.a+=1; c.b+=1;
	 * System.out.println("values"); c.display(); System.out.println("values2");
	 * c2.display(); }
	 * 
	 * 
	 * } class CalculatorDemo { int a =123, b = 200;
	 * 
	 * 
	 * public void display() { System.out.println("a:" +a + "b:" + b + "");
	 * 
	 * }
	 * 
	 */
	/*
	 * public static void main(String[] args) {
	 * 
	 * int twoD[] [] = new int [4] [];
	 * 
	 * twoD[0]=new int [1]; twoD[1]=new int [2]; twoD[2]=new int [3]; twoD[3]=new
	 * int [4]; for(int i =0; i<4; i++) { for (int j =0; j<i+1;j++) { twoD[i][j];
	 * 
	 * } System.out.println("executed"); }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { int [] [] x; x = new int [3][4]; for
	 * (int i =0; i<3; i+=2) { for (int j=0; j<4; j++) { x[i][j]=i+j;
	 * System.out.println(x[i][j]+ " "); } } }
	 */

	/*
	 * public static void main(String[] args) { int i =0; int[] myArry = {11,111};
	 * for (int i:myArry) { System.out.println("%d", i); } }
	 */

	/*
	 * int quantity;
	 * 
	 * } class Main{ public static void main(String[] args) { OfficeWork apple;
	 * System.out.println(apple.quantity);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { switch(25) { case 5*10:
	 * System.out.println("FIFTEEN"); break; case 5*4-5+10:
	 * System.out.println("FIFTEEN"); break; case 6*6-5:
	 * System.out.println("TWENTY"); case 15: System.out.println("TWENTY FIVE");
	 * default:System.out.println("Nothing will print"); }
	 * 
	 * }
	 */

	/*
	 * void display(char c) { System.out.println("Emplyee name starts with :" +c+
	 * " "); System.out.println("His experience is : 11 yeras"); }
	 * 
	 * }
	 * 
	 * class Main extends Demo{ String Bye; void display(char c) { super.display(c);
	 * System.out.println("another employee name also starts with:" +c+ " "); new
	 * Demo().display('D'); display(7); } String display (int c) {
	 * System.out.println("His experience is :"+c+ "years");
	 * 
	 * return Bye; } } class OfficeWork {
	 * 
	 * public static void main(String[] args) { Demo emp = new Main();
	 * emp.display('S');
	 * 
	 * }
	 */

	/*
	 * class Parent{ Protected int i =0; public int j =1; } class Child extends
	 * Parent{ protected int k =8; public int h =9;
	 * 
	 * } final class GrandChild extends Child{
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public static void main(String[] args) { GrandChild g =new GrandChild(); g.i;
	 * g.h; g.j; g.k;
	 * 
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { I.C c =new I.C(000);
	 * System.out.println(c.MethodC()); }
	 * 
	 * 
	 * }
	 * 
	 * interface I{ class C{ int i; public C(int i) { this.i=++i; } int MethodC() {
	 * return ++i; } }
	 */

	/*
	 * public static void main(String[] args) { X a = new X(); Y b= new Y(); Class
	 * obj; obj=a.getClass(); System.out.println(obj.getName()); } } class X{ int a;
	 * double b;
	 * 
	 * } class Y extends X { int c;
	 */

	/*
	 * public static void main(String[] args) { Parent parent = new Child(); new
	 * Child().show1();
	 * 
	 * }
	 * 
	 * } class Parent { public final void show() {
	 * System.out.println("show() inside Employee"); } } final class Child extends
	 * Parent{ public void show1() { final int x=100;
	 * System.out.println("show() inside unit"); System.out.println(x); }
	 */
	/*
	 * public abstract class Customer{ public abstract String getCustomerType(); }
	 * abstract class C1 extends Customer{ public String getCustomerType() { return
	 * "premium"; } } Customer customer = new Customer() { public String
	 * getCustomerType() { return "premium"; } } class C11 extends Customer{ public
	 * String getCustomerType() { return "premium"; } } new Customer() { return
	 * "premium"; }
	 * 
	 */

	/*
	 * } public interface ParentDemo{ public void display(String points); } public
	 * class ChildDemo implements ParentDemo{ public void display(String points) {};
	 * 
	 * } public class Demo{ public ParentDemo disp() { //dkjdd } public String
	 * displayValue() {
	 * 
	 * } } public class Tester extends Demo{ public ChildDemo disp() { // return
	 * null; } private String displayValue() {
	 * 
	 * }
	 */

	/*
	 * // public class Student{ String stuName="Jacklin"; void func() throws
	 * Exception { try { stuName+= "..."; } catch(Exception e) { throw new
	 * Exception(); } finally { stuName ="Hello" +stuName; } stuName+= "!!!!"; }
	 * void disp()throws Exception { func(); System.out.println(stuName); }
	 * 
	 * 
	 * public static void main(String[] args) { try { OfficeWork student = new
	 * OfficeWork(); student.disp(); } catch (Exception e) {
	 * System.out.println("catch block"); } }
	 */

	/*
	 * public static void main(String[] args) { try { throw new IOException();}
	 * catch(IOException Exception e) { System.out.println(e+ "caught"); } }
	 * 
	 * 
	 * 
	 */

	/*
	 * public static void main(String[] name)throws Exception { integer [][] val=
	 * {{10,12,14},{null},{18,20,22}}; System.out.println("Array of ="+
	 * val[1][1].intvalue());
	 * 
	 * //}
	 * 
	 * 
	 * public static void main(String[] args) { try { throw new Customer(); }catch
	 * (CustomerException customerException) {
	 * System.out.println("customer Exception catch block"); }catch (Customer
	 * customer){ System.out.println("customer catch block");
	 * 
	 * }
	 * 
	 * } } class CustomerException extends Exception{
	 * 
	 * } class Customer extends CustomerException{
	 * 
	 */
	/*
	 * public static void main(String[] args) { try { int a[] = {1,2,3,4,5}; for
	 * (int i =1; i<=5; i++) { System.out.println("a[" + i + "]=" +a[i] + "n"); } }
	 * catch (Exception e) { System.out.println("error=" + e); } catch
	 * (ArrayIndexOutOfBoundsException e) {
	 * System.out.println("ArrayIndexOutOfBoundsExceptione"); }
	 */
	// }

	/*
	 * public static void main(String[] args) { String s1= new String ("Welcome");
	 * String s2="Welcome"; if (s1==s2) { System.out.println("Welcome"); } }
	 */

	/*
	 * public static void main(String[] args) { String str =null; switch(str) { case
	 * null: System.out.println("null string"); break;
	 * default:System.out.println("In default case");
	 * 
	 * } }
	 */

	/*
	 * public static void main(String[] args) { TreeSet set = new TreeSet();
	 * set.add("a"); set.add(6); set.add("c"); Iterator ite =
	 * (Iterator)set.iterator(); while (ite.hasNext()) {
	 * System.out.println(ite.next()+ ""); }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { Employee <String , Integer> employee
	 * = new Employee <>("Annie Thomas" ,25); employee.display(); }
	 * 
	 * 
	 * } Class Employee<E,A> { E eObj1; A aObje1;
	 * 
	 * Employee(E eOj1,A aObj1){ this.eOj1=eOj1; this.aObj1=aObj1;
	 * 
	 * } public void display() { System.out.println(eObj1);
	 * System.out.println(aObj1); }
	 * 
	 */

	/*
	 * public static void main(String[] args) { OfficeWork of = new OfficeWork();
	 * of.display(); }
	 * 
	 * @Override public void display() { // TODO Auto-generated method stub
	 * Childinterface.super.display(); } } interface Parentinterface { default void
	 * display() { System.out.println("Inside Default method"); } } interface
	 * Childinterface { default void display() {
	 * System.out.println("Default method redefined"); }
	 */

	/*
	 * public interface Address{ static default void city() {
	 * System.out.println("default city method"); } }
	 */
	

	/*
	 * public static void main(String[] args) { LocalDateTime localDatetime =
	 * LocalDateTime.of(2020, 12, 12, 21, 45);
	 * System.out.println(localDatetime.get(ChronoField.DAY_OF_MONTH)+
	 * localDatetime.getMinute()); }
	 */
	/*
	 * public static void main(String par[]) {
	 * 
	 * LocalDate date = LocalDate.of(2019, 3, 17); date=date.minusDays(18);
	 * date.minusMonths(1); System.out.println(date);
	 * 
	 * 
	 * }
	 */
	
	
	/*
	 * public void draw(String s) { if (s.equals("Square")){ drawSquare();
	 * 
	 * }
	 * 
	 * } public void draw(String s) { if ("Square".equals(s)) { drawSquare(); }
	 */
	/*
	 * public static void main(String par[]) {
	 * 
	 * String convertToUpper(String input) { try { return input.toUpperCase(); }
	 * catch(NullPointerException ex) {
	 * 
	 * }return null; }
	 * 
	 * }
	 */
	
/*String str =new String[] {"Hi","Hello",Welcome};
List strList  = Array.asList(str);
for (Iterator itr =strList.iterator();itr.hasNext(); )
{
	System.out.println(itr.next);
}

//Integer i1=new Intege(11);
//Integer i2 = new Integer 
Integer  i1= new Integer(11);
Integer i2= new Integer(11);

  //Sys*///tem.out.println(i1==i2);
	
	
	/* public static void main(String[] args) {
		 try {
		 throw new IOException();}
		 catch(IOException |Exception e) {
		 System.out.println(e + "caught");
		 }
		 }
		 }*/

	
	/*
	 * public static void main(String[] args) { try { throw new Customer(); }catch
	 * (CustomerException customerException) {
	 * System.out.println("customer Exception catch block"); }catch (Customer
	 * customer){ System.out.println("customer catch block"); } } } class
	 * CustomerException extends Exception{ } class Customer extends
	 * CustomerException{ }
	 */


		public static void main(String[] args) {
			String s1= new String ("Welcome");
			String s2="Welcome";
			if (s1==s2) {
			System.out.println("Welcome");
			}
			}
			}

	
	
	
	
	
//}

package tw.leonchen.flowcontrol;

import java.util.Scanner;

public class LeapYear {

   
 public static void main(String[] args) {
 System.out.println("");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 if(a%4==0){
 if(a%100==0 && a%400==0){
 System.out.println("閏年");
 }
 else{
 System.out.println("不是閏年");
 }
 
 }
 
 else{
 System.out.println("不是閏年");
 }
 
 }
 
}
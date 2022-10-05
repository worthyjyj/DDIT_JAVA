package z_homework.work06;

public class Plane {
 private String manufacturer; //제작사
 private String model; //비행기 모델명
 private int maxNumberOfPassengers; //최대 승객수
 private static int numberOfPlanes=0; //지금까지 생성된 비행기의 객체 수 
 //객체가 생성될 때마다 생성자에서 증가시켜줌 
 
 public Plane(){
	 numberOfPlanes++; 
 }
 
public Plane(String manufacturer, String model, int maxNumberOfPassengers){
	 this.manufacturer = manufacturer;
	 this.model = model;
	 this.maxNumberOfPassengers = maxNumberOfPassengers; 
	 numberOfPlanes++; 
 }

 /**
  * set
  * @param a
  */
 public void setmanufacturer(String a) {
	this.manufacturer = a;
 }
 
 public void setmodel(String b) {
	 this.model = b; 
 }
 
 public void setmaxNumberOfPassengers(int c) {
	 this.maxNumberOfPassengers = c;
 }
 
 /**
  * get
  */
 public String getmanufacturer() {
	 return manufacturer;
 }
 
 public String getmodel() {
	 return model;
 }
 
 public int getmaxNumberOfPassengers() {
	 
 if(this.maxNumberOfPassengers<0) {
	 this.maxNumberOfPassengers =0; 
	 return maxNumberOfPassengers;
 }
 return this.maxNumberOfPassengers;
 }
 
 
 static public int getNumberOfplanes() {
	 return numberOfPlanes;
 }
 
 public static void main(String[] args) {
	 Plane plane1 = new Plane("보잉", "보잉 747",450);
	 System.out.println("제조사: "+plane1.getmanufacturer());
	 System.out.println("모델명: "+plane1.getmodel());
	 System.out.println("최대 승객수: "+plane1.getmaxNumberOfPassengers());
	 System.out.println();
	 
	 Plane plane3 = new Plane();
	 plane3.setmanufacturer("록히드 마틴");
	 plane3.setmodel("F-22");
	 plane3.setmaxNumberOfPassengers(-10);
	
	 System.out.println("제조사: "+plane3.getmanufacturer());
	 System.out.println("모델명: "+plane3.getmodel());
	 System.out.println("최대 승객수: "+plane3.getmaxNumberOfPassengers());
	 System.out.println();
	 
	 System.out.println("생산된 비행기의 수: " + Plane.getNumberOfplanes());
 }
}

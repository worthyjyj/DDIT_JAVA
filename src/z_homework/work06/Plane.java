package z_homework.work06;

public class Plane {
 String manufacturer;
 String model; 
 int maxNumberOfPassengers;
 static int numberOfPlanes;
 
 Plane(){
	 manufacturer="0";
	 model="0";
	 maxNumberOfPassengers=0;
	 numberOfPlanes=0; 
 }
 
 Plane(String manufacturer, String model, int maxNumberOfPassengers){
	 this.manufacturer = manufacturer;
	 this.model = model;
	 this.maxNumberOfPassengers = maxNumberOfPassengers; 
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
 //여기서부터 모르겟음 
// public int getNumberOfplanes() {
//	 NumberOfplanes = //객체가 생성될 때마다 
//	 return NumberOfplanes;
// }
 
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
	 
 }
}

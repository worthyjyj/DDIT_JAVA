package c_statement;

public class C_CountingStars {

	public static void main(String[] args) {
		System.out.println("-------------------------");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-------------------------");
		System.out.println("위의 별을 for문을 이용해 찍어보세요.");
		
		//2중 for문 사용
		for(int j = 1 ; j<=3 ; j++) {
			for(int i = 1 ; i<=5 ; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
		System.out.println("-------------------------");
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("-------------------------");
		System.out.println("위의 별을 for문을 이용해 찍어보세요.");
		
		
		for(int i =1 ; i <= 5; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	
		System.out.println("-------------------------");
		System.out.println("*****");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
		System.out.println("-------------------------");
		System.out.println("위의 별을 for문을 이용해 찍어보세요.");
		
		for(int i = 5 ; i <= 1; i--) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		//방법2 
		for(int i = 1 ; i <= 5; i++) {
			for(int j = 1 ; j <= 5 - (i-1) ; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		System.out.println("     *");
		System.out.println("    **");
		System.out.println("   ***");
		System.out.println("  ****");
		System.out.println("******");
		System.out.println("-------------------------");
		System.out.println("위의 별을 for문을 이용해 찍어보세요.");
		
		//방법1
	    for(int i = 1; i <=5 ; i++ ) {
	    	for(int j = i; j <=4 ; j++) {
	    		System.out.print(" ");
	    	}
	    	for(int j = 1 ; j <= i ; j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    
	    //방법2
	    
	    for(int i = 1; i <=5 ; i++) {
	    	for(int j = 1; j <= 5 ; j++) {
	    		if(j <= 5-i) {
	    			System.out.print(" ");
	    		}else {
	    			System.out.print("*");
	    		}
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("-------------------------");
		System.out.println("     *");
		System.out.println("    ***");
		System.out.println("   *****");
		System.out.println("  *******");
		System.out.println("*********");
		System.out.println("-------------------------");
		System.out.println("위의 별을 for문을 이용해 찍어보세요.");
		
		//숙제  
		for(int i = 1; i <=9 ; i+=2 ) {
			 for(int j = i; j <= 9-1 ; j+=2) {
		    		System.out.print(" ");
		    	}
		    	for(int j = 1 ; j <= i ; j++) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		}
		
//		for(int i = 1 ; i <=9 ; i++) {
//			for(int j = , )
//		}
	}
}

package Pra.Porgrammes;

public class FindMaxNumberFromArray {

	public static void main(String[] args){
/*
        int[] a = {10, 45, 552, 133, 4444, 68};

        int max = a[0];

        for(int i = 0; i <a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        System.out.println(max);*/
		
		
		
		
		int [] value = {20,90,60,100};
		
		int maxValue = value[0];
		for(int i =0; i<value.length; i++) {
			
			if(value[i]> maxValue) {
				
				maxValue = value[i];}					
			
		}
		
		System.out.println(maxValue);

    }
	
	
	
}


package lesson8;

public class AvgMaxMin {
		//instance variables
		private int numbers[];
		private double avg;
		private int max;
		private int min;
		
		//create a constructor
		public AvgMaxMin() {
			
		}

		//setter
		public void setNumbers(int numbers[]) {
			this.numbers = numbers;
		}
		
		//calculate
		public void calculateAvg() {
			int sum = 0;
			for(int i = 0; i < numbers.length; i++ ) {
				//to calculate sum, we update the previous value of sum by adding a new element located at the index[i]
				sum = sum + numbers[i];
			}
			avg = (double) sum/numbers.length;
		}
		
		
		public int calculateMax() {
			max = numbers[0];
			for(int i = 1; i < numbers.length; i++ ) {
				//if an array element is larger than current value of max, we assign this new element value to max. 
				if(numbers[i] > max) {
					max = numbers[i];
				}
			}
			return max;
		}
		
		
		public int calculateMin() {
			min = numbers[0];
			for(int i = 1; i < numbers.length; i++) {
				//if an array element is smaller than current value of min, we assign this new element value to min.
				if(numbers[i] < min) {
					min = numbers[i];
				}
			}
			return min;
		}
		
		
		
		//getters
		public double getAvg() {
			return avg;
		}

		
		public int getMax() {
			return max;
		}


		public int getMin() {
			return min;
		}

		
		
		 
		
}

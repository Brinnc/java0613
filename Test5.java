class Test5{
	public static void main(String[] args){
		/*
		for(int i=1; i<=10; i++){
			if(i<=5){
				System.out.print("¡Ù");
			}else{
				System.out.print("¡Ú");
			}
		*/

			for(int i=1; i<=10; i++){
				
				char star=(i>=5)? '¡Ú':'¡Ù';

				System.out.print(star);
			}
		}
	}
}
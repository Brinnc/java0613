class Test5{
	public static void main(String[] args){
		/*
		for(int i=1; i<=10; i++){
			if(i<=5){
				System.out.print("��");
			}else{
				System.out.print("��");
			}
		*/

			for(int i=1; i<=10; i++){
				
				char star=(i>=5)? '��':'��';

				System.out.print(star);
			}
		}
	}
}
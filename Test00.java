class Test00{
	//main메서드는 개발자가 정의하지 않는 즉 이미 자바 언어에서 정해놓은 실행부 함수임
	//따라서 매개변수 유형조차 이미 정해져있다
	//이 예제에선 메인 메서드의 매개변수 역할을 알아본다
	//main() 메서드는 직접 호출이 불가하며, 메인 메서드를 호출하디 위해서는
	//오직 java.exe에 의해 호출된다
	//ex) java 쿨래스명 문자열1, 문자열2, 문자열3...
	public static void main(String[] args){
		System.out.println("당신이 실행 시 넘긴 매개변수의 수는 "+args.length);

		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
	}
}
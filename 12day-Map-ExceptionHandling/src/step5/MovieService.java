package step5;

public class MovieService {

	public void enter(int age) throws AgeException{
		try{
			if(age < 19) { //특정상황
		
			/*
			 * age < 19일 경우엔 excpetion 실행, 아래 method 구문은 실행되지 않는다.
			 */
			throw new AgeException(age+"세 미성년이므로 영화관람이 불가능합니다");
			//throw 사용자 정의 exception
		}
		}finally{
			System.out.println("finally 구문이 실행되었습니다");
		}
		System.out.println("정상적으로 영화를 보실 수 있습니다.");
	}
	
}

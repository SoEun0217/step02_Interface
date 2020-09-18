package board;
/**
 * 여러사람들이 작업할 때 공통의 규격서를 제공하고자 함*/

public interface BoardIneterface {
	/***
	 * 등록
	 */
	boolean insert (Board board);
	
	/*
	 * 글번호에 해당하는 레코드 검색하기
	 * **/
	Board selectByNo(int no);
	////////////////////////////////
	/**
	 * java1.8 version추가-interface영역에
	 * 1)default메소드
	 *  -기능구현가능
	 *  -반드시 구현객체가 있어야만 접근가능
	 *  
	 *  2)static 메소드
	 *  -기능구현가능
	 *  -구현객체없이 interface이름.메소드이름() 으로 접근가능
	 *  
	 *  *추가된 이유
	 *     :이미 개발 된 상태에서 유지보수 할 때특 정 구현객체에만 필요한
	 *     메소드를 정의하고 싶을 때 static or default메소드를 이용하면
	 *     모든 구현체가 재정의 할 필요없이 필요한 곳에서 재정의 하거나 
	 *     그 기능을 그냥 사용하면된다.
	 * 
	 */
	
	
	
	
	
	/*
	 * 삭제
	 * */
	default boolean delete(int no) {
		System.out.println("BoardInterfacee 의 delete(int no)호출됨");
		return false;		
	}
	
	/**
	 * 
	 * 수정*/
	static boolean update(Board board) {
		System.out.println("BoardInterfacee update  의 호출됨(int no)호출됨");
		return true;
	}
	
	
}

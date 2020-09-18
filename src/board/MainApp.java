package board;

public class MainApp {

	public static void main(String[] args) {
		
		//호출해보자
		//필드를 이용한 다형성
		BoardIneterface board=null;
		
		board=new QABoardImpl();//필드의 다형성
		test(board);//매개변수의 다형성
		
		System.out.println("***********");
		board=new FreeBoardImpl();
		test(board);
		System.out.println("***********");
		board=new UploadBoardImpl();
		test(board);
		
		

	}

	/**
	 * 매개변수(인수)를 이용한 다형성
	 */
	public static void test(BoardIneterface board) {
		board.insert(new Board());
		board.selectByNo(10);
		board.delete(10);
		BoardIneterface.update(new Board());
	}
	
	
	
	
}

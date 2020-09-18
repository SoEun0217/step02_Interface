package board;

public class MainApp {

	public static void main(String[] args) {
		
		//ȣ���غ���
		//�ʵ带 �̿��� ������
		BoardIneterface board=null;
		
		board=new QABoardImpl();//�ʵ��� ������
		test(board);//�Ű������� ������
		
		System.out.println("***********");
		board=new FreeBoardImpl();
		test(board);
		System.out.println("***********");
		board=new UploadBoardImpl();
		test(board);
		
		

	}

	/**
	 * �Ű�����(�μ�)�� �̿��� ������
	 */
	public static void test(BoardIneterface board) {
		board.insert(new Board());
		board.selectByNo(10);
		board.delete(10);
		BoardIneterface.update(new Board());
	}
	
	
	
	
}

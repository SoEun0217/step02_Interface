package board;

public class FreeBoardImpl implements BoardIneterface {

	@Override
	public boolean insert(Board board) {
		System.out.println("FreeBoardImpl�� insert�Դϴ�.");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println("FreeBoardImpl�� selectByNo�Դϴ�.");
		return null;
	}
	@Override
	public boolean delete(int no) {
		System.out.println("FreeBoardImp�� delete ȣ���");
		return true;
	}

}

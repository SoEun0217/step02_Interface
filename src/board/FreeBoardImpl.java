package board;

public class FreeBoardImpl implements BoardIneterface {

	@Override
	public boolean insert(Board board) {
		System.out.println("FreeBoardImpl의 insert입니다.");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println("FreeBoardImpl의 selectByNo입니다.");
		return null;
	}
	@Override
	public boolean delete(int no) {
		System.out.println("FreeBoardImp의 delete 호출됨");
		return true;
	}

}

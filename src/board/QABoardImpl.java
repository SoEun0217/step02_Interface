package board;

public class QABoardImpl implements BoardIneterface {

	@Override
	public boolean insert(Board board) {
		System.out.println("QABoardImpl의 insert입니다.");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println("QABoardImpl의 selectByNo입니다.");
		return null;
	}

}

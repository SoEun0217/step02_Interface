package board;
/**
 * ����������� �۾��� �� ������ �԰ݼ��� �����ϰ��� ��*/

public interface BoardIneterface {
	/***
	 * ���
	 */
	boolean insert (Board board);
	
	/*
	 * �۹�ȣ�� �ش��ϴ� ���ڵ� �˻��ϱ�
	 * **/
	Board selectByNo(int no);
	////////////////////////////////
	/**
	 * java1.8 version�߰�-interface������
	 * 1)default�޼ҵ�
	 *  -��ɱ�������
	 *  -�ݵ�� ������ü�� �־�߸� ���ٰ���
	 *  
	 *  2)static �޼ҵ�
	 *  -��ɱ�������
	 *  -������ü���� interface�̸�.�޼ҵ��̸�() ���� ���ٰ���
	 *  
	 *  *�߰��� ����
	 *     :�̹� ���� �� ���¿��� �������� �� ��Ư �� ������ü���� �ʿ���
	 *     �޼ҵ带 �����ϰ� ���� �� static or default�޼ҵ带 �̿��ϸ�
	 *     ��� ����ü�� ������ �� �ʿ���� �ʿ��� ������ ������ �ϰų� 
	 *     �� ����� �׳� ����ϸ�ȴ�.
	 * 
	 */
	
	
	
	
	
	/*
	 * ����
	 * */
	default boolean delete(int no) {
		System.out.println("BoardInterfacee �� delete(int no)ȣ���");
		return false;		
	}
	
	/**
	 * 
	 * ����*/
	static boolean update(Board board) {
		System.out.println("BoardInterfacee update  �� ȣ���(int no)ȣ���");
		return true;
	}
	
	
}

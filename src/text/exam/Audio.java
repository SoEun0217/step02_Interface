package text.exam;

public class Audio extends Elct implements ElectFunction {
	private int volumn;

	public Audio() {
	}

	public Audio(int volunmn) {
		this.volumn = volunmn;
	}

	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	public void start() {
		//getClass().getName()Ŭ���� �̸� �������Ե�
		//�ƾ� ��ŸƮ�� print�ع��������ִ�.
		//System.out.println(getCode()+"��"+getClass().getName()+"��"+volumn+"���� ��´�.");
		this.display();
	}

	public void stop() {
	}

	public void display() {
		System.out.println(toString());
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getCode());
		sb.append("��ǰ Audio��");
		sb.append(volumn);
		sb.append("���� ��´�.");
		return sb.toString();
	}

}

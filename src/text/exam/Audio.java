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
		//getClass().getName()클래스 이름 가져오게됨
		//아얘 스타트에 print해버릴수도있다.
		//System.out.println(getCode()+"의"+getClass().getName()+"를"+volumn+"으로 듣는다.");
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
		sb.append("제품 Audio를");
		sb.append(volumn);
		sb.append("으로 듣는다.");
		return sb.toString();
	}

}

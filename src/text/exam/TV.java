package text.exam;

public class TV extends Elct implements ElectFunction {
	private int channel;

	public TV() {
	}

	public TV(int channel) {
		this.channel = channel;
	}

	public TV(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;
	}

	public void start() {
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
		sb.append("��ǰ TV��");
		sb.append(channel);
		sb.append("�� ����.");
		return sb.toString();
	}

}

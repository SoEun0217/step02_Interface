package text.exam;

public class MainApp {

	public static void main(String[] args) {
		// Tv 2�� , Audio 2�� �����ϰ� �� ������ ����Ѵ�.
		ElectFunction elec[] = new ElectFunction[5];

		elec[0] = new TV("A01", 500000, 12);
		elec[1] = new TV("A02", 2500, 20);
		elec[2] = new TV("A03", 3000, 30);

		elec[3] = new Audio("A04", 8500, 200);
		elec[4] = new Audio("A05", 700, 100);

		for (ElectFunction e : elec) {
			// e.start();
			System.out.println(e);
			//������ toString()�� �޼ҵ尡 ȣ��ȴ�.

		}

	}
}

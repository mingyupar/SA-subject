public class Bus extends PublicTransportation {
    public Bus(int busNum) {
        super.startOperation("운행");
        super.num = busNum;
        super.maxPassenger = 30;
        super.price = 1000;
        super.currentPassenger = 26;
        System.out.println(busNum + "번 버스가 생성되었습니다.");
    }
}

public class Student {
	//1번
	String studentName;
	int grade;
	int money;
	//2번
	public Student(String studentName, int money) {
		
		this.studentName = studentName;
		this.money = money;
	}
	//3번
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	//4번
	public void takeSubway(Subway subway) {
		subway.take(1200);
		money -= 1200;
	}
	//5번
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은 "+money+"입니다.");
	}

package kr.ac.smu.day02.Exam;

public class Exam_2 {

	public static void main(String[] args) {
		
		int second = 5600;
		int mili = second % 60;
		int minute = (second / 60) / 60;
		int hour = (second/60) % 60;
		
		System.out.print("��� ��� : " + hour + "�ð�" + minute + "��" + mili + "��");
	}
}

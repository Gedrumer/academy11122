package by.academy.classwork.lesson11;
//3.	�) ������� ������������, ���������� �������� ������ ����.

//�) ������� ���������� ���������� ���� ������� ����� ���� � ����������� ��� ���������� � ���. 
//�) ������� �����, ������� ��������� �� ���� ���������� ���������� ���� enum ����. ���� �������� ����� ����, ������� �� ������� �� ����� ���� � ��� ����� ���������� �������� switch.
//�) ������������ ������ ��������� ����������, ���������� ������� ����������� � ������ ������� ����.
//�) �������� ����������� ����������� �� ���� ������� �����������.
//�) ������� ����� getDescription, ������������ ������ ��������� ����� �����. �������������� ����� getDescription - ��� ��������� ���� ����� ������ ���������� ������� ����� �����.
//�) � ����� ����������� ��� ������� ����, ������� ����������� � �������� ������� ����.

public enum Year {
	Winter(-15 ) {
		@Override
		public void getDescription() {
			System.out.println("Cold season");
		}
		}, 
	Spring(15){
		@Override
		public void getDescription() {
			System.out.println("Cold season");
		}
		} ,
	Summer(26){
		@Override
		public void getDescription() {
			System.out.println("Warm season");
		}
		} ,
	Autumn(18){
		@Override
		public void getDescription() {
			System.out.println("Cold season");
		}
		};

	private String month;
	private int temp;
	Year() {
	}
	Year(int temp){
		this.temp=temp;
	}
	public int getTemp(){
		return temp;
	}
	public abstract void getDescription();
		
	

}

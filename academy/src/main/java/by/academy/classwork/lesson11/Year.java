package by.academy.classwork.lesson11;
//3.	а) Создать перечисление, содержащее названия времен года.

//б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем. 
//в) Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее Используем оператор switch.
//г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//д) Добавить конструктор принимающий на вход среднюю температуру.
//е) Создать метод getDescription, возвращающий строку “Холодное время года”. Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.

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

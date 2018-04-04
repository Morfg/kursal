/**
* Устанавливаем принадлежность класса к пакету
 */
package MainProject;
/**
* Добавляем библиотеку для исключения несуществующего файла
 */
import java.io.FileNotFoundException;
/**
* Добавляем библиотеку для сохранения файла
 */
import java.io.PrintWriter;
/**
* Подключаем библиотеку для работы с диалоговыми окнами
 */
import javax.swing.JOptionPane;

/**
 * Объявляем класс с модификатором public
 */
public class SaveFile {
	/**
	 * Метод SaveInFile для сохранения данных в файл
	 */
	public static void SaveInFile() {
		/**
		 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
		 * исключения try
		 */
		try {
			/**
			 * Создаем экземпляр указанного класса
			 */
			PrintWriter writer = new PrintWriter("Results.txt");
			/**
			 * Записываем общую информацию о комнате:
			 * -Общая площадь комнаты
			 * -Незанятая площадь в комнате
			 * -Количество объектов в комнате
			 */
			writer.println("======================="
					+"\nTOTAL AREA: " + place.totalarea + 
					"\nFREE AREA: " + place.freearea + 
					"\nAmount of objects: " + AmountObj.amount);
			
			/**
			 * Массив для перечисления объектов в комнате
			 */
			for (int i=1;i<=AmountObj.amount;i++) {
				/**
				 * Записываем информацию по каждому объекту:
				 * -Номер объекта
				 * -Ширина объекта
				 * -Длина объекта
				 * -Занимаемая площадь объектом
				 */
			writer.println(
					"=======================\nNumber Object:" + i + 
					"\nWidth: " + MainProject.Objects.Obj[i].width + 
					"\nLength: " + Objects.Obj[i].length + 
					"\nOccupies area: " + Objects.Obj[i].area);
			}
			/**
			 * Завершаем работату с файлом и 
			 * закрываем выходной поток. 
			 */
			writer.close();
			/**
			 * Диалоговое окно с информацией об успешном сохранении
			 */
	    	JOptionPane.showMessageDialog(null, "Сохранение выполнено успешно");
		} 
		/**
		 * Исключение catch
		 */
		catch (FileNotFoundException e) {
			/**
			 * Обрабатываем исключение типа FileNotFoundException e
			 */
			e.printStackTrace();
		}
		
	}
}

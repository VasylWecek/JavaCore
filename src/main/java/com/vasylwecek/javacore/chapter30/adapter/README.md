Шаблон проектирования: Адаптер (Adapter)
=
Шаблон "Адаптер" (Adapter) позволяет преобразовывать интерфейс одного класса в интерфейс другого класса, который необходим клиенту. Это обеспечивает совместную работу классов, интерфейсы которых не совместимы.
=
Цели:
=
Преобразование интерфейса одного класса в интерфейс другого класса, необходимого клиенту.
= 
Применение:
=
Когда интерфейс класса, который мы хотим использовать, не соответствует нашим потребностям.
=
Когда необходим класс, который должен взаимодействовать с классами, которые ему неизвестны или не связаны с ним.
=
Когда нужно использовать несколько существующих подклассов, но нецелесообразно создавать новые подклассы для использования их методов.
=
Логика работы адаптера:
=
Интерфейс DataBase: Определяет методы insert, update, select, remove для работы с базой данных.
=
Класс JavaAplication: Содержит методы saveObject, updateObject, loadObject, deleteObject для работы с объектами Java.
=
Класс AdapterJavaToDataBase: Наследует JavaAplication и реализует интерфейс DataBase. Он преобразует методы интерфейса DataBase в методы класса JavaAplication.
=
Класс DataBaseRunner: Демонстрирует использование адаптера для работы с базой данных через интерфейс DataBase.
=
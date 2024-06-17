import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import data.Student;
import data.StudentGroup;

public class App {
    private static List<Student> InitStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Роберт", "Колесников", "Станиславович", LocalDate.parse("2010-12-19")));
        students.add(new Student("Роман", "Гусев", "Платонович", LocalDate.parse("2009-04-08")));
        students.add(new Student("Ростислав", "Лаврентьев", "Митрофанович", LocalDate.parse("2007-01-11")));
        students.add(new Student("Гавриил", "Уваров", "Филиппович", LocalDate.parse("2005-05-14")));
        students.add(new Student("Пантелеймон", "Шестаков", "Антонинович", LocalDate.parse("2005-12-18")));
        students.add(new Student("Кассиан", "Кондратьев", "Митрофанович", LocalDate.parse("2001-02-01")));
        students.add(new Student("Варлаам", "Беспалов", "Денисович", LocalDate.parse("2006-02-27")));
        students.add(new Student("Илья", "Жуков", "Александрович", LocalDate.parse("2002-07-05")));
        students.add(new Student("Касьян", "Степанов", "Вячеславович", LocalDate.parse("2001-04-22")));
        students.add(new Student("Юстин", "Горшков", "Улебович", LocalDate.parse("2006-07-15")));
        students.add(new Student("Абрам", "Васильев", "Романович", LocalDate.parse("2010-08-29")));
        students.add(new Student("Аристарх", "Рожков", "Агафонович", LocalDate.parse("2008-04-08")));
        students.add(new Student("Даниил", "Маслов", "Филиппович", LocalDate.parse("2008-09-24")));
        students.add(new Student("Давид", "Абрамов", "Валентинович", LocalDate.parse("2004-10-29")));
        students.add(new Student("Савелий", "Кудряшов", "Данилович", LocalDate.parse("2005-11-25")));
        students.add(new Student("Любомир", "Рыбаков", "Эдуардович", LocalDate.parse("2010-08-10")));
        students.add(new Student("Всеволод", "Мамонтов", "Владленович", LocalDate.parse("2009-10-03")));
        students.add(new Student("Тимур", "Волков", "Онисимович", LocalDate.parse("2007-10-26")));
        students.add(new Student("Устин", "Калинин", "Всеволодович", LocalDate.parse("2000-08-04")));
        students.add(new Student("Роман", "Рыбаков", "Федорович", LocalDate.parse("2004-04-29")));
        students.add(new Student("Родион", "Зыков", "Константинович", LocalDate.parse("2007-03-06")));
        students.add(new Student("Вольдемар", "Борисов", "Евгеньевич", LocalDate.parse("2001-07-18")));
        students.add(new Student("Соломон", "Котов", "Агафонович", LocalDate.parse("2002-07-22")));
        students.add(new Student("Архип", "Кулаков", "Валерьевич", LocalDate.parse("2006-06-27")));
        students.add(new Student("Соломон", "Никифоров", "Мэлсович", LocalDate.parse("2000-10-26")));
        return students;
    }

    public static void main(String[] args) throws Exception {

        List<Student> students = InitStudents();
        List<Student> students2 = students.subList(0, 5);

            
        System.out.println(students2);
            
        //StudentGroup studGroup_01 = ;


    }
}

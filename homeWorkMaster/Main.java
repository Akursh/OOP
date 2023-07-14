package homeWorkMaster;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person zina = new Person("Зина",Sex.woman, LocalDate.of(1946,9,12));
        Person egor = new Person("Егор",Sex.man, LocalDate.of(1956,8,27) );
        Person katy = new Person("Катя", Sex.woman, LocalDate.of(1976,11,2));
        Person fedor = new Person("Федор",Sex.man, LocalDate.of(1984,3,7));
        Person elena = new Person("Елена",Sex.woman, LocalDate.of(1986,3,17));
        Person igor = new Person("Игорь",Sex.man,LocalDate.of(1977,4,22));
        Person zeny = new Person("Женя",Sex.woman, LocalDate.of(2000,3,7));
        Person vova = new Person("Вова",Sex.man, LocalDate.of(2005,11,3));
        FamilyTree gt = new FamilyTree();
        gt.appendPerentChild(zina, elena); // Зина - елена
        gt.appendPerentChild(egor, elena); // Егор - елена
        gt.appendPerentChild(katy, igor); // Катя - игорь
        gt.appendPerentChild(fedor, igor); // Федор - игорь
        gt.appendVifeHusbent(elena, zeny); // Елена - женя
        gt.appendPerentChild(igor, zeny); // Игорь - женя
        gt.appendPerentChild(elena, vova); // Елена - вова
        gt.appendPerentChild(igor, vova); // Игорь - вова
          

        // дети Зины
        System.out.println("Дети Зины");
        System.out.println(new Research(gt).spend(zina, Relationship.parent));
        //  дети Игоря
        System.out.println("Дети Игоря");
        System.out.println(new Research(gt).spend(igor, Relationship.parent));

        //  мужа Зины  
        System.out.println("Муж Ирины");
        System.out.println(new Research(gt).spend(zina, Relationship.wife));

        // с определенным возрастом
        System.out.println(new Research(gt).searchAge());
    }
}
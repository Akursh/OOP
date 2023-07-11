package homeWorkMaster;

public class Main {
    public static void main(String[] args) {
        Person zina = new Person("Зина",60);
        Person egor = new Person("Егор", 60);
        Person katy = new Person("Катя", 56);
        Person fedor = new Person("Федор", 55);
        Person elena = new Person("Елена", 33);
        Person igor = new Person("Игорь",35);
        Person zeny = new Person("Женя", 1);
        Person vova = new Person("Вова", 2);
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
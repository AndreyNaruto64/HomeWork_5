import java.util.Arrays;

public class Office {
    static int AGE_MAX = 40;
    static final int WORKERS = 5;


    public static void main(String[] args) {


        OfficeUser oU1 = new OfficeUser("Дмитрий", "Дмитриевич", "Сидоров", "Главный инженер", 896354652, "d@mail.com", 60000, 48);
        OfficeUser oU2 = new OfficeUser("Иван", "Иванович", "Иванов", "Помощник инженер", 896354660, "N@mail.com", 25000, 25);
        OfficeUser oU3 = new OfficeUser("Владимир", "Александрович", "Морозов", "Директор", 896354628, "V@mail.com", 250000, 58);
        OfficeUser oU4 = new OfficeUser("Петр", "Петрович", "Петров", "Секретарь", 896354635, "P@mail.com", 30000, 28);
        OfficeUser oU5 = new OfficeUser("Анатолий", "Анатольевич", "Анатольев", "Младший программист", 896354699, "A@mail.com", 40000, 26);


        OfficeUser[] users = new OfficeUser[WORKERS];
        users[0] = new OfficeUser("Дмитрий", "Дмитриевич", "Сидоров", "Главный инженер", 896354652, "d@mail.com", 60000, 48);
        users[1] = new OfficeUser("Иван", "Иванович", "Иванов", "Помощник инженер", 896354660, "N@mail.com", 25000, 25);
        users[2] = new OfficeUser("Владимир", "Александрович", "Морозов", "Директор", 896354628, "V@mail.com", 250000, 58);
        users[3] = new OfficeUser("Петр", "Петрович", "Петров", "Секретарь", 896354635, "P@mail.com", 30000, 28);
        users[4] = new OfficeUser("Анатолий", "Анатольевич", "Анатольев", "Младший программист", 896354699, "A@mail.com", 40000, 26);


        System.out.println(Arrays.toString(users)); //Вывод массива
        System.out.println(" ");
        System.out.println("oU1 = " + oU1); // Вывод отдельно каждого работника
        System.out.println("oU2 = " + oU2);
        System.out.println("oU3 = " + oU3);
        System.out.println("oU4 = " + oU4);
        System.out.println("oU5 = " + oU5);

        System.out.println(" ");

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() >= AGE_MAX) {

                System.out.println(users[i]);
            }
        }


    }

}

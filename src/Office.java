import java.util.Arrays;

public class Office {
    static int AGE_MAX = 40;
    static final int WORKERS = 5;


    public static void main(String[] args) {


        OfficeUser oU1 = new OfficeUser("Äìèòðèé", "Äìèòðèåâè÷", "Ñèäîðîâ", "Ãëàâíûé èíæåíåð", 896354652, "d@mail.com", 60000, 48);
        OfficeUser oU2 = new OfficeUser("Èâàí", "Èâàíîâè÷", "Èâàíîâ", "Ïîìîùíèê èíæåíåð", 896354660, "N@mail.com", 25000, 25);
        OfficeUser oU3 = new OfficeUser("Âëàäèìèð", "Àëåêñàíäðîâè÷", "Ìîðîçîâ", "Äèðåêòîð", 896354628, "V@mail.com", 250000, 58);
        OfficeUser oU4 = new OfficeUser("Ïåòð", "Ïåòðîâè÷", "Ïåòðîâ", "Ñåêðåòàðü", 896354635, "P@mail.com", 30000, 28);
        OfficeUser oU5 = new OfficeUser("Àíàòîëèé", "Àíàòîëüåâè÷", "Àíàòîëüåâ", "Ìëàäøèé ïðîãðàììèñò", 896354699, "A@mail.com", 40000, 26);


        OfficeUser[] users = new OfficeUser[WORKERS];
        users[0] = new OfficeUser("Äìèòðèé", "Äìèòðèåâè÷", "Ñèäîðîâ", "Ãëàâíûé èíæåíåð", 896354652, "d@mail.com", 60000, 48);
        users[1] = new OfficeUser("Èâàí", "Èâàíîâè÷", "Èâàíîâ", "Ïîìîùíèê èíæåíåð", 896354660, "N@mail.com", 25000, 25);
        users[2] = new OfficeUser("Âëàäèìèð", "Àëåêñàíäðîâè÷", "Ìîðîçîâ", "Äèðåêòîð", 896354628, "V@mail.com", 250000, 58);
        users[3] = new OfficeUser("Ïåòð", "Ïåòðîâè÷", "Ïåòðîâ", "Ñåêðåòàðü", 896354635, "P@mail.com", 30000, 28);
        users[4] = new OfficeUser("Àíàòîëèé", "Àíàòîëüåâè÷", "Àíàòîëüåâ", "Ìëàäøèé ïðîãðàììèñò", 896354699, "A@mail.com", 40000, 26);


        oU1.print();
        System.out.println(" ");
        oU2.print();
        System.out.println(" ");
        oU3.print();
        System.out.println(" ");
        oU4.print();
        System.out.println(" ");
        oU5.print();
        System.out.println(" ");


        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() >= AGE_MAX) {

                System.out.println(users[i]);
            }
        }


    }

}

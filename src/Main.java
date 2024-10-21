import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> listaSvihStudenata = new ArrayList();
        ArrayList<Student> listaKojiSuPolozili = new ArrayList();

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Unesi podatke studenta: ");
            System.out.println("(Ukoliko zelite da prekinete unos, unesite rec 'quit'.)");
            System.out.println("Ime: ");
            String ime = scanner.nextLine();
            if (ime.equals("quit")) {
                break;
            }
            System.out.println("Prezime: ");
            String prezime = scanner.nextLine();
            if (prezime.equals("quit")) {
                break;
            }
            System.out.println("Ocena: ");
            String ocenaString = scanner.nextLine();
            if (ocenaString.equals("quit")) {
                break;
            }
            int ocena = Integer.valueOf(ocenaString);

            Student student = new Student(ime, prezime, ocena);
            listaSvihStudenata.add(student);
            System.out.println("Student " + ime + " " + prezime + " je unet u listu svih studenata.");
        }

        for (int i = 0; i < listaSvihStudenata.size(); i++) {
            Student student = listaSvihStudenata.get(i);
            if (student.ocena > 5) {
                listaKojiSuPolozili.add(student);
            }
        }


        System.out.println("Lista svih studenata: ");
        for (Student a : listaSvihStudenata) {
            System.out.println(a);
        }

        System.out.println("");
        System.out.println("Lista studenata koji su polozili ispit: ");
        for (Student a : listaKojiSuPolozili) {
            System.out.println(a);
        }
    }
}

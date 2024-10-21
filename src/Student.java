public class Student {

    //polja
    private String ime;
    private String prezime;
    public int ocena;


    //konstruktori
    public Student() {

    }

    public Student(String ime, String prezime, int ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocena=" + ocena +
                '}';
    }
}
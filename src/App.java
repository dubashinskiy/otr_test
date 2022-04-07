import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        String inputFileName = "D:\\Projects\\otp\\eaist\\test\\src\\text";
        ArrayList<String> list = new ArrayList();
        ArrayList<Person> listPerson = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < list.size(); i += 4) {
            Person person = new Person();

            person.setFamily(list.get(i));
            person.setName(list.get(i + 1));
            person.setOtch(list.get(i + 2));
            person.setAge(list.get(i + 3));

            listPerson.add(person);
        }

        listPerson.stream()
                .sorted(new PersonComparator())
                .forEach(s-> System.out.println(s));
    }
}

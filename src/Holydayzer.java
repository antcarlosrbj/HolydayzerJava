import java.util.Objects;

public class Holydayzer {
    String[] date = new String[]{"01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023", "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023"};
    String[] holyday = new String[]{"Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Natal"};
    int listSize = 11;

    public String search(String searchedDate) {
        for (int i = 0; i < listSize; i++) {
            if (Objects.equals(searchedDate, date[i])) {
                return "No dia " + date[i] + " é " + holyday[i];
            }
        }
        return "Não há nenhum feriado no dia " + searchedDate;
    }

    public String[] allHolidays() {
        String[] listOfHolidays = new String[listSize];
        for (int i = 0; i < listSize; i++)
            listOfHolidays[i] = (date[i] + " => " + holyday[i]);
        return listOfHolidays;
    }
}

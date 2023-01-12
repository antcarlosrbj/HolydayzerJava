public class App {
    public static void main(String[] args) throws Exception {

        String searchedDate = "01/01/2023";

        Holydayzer holydayzer = new Holydayzer();
        System.out.println(holydayzer.search(searchedDate));
    

        String[] allHolidays = holydayzer.allHolidays();
        System.out.println("\nEsses são todos os feriados cadastrados:\n");
        for (String s:allHolidays)
            System.out.println(s);
    }
}

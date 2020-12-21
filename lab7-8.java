package HomeWork;
import java.util.ArrayList;
import java.io.*;
public class lab7 {
    public static void main(String[] args) {
        ArrayList<String> FIO = new ArrayList<String>();
        String[] fio = new String[7];
    FIO.add("Су-ян-ся Никита Дмитриевич");
    FIO.add("Могунов Валерий Вячеславович");
    FIO.add("Ибрагимова Анастасия Тарасовна");
    FIO.add("Собитова Нелли Фаруховна");
    FIO.add(1,"Утин Гладимир Владимирович");
    FIO.add("Политик Фигурантович Новичков");
        System.out.println(FIO.get(1));
        FIO.remove("Политик Фигурантович Новичков");
        for(int i = 0;i<FIO.size();i++)System.out.println(FIO.get(i));
        System.out.println("////////////////////////");
        Object[] fiol = FIO.toArray();
        for(Object count : fiol){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        try{
            FileWriter writer = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\lab78\\src\\HomeWork\\zapiska.txt", true);

            // запись всей строки
            writer.append("\n");
            writer.append("Купить:");
            String text = "Хлеб,молоко,трусы";
            writer.write(text);
            // запись по символам
            writer.append('.');
            writer.append('\n');
            writer.append("Список закончен.");
            writer.append("\n");
            writer.write("И зубной пасты");




            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\lab78\\src\\HomeWork\\zapiska.txt");
            System.out.println("////////////////////////");
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                //System.out.print(" c= "+c);// Если добавить данну строчку мы увидим Unicode символов
                System.out.print((char)c);

            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());


        }

    }
}

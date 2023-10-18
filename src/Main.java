import java.util.ArrayList;
import java.util.Arrays;
//google.com 123.43.215.2:3000
//127.0.0.1:2050/sendMessage
//127.0.0.1:2050/getMessage
//127.0.0.1:1500/start




public class Main {
    public static void main(String[] args) {
        String[] data = new String[6];
//        data[0] = "12.06.2024-happyBirthday";
//        data[1] = "25.12.2023-christmas";
//        data[2] = "12.06.23-none";
//        data[3] = "1.08.2023-hospital";
//        data[4] = "14.08.2023-none";
//        data[5] = "15/08/2023-uviley";
//        data[0] = "5-4"; // 44444
//        data[1] = "3-2"; // 222
//        data[2] = "4-1"; // 1111
//        data[3] = "10-1"; // 1111111111
//        data[4] = "2-4";
//        data[5] = "1-6";

        data[0] = "asdf12345"; // 44444
        data[1] = "sdgfdsfg435"; // 222
        data[2] = "lkj3524LFHlkj456JK45"; // 1111
        data[3] = "sdfgsdfg45645"; // 1111111111
        data[4] = "547634dfgsf456456";
        data[5] = "34534dsfgdsfgdfg";
//        массиви string boolean number function class variables

//        интернет (поставщик 5000)
//        менеджер - 100 в день 10 000 - 2
//            1-2дня - 5000
//            Парсинг - отримання і обробка данних з подальшим занесенням цих данних кудись

//        cold call manager - number
        // olx, izi prom.ua+rozetka + shafa = evo kabanchik sell clother b|u dyt credyt
//        sell buisness
//        number phone , name, lastname, city // 30 000 - 3 dni - 5000
//        hot ... manager
//        Analyze data (tonny)
//        . . .  . 1000 000 a1, c3, c2
//        ---- 40%
//                |
//                |
//                |
//        60%
//        Change 5000 => 3215
        String[] sentences = {"dom.", "Програмування 5000 це цікаво.", "Я 12 люблю 5000 Java.", "Студенти вчаться 500 програмувати.",
                "Робота 500000 з рядками може бути викликом.", "Java 125000 дозволяє створювати потужні 10 14 програми."};

//        String[] strings = { "04312-hlole",  "2310-emho", "1032-tsra"};
        String[] strings = { "021f4577877-min",  "2145a5874452-MAX", "1227777777777715g521-MIN"}; // 0-8  1-8  1-5
        String[] strings2 = { "34-54/32)12*45", "34-102/412(12/12", "34*7656/2&45*45"}; // 0-8  1-8  1-5
        String[] strings3 = {
                "stas-23-football-male-ukraine",
                "olga-21-music&football-female&music-Germany",
                "oleg-20-football-male-france",
                "anna-22-reading-female-GERMANY",
                "john-23-music&swimming&music-male-GERMANY",
                "sarah-24-dancing-female-australia",
                "mike-23-gaming-male-germany",
                "lucy-21-painting-female-ireland",
                "tom-22-music-male-uk",
                "jane-20-hiking-female-netherlands",
                "paul-27-music-male-sweden",
                "emily-26-photography-female-denmark",
                "steve-21-music-male-norway",
                "mary-28-yoga-female-finland",
                "david-30-fishing-male-belgium",
                "linda-29-music-female-switzerland",
                "robert-31-golf-male-austria",
                "nancy-32-knitting-female-portugal",
                "james-33-music-male-greece",
                "karen-34-gardening-female-germany",
                "william-35-cycling-male-sweden",
                "susan-36-pottery-female-ireland"
        };

//        tsra
//        1032

//   !!!   country !!!


//                checkdata(data);
//        countwords(sentences);
//        longSentence(sentences);
//        changeWord(sentences);
//        spaces(sentences);
//        changeDot(sentences);
//        showSentences(sentences);
//        changeNumbers(sentences);
//        countNumbers( data);
        //countSentences(data);
      //  shownumber( strings);
        //biggestNumber( strings2);
        //showPeople( strings3);
        //age( strings3);
        //countpersons(strings3);
        homework(names);


    }
//    amount
//    child do 16
//    mol 16-25
//    ser 26-50
//    star 50-100
//    ** %
static String[][] names = {
        {"Alex", "Bob", "Stepan"},
        {"Olga", "Matvii"},
        {"Bob", "Alex", "Ivan"}
};

    //show 3 name small Bob Olga Bob
 //...
//         for (int i = 0; i < names.length; i++){
//...
  //      for (int j = 0; j < names[i].length; j++){
    //...
      //      if (names[i][j].equals("34")) {
        //...
         //   }
        //}
   // ...
    //}
//...
  //  iteration ...1 ...2 ...3 ...4
    public static void homework(String [][] names){   // ФУНКЦІЯ НЕ ВИКЛИКАЄТЬСЯ
      for (int i = 0; i < names.length; i++){
          String shortestName = names[i][0];
          for (int j = 0; j < names[i].length;j++){
              if (names[i][j].length() < shortestName.length()) {
                  shortestName = names[i][j];
              }
          }
          System.out.println(shortestName);
      }

    }

public static void countpersons(String[] strings3 ) {
    int children = 0;
    int young = 0;
    int middleAged = 0;
    int oldPerson = 0;
    for(String person : strings3){
        String[] split = person.split("-");
        if(Integer.parseInt(split[1]) < 16){
            children++;
        }



        if(Integer.parseInt(split[1]) > 16 && Integer.parseInt(split[1]) < 25){
            young++;
        }
        if(Integer.parseInt(split[1]) > 25 && Integer.parseInt(split[1]) < 50){
            middleAged++;
        }
        if(Integer.parseInt(split[1]) > 50 && Integer.parseInt(split[1]) < 100){
            oldPerson++;
        }
    }
    System.out.println("children : " + children + "\n young : " + young + "\n middle aged :" + middleAged + "\n old person : " + oldPerson);

    }
    public static void age( String[] data) {
        int allAge = 0;
        for(String people : data){
            int age = Integer.parseInt(people.split("-")[1]);
            allAge += age;
        }

        System.out.println(allAge/data.length);

    }
    public static void checkdata(String[] data) {
        for (String dates : data) {
            int currentDay = 16;
            int currentMonth = 8;
            int currentYear = 2023;
            String holiday;

//            "15.12.201-none" -> ['15', '12', '201-none'] ['201', 'none']
            String result[];
            dates = dates.replaceAll("/", ".");
            result = dates.split("\\.");

//            if (dates.indexOf("/") >= 0) {
//                result = dates.split("/");
//            } else {
//            }

            holiday = result[2].split("-")[1];
            String year = result[2].split("-")[0];

            if (year.length() == 2) {
                year = "20" + year;
            }

            System.out.println(result[0] + " " + result[1] + " " + year);

            if (Integer.parseInt(year) > currentYear) {
                System.out.println("date will " + holiday);
            } else if (Integer.parseInt(year) == currentYear) {
                if (Integer.parseInt(result[1]) > currentMonth) {
                    System.out.println("date will " + holiday);
                }
                if (Integer.parseInt(result[1]) == currentMonth) {
                    if (Integer.parseInt(result[0]) > currentDay) {
                        System.out.println("date will " + holiday);
                    } else if (Integer.parseInt(result[0]) == currentDay) {
                        System.out.println("date is today " + holiday);
                    } else {
                        System.out.println("date is passed " + holiday);
                    }

                } else {
                    System.out.println("date is passed " + holiday);
                }
            } else {
                System.out.println("date is passed " + holiday);
            }


        }
    }

    //    'hello'
//    all: 5
//    last: 4
    public static void Checkwords(String[] sentences) {

        for (String sentence : sentences) {
            int index = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    index++;
                }

            }
            System.out.println(index + 1);
        }
    }

    public static void countwords(String[] sentences) {

        for (String sentence : sentences) {
            String[] split = sentence.split(" "); // 'hello superwow hi' ["hello", "superwow", 'hi']
            String big = "";
            for (String word : split) {
                if (word.length() > big.length()) {
                    big = word;
                }
            }
            System.out.println(big);
        }
    }

    public static void longSentence(String[] sentences) {     // речення яке має найбільшу кількість слів
        // 1. підрахувати кількість слів на один елемент
        // 2.порівняти кожний елемент масива по кількості слів  розбити по пробілах
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] spiltSentence = sentence.split(" ");
            if (spiltSentence.length > maxWords) {
                maxWords = spiltSentence.length;
            }

        }
        System.out.println(maxWords);
    }

    public static void changeWord(String[] sentences) {
        for (String sentence : sentences) {
            String newSentence = sentence.replaceAll("Java", "Python");
            System.out.println(newSentence);

        }
    }

    public static void spaces(String[] sentences) {
        for (String sentence : sentences) {
            String newS = "";
            // dom

            for (int i = sentence.length() - 1; i >= 0; i--) {
//                newS += sentence.charAt(i) + " ";
                System.out.println(sentence.charAt(i));
            }
            String replaceJava = sentence.replaceAll("Java", "JAVA");

//            System.out.println(newS + );
            System.out.println(sentence.replaceAll("", " ").trim().replaceAll("J a v a", "J A V A"));
        }
    }

    public static void changeDot(String[] sentences) {
        for (String sentence : sentences) {
            int a = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.substring(i, i + 1).matches("[0-9]")) {
                    a = 1;
                }

            }
            if (a == 1) {
                System.out.println(sentence);
            } else {
                System.out.println(sentence.replaceAll("\\.", "!"));
            }
        }
    }

    public static void showSentences(String[] sentences) {
        for (String sentence : sentences) {
            int x = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.substring(i, i + 1).matches("1") && sentence.substring(i + 1, i + 2).matches("0") &&
                        sentence.substring(i - 1, i).matches(" ") && sentence.substring(i + 2, i + 3).matches(" ")) {
                    x = 1;
                }
            }
//                210 10
            if (x == 1) {
                System.out.println(sentence);
            }

        }
    }

    public static void changeNumbers(String[] sentences) {               //  створюємо змінну флажок , проходимо через кожний елемент строчки
        //  ставимо умову якщо кожний наступний елемент строчки дорівнює 5 0 0 0
        //  замінюємо на 3 2 1 5
        // якщо змінна == 1 то виводимо речння
        // ЧОМУ НЕ ПРАЦЮЄ
        for (String sentence : sentences) {
            int a = 0;
            String newS = "";
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.substring(i, i + 1).matches("5") && sentence.substring(i - 1, i).matches(" ") && sentence.substring(i + 1, i + 2).matches("0") &&
                        sentence.substring(i + 2, i + 3).matches("0") && sentence.substring(i + 3, i + 4).matches("0") && sentence.substring(i + 4, i + 5).matches(" ")) {
                    System.out.println("150");
                    newS = sentence.replaceAll("5000", "3215");
                    a = 1;
                }
            }
//            if (7 > 6 && 3 > 5 && 500 > 900) {
//
//            }
            if (a == 1) {
                System.out.println(newS);
            }
        }
    }

    public static void countNumbers(String[] data) {
        for (String date : data) {
            String[] splitdate = date.split("-");
            int firstNumber = Integer.parseInt(splitdate[0]);
            int secondNumber = Integer.parseInt(splitdate[1]);
            for (int i = 0; i < secondNumber; i++) {
                System.out.println(firstNumber);
            }
        }
    }

    public static void countSentences(String[] data) {
        for (String date : data) {
            int letters = 0;
            int numbers = 0;
            for (int i = 0; i < date.length(); i++) {
                if (date.substring(i,i+1).matches("[a-zA-Z]") || date.substring(i, i+1).matches("[A-Z]")) {
                    letters++;
                }
                if (date.substring(i,i+1).matches("[0-9]")) {
                    numbers++;
                }
            }
            System.out.println("letters " + letters + "\n\r" + "numbers " + numbers);
        }
    }
    public static void encrypt( String[] strings){
        for(String string : strings){
            int numbers = 0;
            int letters = 0;
           String[] splitStrings =  string.split("-"); // ['02135', 'hlelo']
            String result = "";
            for(int i = 0; i < splitStrings[0].length();i++){
                // result += splitStrings[1].substring(splitStrings[1].substring(Integer.parseInt(splitStrings[0][i])), );


            }
        }
    }
    public static void shownumber(String[] strings){
        for(String string : strings){
            int max = 0;
            int min = 10;
            int countseven = 0;

            String[] split = string.split("-");
            for(int i = 0; i < split[0].length();i++){
                if(split[0].substring(i,i+1).equals("7")){
                    countseven++;
                }

                if(split[0].substring(i,i+1).matches("[a-zA-Z]") ){

                }
                else {
                    if (Integer.parseInt(split[0].substring(i, i + 1)) > max) {
                        max = Integer.parseInt(split[0].substring(i, i + 1));
                    }
                    if (Integer.parseInt(split[0].substring(i, i + 1)) < min) {
                        min = Integer.parseInt(split[0].substring(i, i + 1));
                    }

            }


        }
            if(split[1].equalsIgnoreCase("min")  ){
                System.out.println(min);
            }

             if(split[1].equalsIgnoreCase("max")){
                 System.out.println(max);
             }
            System.out.println("seven" + countseven);

    }
    }
    public static void biggestNumber(String[] strings2){
//        * / ( ) &
        for(String string : strings2){
            int bignumber = 0;
            String[] split = string.split("[-*&/()]");
            for(String number  : split){
               if(Integer.parseInt(number) > bignumber){
                  bignumber = Integer.parseInt(number);
               }
            }
            System.out.println(bignumber);
        }
    }
    public static void showPeople(String[] strings3){
        String[] people = strings3[1].split("-");
//        String[] onePo


//        int = {"", "", "", "", "", "", "", ""};
//        String[] twoPoints = {"", "", "", "", "", "", "", ""};
        ArrayList<String> twoPoints = new ArrayList<>();

        String[] threePoints = {"", "","", "", "", ""};
        int onePointCounter = 0;
        int threePointsCounter = 0;
        String name = people[0];
        int age = Integer.parseInt(people[1]);
        String hobby = people[2];


        String gender = people[3];
        String country = people[4];

        for(String string : strings3){
            int counter = 0;
            String[] split = string.split("-");
            if(!gender.equals(split[3])) {
                System.out.println(hobby);
                if(hobby.contains("&")){


                    String[] hobbies = hobby.split("&");
                    for(int i = 0; i < hobbies.length;  i++){
                        if(hobbies[i].equals("music")){
                            System.out.println(people[0]);
                        }
                    }

                }
                else if(split[2].equals("music")){
                    counter++;
                }

                if(country.toLowerCase().equals(split[4].toLowerCase())){
                    counter++;
                }
                if(age - Integer.parseInt(split[1]) > -5 &&
                   age - Integer.parseInt(split[1]) < 5) {
                    counter++;
                }


            }
            if (counter == 1) {
//                onePoint[onePointCounter] = split[0];
                onePointCounter++;
            }
            if (counter == 2) {
                twoPoints.add(split[0]);
            }
            if (counter == 3) {
                threePoints[threePointsCounter] = split[0];
                threePointsCounter++;

            }


        }
        for(String namethree :threePoints ){
            if(namethree.length() >= 1){
            System.out.println(" 3 point: " + namethree);
        }
        }

        for(String nameTwo : twoPoints){
            if(nameTwo.length() >= 1){
            System.out.println(" 2 point: " + nameTwo);
        }}
//        for(String nameOne : onePoint){
//            if(nameOne.length() >= 1){
//            System.out.println(" 1 point: " + nameOne);
//        }}

    }
}



//s t u d e n t s
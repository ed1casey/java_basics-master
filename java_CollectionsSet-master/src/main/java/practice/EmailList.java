package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmailList {

    TreeSet<String> emailList = new TreeSet<>();
    String emailRegex = "[a-zA-Z0-9.]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    public void add(String email) {
        if (!email.matches(emailRegex)) {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        } else if (emailList.contains(email.toLowerCase())) {
            System.out.println("Такой email уже добавлен");
        } else {
            emailList.add(email.toLowerCase());
            System.out.println("Email добавлен");
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(emailList);
    }

}

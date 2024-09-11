package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело" + todo);
    }

    public void add(int index, String todo) {
        if (index >= 0 && index <= todoList.size()) {
            todoList.add(index, todo);
            System.out.println("Добавлено дело" + todo + " под номером " + index);
        } else {
            todoList.add(todo);
            System.out.println("Добавлено дело" + todo);
        }
    }

    public void edit(int index, String todo) {
        if (index >= 0 && index <= todoList.size()) {
            System.out.print("Дело" + todoList.get(index));
            todoList.set(index, todo);
            System.out.println(" заменено на " + todo);
        } else {
            System.out.println("Дело с таким номером нельзя заменить");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index <= (todoList.size())) {
            System.out.println("Удалено дело -" + todoList.get(index));
            todoList.remove(index);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public ArrayList<String> getTodos() {
        return todoList;
    }

    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < todoList.size(); i++) {
            sb.append(i).append(" -").append(todoList.get(i)).append("\n");
        }
        return sb.toString();
    }
}
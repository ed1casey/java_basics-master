package practice;

import practice.TodoList;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean isOpen = true;

        Scanner scanner = new Scanner(System.in);

        TodoList todoList = new TodoList();


        while (isOpen) {

            String command = scanner.nextLine();

            String[] parts = command.split("\\s+", 2); // Разделяем команду и остальную часть строки

            String action = parts[0];


            switch (action) {

                case "LIST" -> System.out.println(todoList.list());

                case "ADD" -> {

                    if (parts.length > 1) {

                        String[] addParts = parts[1].split("\\s+", 2); // Разделяем индекс (если есть) и само дело

                        try {

                            int index = Integer.parseInt(addParts[0]);

                            if (addParts.length > 1) {

                                String todo = addParts[1];

                                todoList.add(index, todo);

                            } else {

                                System.out.println("Необходимо указать дело после индекса.");

                            }

                        } catch (NumberFormatException e) {

                            String todo = parts[1];

                            todoList.add(todo);

                        }

                    } else {

                        System.out.println("Необходимо указать дело для добавления.");

                    }

                }

                case "EDIT" -> {

                    if (parts.length > 1) {

                        String[] editParts = parts[1].split("\\s+", 2);

                        try {

                            int index = Integer.parseInt(editParts[0]);

                            if (editParts.length > 1) {

                                String todo = editParts[1];

                                todoList.edit(index, todo);

                            } else {

                                System.out.println("Необходимо указать дело для редактирования.");

                            }

                        } catch (NumberFormatException e) {

                            System.out.println("Необходимо указать индекс для редактирования.");

                        }

                    } else {

                        System.out.println("Необходимо указать индекс и дело для редактирования.");

                    }

                }

                case "DELETE" -> {

                    if (parts.length > 1) {

                        try {

                            int index = Integer.parseInt(parts[1]);

                            todoList.delete(index);

                        } catch (NumberFormatException e) {

                            System.out.println("Необходимо указать правильный индекс для удаления.");

                        }

                    } else {

                        System.out.println("Необходимо указать индекс для удаления.");

                    }

                }

                case "EXIT" -> isOpen = false;

                default -> System.out.println("Неизвестная команда.");

            }

        }

    }

}


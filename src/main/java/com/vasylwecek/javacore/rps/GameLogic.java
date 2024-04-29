package rps;

import java.util.Random;
import java.util.Scanner;
public class GameLogic implements Game {
    private Random random = new Random();

    private static final String[] Choice = {"камень", "ножницы", "бумага"};
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {
        String playAgain;
        do {
            System.out.println("Игра Камень-Ножницы-Бумага");
            System.out.print("Выберите камень, ножницы или бумага: ");
            String playerChoice = scanner.nextLine();
            client(playerChoice);

            System.out.println("Хотите сыграть еще раз? (да/нет): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("да"));

        System.out.println("Спасибо за игру!");
        scanner.close();
    }

    @Override
    public void client(String playerInput) {
        Field gameField = new Field();
        gameField.setPlayerChoice(playerInput);

        String computerChoice = generateComputerChoice();
        gameField.setComputerChoice(computerChoice);

        System.out.println("Компьютер выбрал: " + computerChoice);
        String result = determineWinner(playerInput, computerChoice);
        System.out.println(result);
    }

    public String generateComputerChoice(){
        int index = random.nextInt(Choice.length);
        return Choice[index];
    }

    public String determineWinner(String playersChoice, String computerChoice) {
        if (playersChoice.equals(computerChoice)) {
            return "Ничья!";
        }

        switch (playersChoice){
            case "камень":
                return (computerChoice.equals("ножницы") ? "Пользователь выиграл!" : "Компьютер выиграл!");
            case "ножницы":
                return (computerChoice.equals("бумага") ? "Пользователь выиграл!" : "Компьютер выиграл!" );
            case "бумага":
                return (computerChoice.equals("ножницы") ? "Пользователь выиграл!" : "Компьютер выиграл!" );
            default:
                return "Неверный ввод.";
        }
    }

}


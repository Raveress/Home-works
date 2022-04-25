package homework4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    final static int SIZE = 3;

    final static char DOT_EMPTY = '•';
    final static char DOT_HUMAN = 'X';
    final static char DOT_AI = 'O';

    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    final static char[][] MAP = new char[SIZE][SIZE];

    final static String FIRST_HEADER_SYMBOL = "☻";
    final static String SPACE_MAP = "  ";

    static int turnsCount = 0;
    static int lastTurnColumn = 0;
    static int lastTurnRow = 0;

    public static void main(String[] args) {
        turnGame();


    }

    private static void turnGame() {
        do {
            initMap();
            printMap();
            playGame();
        } while (isContinueGame());
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(FIRST_HEADER_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }

        //возврат в начало
    }

    private static void humanTurn() {
        System.out.println("ХОД ЧЕЛОВЕКА");

        int rowNumber;
        int columnNumber;

        while (true) {
            rowNumber = in.nextInt() - 1;
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("Ячейка с координатами %d:%d уже занята%n", rowNumber + 1, columnNumber + 1);
        }


        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
        lastTurnRow++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nУРА!!! ВЫ ПОБЕДИЛИ!");
            } else {
                System.out.println("\nВосстание машин близко!!!Победил компьютер!");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }

        return false;
    }

    private static boolean checkWin(char symbol) {
        
        return true;
    }







    private static boolean checkDraw() {
        return turnsCount >= SIZE * SIZE;
    }

    private static void aiTurn() {
        System.out.println("ХОД КОМПЬЮТЕРА");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);

        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
        lastTurnRow++;

    }

    private static boolean isContinueGame() {
        System.out.println("Resume? y\\n");
        return switch (in.next()){
            case "y", "+", "да", "конечно" -> true;
            default -> false;
        };
    }
}

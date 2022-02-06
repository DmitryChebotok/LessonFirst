package HomeWorkApp.lesson_fourth;

import javax.naming.SizeLimitExceededException;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int currentMoveX = 0;
    public static int currentMoveY = 0;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        int x, y, repeats;
        // тут магия
        // проверка линии
        repeats = 0;
        for (int i = 0; i < SIZE; i++) {
            if(map[currentMoveY][i] == symb){
                repeats = repeats + 1;
            }else{
                repeats = 0;
            }
            if(repeats == DOTS_TO_WIN){
                return true;
            }
        }
        // проверка колонки
        repeats = 0;
        for (int i = 0; i < SIZE; i++) {
            if(map[i][currentMoveX] == symb){
                repeats = repeats + 1;
            }else{
                repeats = 0;
            }
            if(repeats == DOTS_TO_WIN){
                return true;
            }
        }
        // проверка диагоналей
        // Диагональ сверху вниз
        // найдем координаты крайней точки
        x = currentMoveY;
        y = currentMoveX;
        while(x != 0 && y != 0){
            x--;
            y--;
        }
        repeats = 0;
        while (x < SIZE && y < SIZE){
            if(map[x][y] == symb){
                repeats = repeats + 1;
            }else{
                repeats = 0;
            }
            if(repeats == DOTS_TO_WIN){
                return true;
            }
            x++;
            y++;
        }

        // Диагональ снизу вверх
        // найдем координаты крайней точки
        x = currentMoveY;
        y = currentMoveX;
        while(x != 0 && y != 0 && x < SIZE - 1){
            x++;
            y--;
        }
        repeats = 0;
        while (x >= 0 && y < SIZE){
            if(map[x][y] == symb){
                repeats = repeats + 1;
            }else{
                repeats = 0;
            }
            if(repeats == DOTS_TO_WIN){
                return true;
            }
            x--;
            y++;
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean winningMove(char symb){

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(!isCellValid(j, i)){
                    continue;
                }
                currentMoveX = j;
                currentMoveY = i;

                map[currentMoveY][currentMoveX] = symb;
                boolean win = checkWin(symb);
                map[currentMoveY][currentMoveX] = DOT_EMPTY;
                if (win) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void aiTurn() {
        do {
            if(winningMove(DOT_O)){
                break;
            }
            if(winningMove(DOT_X)){
                break;
            }
            currentMoveX = rand.nextInt(SIZE);
            currentMoveY = rand.nextInt(SIZE);
        } while (!isCellValid(currentMoveX, currentMoveY));
        System.out.println("Компьютер походил в точку " + (currentMoveX + 1) + " " + (currentMoveY + 1));
        map[currentMoveY][currentMoveX] = DOT_O;
    }

    public static void humanTurn() {
        do {
            System.out.println("Введите координаты в формате X Y");
            currentMoveX = sc.nextInt() - 1;
            currentMoveY = sc.nextInt() - 1;
        } while (!isCellValid(currentMoveX, currentMoveY)); // while(isCellValid(x, y) == false)
        map[currentMoveY][currentMoveX] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


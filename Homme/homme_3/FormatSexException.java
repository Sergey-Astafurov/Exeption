package Homme.homme_3;

public class FormatSexException extends RuntimeException {
    public FormatSexException() {
        super("Введите корректное значение пола (m-муж, f-жен)");
    }
}

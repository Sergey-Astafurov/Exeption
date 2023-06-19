package Homme.homme_3;

public class PhoneNumberException extends RuntimeException {
    public PhoneNumberException() {
        super("Вы ввели некорректный номер телефона! Образец: 89601471122");
    }
}

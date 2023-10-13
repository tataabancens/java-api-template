package ar.juarce.models.dtos;

public record ErrorDto(String message) {

    public static ErrorDto fromErrorMsg(String message) {
        return new ErrorDto(message);
    }
}

public class Message {

    private static String text;

    private static Double number;

    static final String INPUT_TEXT = "Hello world";

    public Message(String text) {
        this.text = text;
    }

    public Message(Double number) {
        this.number = number;
    }

    public static String getText() {
        return text;
    }
    public static Double getNumber() {
        return number;
    }

    public void setText(String inputText) {
       this.text = inputText;
    }

    public static void printMessage(String input) {
        Message message = new Message(input);
        System.out.println(message.getText());
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("123");
        System.out.println(Message.INPUT_TEXT);
        System.out.println(MessageService.getText());
        System.out.println(RandomNumber.getRandomDoubleNumberByRange(0.1, 0.5));
        Message message = new Message(RandomNumber.getRandomDoubleNumberByRange(0.1, 0.5));
        System.out.println(message.getNumber());
        Message textMessage = new Message(RandomNumber.getRandomDoubleNumberByRange(0.1, 0.5));
//        Message message = new Message(RandomNumber.getRandomDoubleNumberByRange(0.1,0.5));
        System.out.println(new Message(RandomNumber.getRandomDoubleNumberByRange(0.1, 0.5)).getNumber());
        Message.printMessage("123456");
        Double number = RandomNumber.getRandomDoubleNumberByRange(0.1, 0.5);
        Message.printMessage(number.toString());
    }
}
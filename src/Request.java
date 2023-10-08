public class Request {
    private Integer id;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

//    public DbData getData(String functionName) {
////     запрос к бд
////        Request request = new Request("function_name");
//
//    }
}

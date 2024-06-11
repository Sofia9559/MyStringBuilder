public class Main {
    public static void main(String[] args){
        MyStringBuilder builder = new MyStringBuilder();
        builder.append("Hello").append(" ,friends").append("!");
        System.out.println(builder);
        builder.undo();
        builder.undo();
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        builder.undo();
        System.out.println(builder);
    }
}

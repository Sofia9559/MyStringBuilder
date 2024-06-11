public class DeleteAction implements Action {
    private int size;

    public DeleteAction(int size) {
        this.size = size;
    }

    public void undo() {
        stringBuilder.delete(
                stringBuilder.length() - size, stringBuilder.length());
    }

    private StringBuilder stringBuilder;
}

public class aplikasiTodoList {
    public static String[] model = new String[10];

    public static void main(String[] args) {

    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + "." + todo);
            }
        }

    }

    /**
     * Menambahkan todo ke list
     */
    public static void addTodoList() {

    }

    /**
     * Menghapus todo dari list
     */
    public static void removeTodoList() {

    }
}

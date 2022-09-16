public class aplikasiTodoList {
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }

    }

    public static void testShowTodoList() {
        model[0] = "belajar java";
        model[1] = "Pt.matajari mitra solusi";
        showTodoList();
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

public class aplikasiTodoList {
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testAddTodoList();
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
    public static void addTodoList(String todo) {
        //cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                //model masih ada yg kosong
                isFull = false;
                break;
            }
        }

        //jika penuh, kita resize ukuran array nya 2x lipat
        if (isFull) {
            var temp = model;
            model = new String [model.length*2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        //tambahkan ke posisi yang data array nya NULL
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 23; i++) {
            addTodoList("Contoh Todo List ke- " + i );
        }
        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number) {
        if ((number) >= model.length){
            return false;
        } else if (model [number-1] == null) {
            return false;
        } else {
            model [number - 1] = null;
            return true;
        }
    }
}

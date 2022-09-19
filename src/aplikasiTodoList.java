import com.sun.jdi.IntegerValue;

import java.util.Objects;

public class aplikasiTodoList {
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        testViewAddTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        System.out.println("=> TODOLIST <=");
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
            for (int i = (number - 1); i < model.length; i++) {
                if ( i == (model.length - 1)) {
                    model [i] = null;
                } else {
                    model[i] = model[ i + 1 ];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result =removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    /**
     * Menampilkan view Todo List
     */

    public static void viewShowTodoList() {
        while (true) {
            showTodoList();
            System.out.println("MENU: ");
            System.out.println("1). Tambah");
            System.out.println("2). Hapus");
            System.out.println("x). keluar");

            var input = input ("pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodolist();
            } else if (input.equals("x")) {
                break;
            } else if (input.equals("X")) {
                break;
            } else {
                System.out.println("Pilihan tidak ada");
            }
        }
    }

    public static void testViewShowTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        viewShowTodoList();
    }

    /**
     * View menambahkan todo list
     */

    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("todo (x) jika batal");

        if (todo.equals("x")) {
            //Batal
        }else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("satu");
        addTodoList("dua");

        viewAddTodoList();
        showTodoList();
    }

    /**
     * View menghapus todo list
     */
    public  static  void viewRemoveTodolist() {
        System.out.println("MENGHAPUS TODO LIST");
        var number = input ("Nomer yg di hapus (x jika batal)");

        if (number.equals("x")) {
            //Batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("gagal menghapus todo list no : " + number);
            }
        }
    }
}
